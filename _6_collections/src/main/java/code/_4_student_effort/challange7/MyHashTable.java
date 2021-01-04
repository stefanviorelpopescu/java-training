package code._4_student_effort.challange7;

import java.util.ArrayList;
import java.util.Hashtable;

public class MyHashTable<K, V> implements IMyHashTable<K, V> {
    private static class HashNode<K, V> {
        K key;
        V value;

        public HashNode(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "HashNode{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    ArrayList<HashNode<K, V>> list = new ArrayList<>();

    @Override
    public V get(K key) {
        for (HashNode<K, V> node : list) {
            if (node.key == key) {
                return node.value;
            }
        }
        return null;
    }

    @Override
    public void put(K key, V value) {
        list.add(new HashNode<>(key, value));
    }

    @Override
    public void remove(K key) {
        list.removeIf(node -> key == node.key);
    }

    @Override
    public boolean containsKey(K key) {
        for (HashNode<K, V> node : list) {
            if (node.key == key) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public String toString() {
        return "MyHashTable{" +
                "list=" + list +
                '}';
    }
}

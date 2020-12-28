package code._4_student_effort;

import java.util.HashMap;
import java.util.Map;

public class MyHashTableImplementation<K,V> implements MyHashTable<K,V> {

    private Map<K, V> map = new HashMap<>();

    @Override
    public V get(K key) {
        return map.get(key);
    }

    @Override
    public void put(K key, V value) {
        map.put(key,value);
    }

    @Override
    public void remove(K key) {
        map.remove(key);
    }

    @Override
    public boolean containsKey(K key) {
        return map.containsKey(key);
    }

    @Override
    public int size() {
        return map.size();
    }

    public static void main(String[] args) {
        MyHashTableImplementation<String, Integer> myHashTable = new MyHashTableImplementation();

        myHashTable.put("key1", 1);
        myHashTable.put("key2", 2);

        System.out.println(myHashTable.size());



    }
}

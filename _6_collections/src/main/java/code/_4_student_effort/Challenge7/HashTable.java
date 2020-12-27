package code._4_student_effort.Challenge7;


import java.util.HashMap;
import java.util.Map;

public class HashTable<K, V> implements MyHashTable<K, V>{

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
}

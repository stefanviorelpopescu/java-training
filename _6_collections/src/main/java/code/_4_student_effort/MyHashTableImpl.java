package code._4_student_effort;

import java.util.HashMap;

public class MyHashTableImpl<K, V> implements MyHashTable{
    HashMap<Object, Object> hm = new HashMap<>();
    @Override
    public Object get(Object key) {
        return hm.get(key);
    }

    @Override
    public void put(Object key, Object value) {
        hm.put(key, value);
    }

    @Override
    public void remove(Object key) {
        hm.remove(key);
    }

    @Override
    public boolean containsKey(Object key) {
        return hm.containsKey(key);
    }

    @Override
    public int size() {
        return hm.size();
    }
}

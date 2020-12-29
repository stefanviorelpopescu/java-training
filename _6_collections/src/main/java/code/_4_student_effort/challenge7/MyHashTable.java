package code._4_student_effort.challenge7;

public interface MyHashTable<K, V> {
    V get(K key);

    void put(K key, V value);

    V remove(K key);

    boolean containsKey(K key);

    int size();
}

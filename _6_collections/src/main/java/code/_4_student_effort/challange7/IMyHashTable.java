package code._4_student_effort.challange7;

public interface IMyHashTable<K, V> {
    V get(K key);

    void put(K key, V value);

    void remove(K key);

    boolean containsKey(K key);

    int size();
}

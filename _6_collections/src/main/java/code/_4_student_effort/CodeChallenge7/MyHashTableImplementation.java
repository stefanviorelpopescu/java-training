package code._4_student_effort.CodeChallenge7;

public class MyHashTableImplementation<K, V> implements MyHashTable<K, V>  {

    private Object[] elements = new Object[10000000];
    private int nrElements = 0;

    @Override
    public V get(K key) {
        return (V) this.elements[key.hashCode()];
    }

    @Override
    public void put(K key, V value) {
        this.elements[key.hashCode()] = value;
        nrElements++;
    }

    @Override
    public void remove(K key) {
        this.elements[key.hashCode()] = null;
    }

    @Override
    public boolean containsKey(K key) {
        return this.elements[key.hashCode()] != null;
    }

    @Override
    public int size() {
        return nrElements;
    }
}

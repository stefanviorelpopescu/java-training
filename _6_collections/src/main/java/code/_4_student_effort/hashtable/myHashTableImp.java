package code._4_student_effort.hashtable;

public class myHashTableImp<K,V> implements MyHashTable<K,V> {
    Object[] values = new Object[Integer.MAX_VALUE/100];
    int nrOfValues = 0;

    @Override
    public V get(K key) {
        return (V) values[key.hashCode()];
    }

    @Override
    public void put(K key, V value) {
        this.values[key.hashCode()] = value;
        nrOfValues++;
    }

    @Override
    public void remove(K key) {
        this.values[key.hashCode()] = null;
    }

    @Override
    public boolean containsKey(K key) {
      return   values[key.hashCode()]!=null ? true : false;
    }

    @Override
    public int size() {
        return nrOfValues;
    }
}
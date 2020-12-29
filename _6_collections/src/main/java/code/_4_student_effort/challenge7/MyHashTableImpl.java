package code._4_student_effort.challenge7;

import java.util.ArrayList;

public class MyHashTableImpl<K, V> implements MyHashTable<K,V> {

    //private Object[] values = new Object[];
    private ArrayList<Element<K, V>> values;
    private int nrOfElements; // capacity of array list
    private int size; // current size of array list

    public MyHashTableImpl(int nrOfElements) {
        this.nrOfElements = nrOfElements;
        size = 0;
        values = new ArrayList<>();

        for(int i = 0; i < nrOfElements; i++) {
            values.add(null);
        }
    }

    private int getBucketIndex(K key)
    {
        int hashCode = key.hashCode();
        int index = hashCode % nrOfElements;
        return index;
    }


    @Override
    public V get(K key) {
        // Find head of chain for given key
        int bucketIndex = getBucketIndex(key);
        Element<K, V> head = values.get(bucketIndex);

        // Search key in chain
        while (head != null)
        {
            if (head.key.equals(key))
                return head.value;
            head = head.next;
        }

        // If key not found
        return null;
    }

    @Override
    public void put(K key, V value) {
        // Find head of chain for given key
        int bucketIndex = getBucketIndex(key);
        Element<K, V> head = values.get(bucketIndex);

        // Check if key is already present
        while (head != null)
        {
            if (head.key.equals(key))
            {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert key in chain
        size++;
        head = values.get(bucketIndex);
        Element<K, V> newNode = new Element<>(key, value);
        newNode.next = head;
        values.set(bucketIndex, newNode);

        // If load factor goes beyond threshold, then
        // double hash table size
        if ((1.0*size)/nrOfElements >= 0.7)
        {
            ArrayList<Element<K, V>> temp = values;
            values = new ArrayList<>();
            nrOfElements = 2 * nrOfElements;
            size = 0;
            for (int i = 0; i < nrOfElements; i++)
                values.add(null);

            for (Element<K, V> headNode : temp)
            {
                while (headNode != null)
                {
                    put(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    @Override
    public V remove(K key) {
        // Apply hash function to find index for given key
        int bucketIndex = getBucketIndex(key);

        // Get head of chain
        Element<K, V> head = values.get(bucketIndex);

        // Search for key in its chain
        Element<K, V> prev = null;
        while (head != null)
        {
            // If Key found
            if (((Element<K, V>) head).key.equals(key))
                break;

            // Else keep moving in chain
            prev = head;
            head = ((Element<K, V>) head).next;
        }

        // If key was not there
        if (head == null)
            return null;

        // Reduce size
        size--;

        // Remove key
        if (prev != null)
            prev.next = head.next;
        else
            values.set(bucketIndex, head.next);

        return head.value;
    }

    @Override
    public boolean containsKey(K key) {
        return (key.hashCode() % nrOfElements) != 0;
    }

    @Override
    public int size() {
        return size;
    }
}

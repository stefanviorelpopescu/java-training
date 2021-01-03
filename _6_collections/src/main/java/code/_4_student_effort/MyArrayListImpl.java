package code._4_student_effort;

import java.util.Collection;

public class MyArrayListImpl<T> implements MyArrayList{

    /** operating array */
    private Object[] values;

    /** array size */
    private int size;

    /** default saze of the collection */
    private final static int DEFAULT_SIZE = 10;

    /** default size of the collection */
    private int arraySize = DEFAULT_SIZE;

    /**
     * Constructor
     */
    public MyArrayListImpl() {
        values = new Object[DEFAULT_SIZE];
    }

    /**
     * Constructor
     * @param c collection from which new collection will be created
     */
    public MyArrayListImpl(Collection<? extends T> c) {
        if (c.size() > 0) {
            values = c.toArray();
            size = values.length;
            arraySize = size;
            resize();
        }
    }

    /**
     * Constructor
     * @param initialCapasity initial capasity of the collektion
     */
    public MyArrayListImpl(int initialCapasity) {
        values = new Object[initialCapasity];
    }

    /**
     * Returns size of the collection
     * @return size
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Add object to the collection
     * @param object object
     */
    @Override
    public void add(Object object) {
        resize();
        values[size] = object;
        size++;
    }

    /**
     * Add object to the collection
     * @param index index for inserting ibject
     * @param object object
     */
    public void add(T object, int index) {
        resize();
        System.arraycopy(values, index, values, index + 1, size - index);
        values[index] = object;
        ++size;
    }

    /**
     * Clears the collection
     */
    public void clear() {
        for (int i = 0; i < size; i++) {
            values[i] = null;
        }
        size = 0;
    }

    /**
     * Check containing of the object in the collection
     * @param o object
     * @return true if object belongs to the collection and false otherwise
     */
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    /**
     * Return object by the index
     * @param index object index
     * @return object by the index
     */
    public Object get(int index) {
        if (index < size && index >= 0) {
            return values[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public void set(int index, Object e) {

    }

    /**
     * Index in the cillection if object
     * @param o object
     * @return index of object
     */
    public int indexOf(Object o) {
        for (int i = 0; i < size; i++) {
            if (values[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    /**
     *
     * @param o object
     * @return lat index of this object
     */
    public int lastIndexOf(Object o) {
        if (o == null) {
            for (int i = size - 1; i >= 0; i--) {
                if (values[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = size - 1; i >= 0; i--) {
                if (o.equals(values[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    /**
     * Remove the object from the collection
     * @param index index of object
     */
    public void remove(int index) {
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(values, index + 1, values, index, size - index - 1);
        values[--size] = null;
        resize();
    }

    /**
     * Remove object from the collection
     * @param o object must be remover from the collection
     */
    @Override
    public void remove(Object o) {
        int index = indexOf(o);
        if (index >= 0) {
            System.arraycopy(values, index + 1, values, index, size - index - 1);
            size--;
            values[size] = null;
        }
    }

    /**
     *
     * @param o object that must be seted
     * @param index index of object in the array
     * @return old value of object
     */
    public Object set(Object o, int index) {
        if (index >= size) {
            throw new IndexOutOfBoundsException();
        }
        Object oldObject = values[index];
        values[index] = o;
        return oldObject;
    }

    /**
     * Convert collection into the array
     * @return array of objects
     */
    public Object[] toArray() {
        Object[] newArray = new Object[size];
        System.arraycopy(values, 0, newArray, 0, size);
        return newArray;
    }

    /**
     * Resize current array
     */
    private void resize() {
        if (size >= arraySize) {
            Object[] newValues = new Object[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = newValues;
        }
        if (size >= DEFAULT_SIZE && size < arraySize / 4) {
            Object[] newValues = new Object[size * 3 / 2 + 1];
            System.arraycopy(values, 0, newValues, 0, size);
            values = newValues;
        }
    }
}

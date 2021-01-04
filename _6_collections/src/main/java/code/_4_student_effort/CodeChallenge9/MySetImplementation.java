package code._4_student_effort.CodeChallenge9;

public class MySetImplementation<T> implements MySet<T> {

    Object[] elements = new Object[100000];
    int nrElements = 0;
    int removedObjects = 0;

    @Override
    public void add(T e) throws SetException {
        if (!this.contains(e)) {
            this.elements[nrElements++] = e;
        } else {
            throw new SetException("Element is already in the set");
        }
    }

    @Override
    public void remove(T e) throws SetException {
        if (this.contains(e)) {
            for (Object object : this.elements) {
                if (object.equals(e)) {
                    object = null;
                    removedObjects++;
                }
            }
        } else {
            throw new SetException("Element is not in the set");
        }
    }

    @Override
    public T get(int index) throws SetException {
        if (index < nrElements && this.elements[index] != null) {
            return (T) this.elements[index];
        } else {
            throw new SetException("Out of index");
        }
    }

    @Override
    public void set(int index, T e) throws SetException {
        if (!contains(e)) {
            this.elements[index] = e;
        } else {
            throw new SetException("Cannot set this value, it already exists in the set");
        }
    }

    @Override
    public int size() {
        return nrElements - removedObjects;
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < nrElements; i++) {
            if (this.elements[i] != null) {
                if (this.elements[i].equals(e)) {
                    return true;
                }
            }
        }
        return false;
    }
}

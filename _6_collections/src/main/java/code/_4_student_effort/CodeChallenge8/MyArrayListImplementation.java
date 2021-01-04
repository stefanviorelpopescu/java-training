package code._4_student_effort.CodeChallenge8;

public class MyArrayListImplementation<T> implements MyArrayList<T> {

    private Object[] elements = new Object[100000];
    private int nrElements = 0;
    private int removedElements = 0;

    @Override
    public void add(T e) {
        this.elements[nrElements] = e;
        nrElements++;
    }

    @Override
    public void remove(T e) {
        for(Object object : this.elements) {
            if(object.equals(e)) {
                object = null;
                removedElements--;
            }
        }
    }

    @Override
    public T get(int index) {
        if(index < nrElements && this.elements[index] != null){
            return (T) this.elements[index];
        } else {
            System.out.println("Index out of bounds");
            return null;
        }

    }

    @Override
    public void set(int index, T e) {
        if(index < nrElements) {
            this.elements[index] = e;
        } else {
            System.out.println("Index out of bounds");
        }

    }

    @Override
    public int size() {
        return nrElements - removedElements;
    }
}

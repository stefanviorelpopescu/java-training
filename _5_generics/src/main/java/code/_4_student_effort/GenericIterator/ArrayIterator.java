package code._4_student_effort.GenericIterator;

public class ArrayIterator<T> implements  IArrayIterator{
    private T[] arr;
    private int contor=0;

    public ArrayIterator(T[] arr) {
        this.arr=arr;
    }

    @Override
    public boolean hasNext() {
        return arr.length>contor;
    }

    @Override
    public T next() {
        return arr[contor++];
    }
}

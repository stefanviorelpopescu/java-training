package code._4_student_effort;

public class ArrayIterator<T> implements IArrayIterator<T> {

    private T[] arr;
    private int index=0;
    public ArrayIterator(T[] arr) {
        this.arr=arr;
    }

    @Override
    public boolean hasNext() {
        if(index< arr.length) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public T next() {
        return arr[index++];
    }
}

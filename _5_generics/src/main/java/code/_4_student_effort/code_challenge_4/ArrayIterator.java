package code._4_student_effort.code_challenge_4;

public class ArrayIterator<T> implements IArrayIterator<T> {

    private T[]  arr;
    private int index;

    public ArrayIterator(T[] arr) {
        this.arr = arr;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < arr.length;
    }

    @Override
    public T next() {
        return arr[index++];
    }
}

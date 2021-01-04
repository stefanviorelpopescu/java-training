package code._4_student_effort;

public class ArrayIterator<T> implements IArrayIterator<T> {
    private T[] arrayData;
    private int next_pos;

    public ArrayIterator(T[] arrayData) {
        this.arrayData = arrayData;
    }

    @Override
    public boolean hasNext() {
        return next_pos<arrayData.length;
    }

    @Override
    public T next() {
        return arrayData[next_pos++];
    }
}

package code._4_student_effort.generic_iterator;

public class ArrayIterator<T> implements IArrayIterator<T> {

    private int index;
    private T[] list;

    public ArrayIterator(T[] e) {
        index = -1;
        list = e;
    }

    @Override
    public boolean hasNext() {
        return index + 1 < list.length;
    }

    @Override
    public T next() {
        return list [++index];
    }
}

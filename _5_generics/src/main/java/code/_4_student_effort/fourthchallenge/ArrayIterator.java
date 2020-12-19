package code._4_student_effort.fourthchallenge;

public class ArrayIterator<T> implements IArrayIterator<T> {

    int index;
    T[] arrayToIterateOn;

    public ArrayIterator(T[] arr) {
        index = 0;
        this.arrayToIterateOn = arr;
    }

    @Override
    public boolean hasNext() {
        return index < arrayToIterateOn.length;
    }

    @Override
    public T next() {
        return arrayToIterateOn[index++];
    }
}

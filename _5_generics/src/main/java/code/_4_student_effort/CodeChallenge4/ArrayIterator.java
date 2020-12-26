package code._4_student_effort.CodeChallenge4;

public class ArrayIterator<T> implements IArrayIterator<T>{

    T[] array;
    int currentPosition;

    public ArrayIterator(T[] paramArray) {
        this.array = paramArray;
        this.currentPosition = 0;
    }

    @Override
    public boolean hasNext() {

        if(currentPosition  < array.length) {
            currentPosition ++;
            return true;
        }

        return false;
    }

    @Override
    public T next() {
        return array[currentPosition - 1];
    }
}

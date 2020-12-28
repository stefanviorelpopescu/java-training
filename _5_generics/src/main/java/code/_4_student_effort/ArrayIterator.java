package code._4_student_effort;

import java.util.Arrays;
import java.util.List;

public class ArrayIterator<T> implements IArrayIterator<T> {
    private T[] arrayData;
    int nextPosition;

    private List<T> listData;

    ArrayIterator(T[] arr) {
        arrayData = Arrays.copyOf(arr, arr.length);
    }

    // TODO
    ArrayIterator(IGenericList<T> headList) {
        // ???
        IGenericNode<T> node = (IGenericNode<T>) headList;
        while (node.getNext() != null) {
            listData.add(node.getValue());
            node = node.getNext();
        }
    }

    @Override
    public boolean hasNext() {
        return nextPosition < arrayData.length;
    }

    @Override
    public T next() {
        return arrayData[nextPosition++];
    }
}
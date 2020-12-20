package code._4_student_effort.challenge4;

import code._4_student_effort.challenge3.GenericNode;
import code._4_student_effort.challenge3.GenericList;

public class ArrayIterator<T> implements IArrayIterator<T> {
    // stage 1 version
    /*    private final T[] arr;
    private int currentIndex = 0;

    public ArrayIterator(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < arr.length;
    }

    @Override
    public T next() {
        return arr[currentIndex++];
    }*/

    // stage 2 version
    private final GenericList<T> arr;
    private GenericNode<T> currentNode;

    public ArrayIterator(T[] arr) {

        this.arr = new GenericList<T>(arr[0]);

        for(int i = 1; i < arr.length; i++) {
            this.arr.insert(arr[i]);
        }
        this.currentNode = this.arr.getRootNode();
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public T next() {
        T value = this.currentNode.getValue();
        this.currentNode = (GenericNode<T>) this.currentNode.getNext();
        return value;
    }
}

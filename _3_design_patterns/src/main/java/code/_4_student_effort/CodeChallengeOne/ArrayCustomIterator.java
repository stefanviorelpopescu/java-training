package code._4_student_effort.CodeChallengeOne;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayCustomIterator implements Iterator {
    private int[] arr;
    private int currentIndex;

    public ArrayCustomIterator(int arr[]) {
        this.arr = arr;
        this.currentIndex = 0;
    }

    public boolean hasNext() {
        return this.currentIndex < this.arr.length;
    }
    @Override
    public Integer next() {
        if(!hasNext())
        {
            throw new NoSuchElementException();
        }return this.arr[this.currentIndex++];
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it=new ArrayCustomIterator(arr);
        it.forEachRemaining(System.out::println);
    }
}

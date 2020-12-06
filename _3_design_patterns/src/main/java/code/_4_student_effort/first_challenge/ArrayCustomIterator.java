package _4_student_effort.first_challenge;

import java.util.Iterator;

public class ArrayCustomIterator {

    private int[] arr;
    private int currIndex;

    public ArrayCustomIterator(int arr[]) {
        this.arr = arr;
        currIndex = 0;
    }

    public boolean hasNext() {
        return currIndex < arr.length;
    }

    public int next() {
        return arr[currIndex++];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

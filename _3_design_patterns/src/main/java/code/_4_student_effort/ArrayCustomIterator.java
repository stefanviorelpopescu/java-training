package code._4_student_effort;

import java.util.Arrays;

public class ArrayCustomIterator {
    int [] arrayData;
    int nextPosition;

    boolean hasNext() {
        return (nextPosition < arrayData.length);
    }

    int next() {
        return arrayData[nextPosition++];
    }

    public ArrayCustomIterator(int[] arr) {
        arrayData = Arrays.copyOf(arr, arr.length);
    }

    public static void main(String []args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

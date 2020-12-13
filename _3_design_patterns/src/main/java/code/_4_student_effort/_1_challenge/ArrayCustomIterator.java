package code._4_student_effort._1_challenge;

/* Desgign Pattern : implementarea unui iterator pe o lista iterabila */

import java.util.Arrays;

public class ArrayCustomIterator {

    int [] arrayData;
    int nextPosition;

    public ArrayCustomIterator(int[] arr) {
        arrayData = Arrays.copyOf(arr, arr.length);
    }

    boolean hasNext() {
        return nextPosition < arrayData.length;
    }
    int next() {
        return arrayData[nextPosition++];
    }
}

package code._4_student_effort;

import java.util.Arrays;

public class ArrayCustomIterator {
    int[] arrayData;
    int nextPosition;

    public ArrayCustomIterator(int[]arr){
        arrayData = Arrays.copyOf(arr,arr.length);
    }
    boolean hasNext(){
        return nextPosition < arrayData.length;
    }
    int next(){
        return arrayData[nextPosition++];
    }
}

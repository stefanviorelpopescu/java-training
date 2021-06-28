package code._4_student_effort;

import java.util.Arrays;

public class Merge implements Strategy {

    @Override
    public void sort(Integer[] list) {
    if (list.length < 2 ){
        return;
    }

    int m = list.length / 2;
    Integer[] left= Arrays.copyOfRange(list, 0, m);
    Integer[] right= Arrays.copyOfRange(list, m, list.length);

    sort(left);
    sort(right);

    }

    private void merge(Integer[] left, Integer[] right, Integer[] list){
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        while(leftIndex < left.length && rightIndex < right.length){
            if(left[leftIndex].compareTo(right[rightIndex]) < 0) {
                list[listIndex++] = left[leftIndex];
            }else {
                list[listIndex++] = right[rightIndex];
            }
        }
        while (leftIndex < left.length){
            list[listIndex++] = left[leftIndex];
        }
            while (rightIndex < right.length){
                list[listIndex++] = right[rightIndex];

        }
        merge(left, right, list);
    }

}

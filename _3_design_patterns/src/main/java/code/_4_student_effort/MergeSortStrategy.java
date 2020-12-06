package code._4_student_effort;

import java.util.Arrays;

public class MergeSortStrategy implements SortingStrategy{

    public void sort(Integer[] list) {
        if (list.length < 2) {
            return;
        }
        int middle = list.length / 2;
        //create left subarray
        Integer[] left = Arrays.copyOfRange(list, 0, middle);
        //create right subarray
        Integer[] right = Arrays.copyOfRange(list, middle, list.length);

        //sort both subarray and call merge
        sort(left);
        sort(right);
        merge(left, right, list);
    }

    private void merge(Integer[] left, Integer[] right, Integer[] list) {
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) < 0) {
                list[listIndex++] = left[leftIndex++];
            } else {
                list[listIndex++] = right[rightIndex++];
            }
        }
        while (leftIndex < left.length) {
            list[listIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            list[listIndex++] = right[rightIndex++];
        }
    }
}

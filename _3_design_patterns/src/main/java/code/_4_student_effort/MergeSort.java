package code._4_student_effort;

import java.util.Arrays;

public class MergeSort implements SortingStrategy {

    public void sort(Integer[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        Integer[] left = Arrays.copyOfRange(arr, 0, mid);
        Integer[] right = Arrays.copyOfRange(arr, mid, arr.length);

        sort(left);
        sort(right);
        merge(left, right, arr);
    }

    private void merge(Integer[] left, Integer[] right, Integer[] arr) {
        int leftIndex = 0;
        int rightIndex = 0;
        int listIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) < 0) {
                arr[listIndex++] = left[leftIndex++];
            } else {
                arr[listIndex++] = right[rightIndex++];
            }
        }
        while (leftIndex < left.length) {
            arr[listIndex++] = left[leftIndex++];
        }
        while (rightIndex < right.length) {
            arr[listIndex++] = right[rightIndex++];
        }
    }
}

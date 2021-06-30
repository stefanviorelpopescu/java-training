package code._4_student_effort.strategy;

import java.util.Arrays;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(Integer[] array) {
        if (array.length < 2) {
            return;
        }

        int size = array.length;
        int middle = size / 2;
        Integer[] left = Arrays.copyOfRange(array, 0, middle);
        Integer[] right = Arrays.copyOfRange(array, middle, array.length);
        sort(left);
        sort(right);
        merge(array, left, right);
    }

    private void merge(Integer[] arr, Integer[] left, Integer[] right) {
        int leftSize = left.length;
        int rightSize = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftSize && j < rightSize) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < leftSize) {
            arr[k++] = left[i++];
        }
        while (j < rightSize) {
            arr[k++] = right[j++];
        }

    }
}


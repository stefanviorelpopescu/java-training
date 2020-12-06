package _4_student_effort.second_challenge;

import java.util.Arrays;

public class MergeSort implements SortingStrategy{

    private int left, right;
    @Override
    public void sort(Integer[] list) {
        mergeSort(list, 0, list.length - 1);
    }

    private void mergeSort(Integer[] arr, int left, int right) {
        if (left < right) {
            int middle = (right - left) / 2 + left;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, right, middle);
        }
    }

    void merge(Integer[] arr, int left, int right, int middle) {
        Integer[] Left = Arrays.copyOfRange(arr, left, middle + 1);
        Integer[] Right = Arrays.copyOfRange(arr, middle + 1, right + 1);

        int i = 0, j = 0;
        int k = left;
        while (i < Left.length && j < Right.length) {
            if (Left[i] <= Right[j]) {
                arr[k] = Left[i];
                i++;
            }
            else {
                arr[k] = Right[j];
                j++;
            }
            k++;
        }

        while (i < Left.length) {
            arr[k] = Left[i];
            i++;
            k++;
        }

        while (j < Right.length) {
            arr[k] = Right[j];
            j++;
            k++;
        }
    }
}

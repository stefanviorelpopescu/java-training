package code._4_student_effort;

import java.util.Arrays;

public class MergeSort implements SortingStrategy{

    @Override
    public void sort(Integer[] list) {
        if (list.length >= 2) {
            int mij = list.length / 2;

            Integer[] left = Arrays.copyOfRange(list, 0, mij);
            Integer[] right = Arrays.copyOfRange(list, mij, list.length);

            sort(left);
            sort(right);

            merge(list, left, right);
        }
    }
    private void merge(Integer[] list, Integer[] left, Integer[] right) {
        int indexLeft = 0;
        int indexRight = 0;
        int indexList = 0;

        while (indexLeft < left.length && indexRight < right.length) {
            if (left[indexLeft] <= right[indexRight]) {
                list[indexList] = left[indexLeft];
                indexLeft++;
            }
            else {
                list[indexList] = right[indexRight];
                indexRight++;
            }
            indexList++;
        }

        while (indexLeft < left.length) {
            list[indexList] = left[indexLeft];
            indexLeft++;
            indexList++;
        }

        while (indexRight < right.length) {
            list[indexList] = right[indexRight];
            indexRight++;
            indexList++;
        }
    }
}

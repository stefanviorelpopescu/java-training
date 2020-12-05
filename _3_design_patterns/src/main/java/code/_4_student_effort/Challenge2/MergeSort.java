package code._4_student_effort.Challenge2;

import code._4_student_effort.Challenge2.SortingStrategy;

public class MergeSort implements SortingStrategy {

    @Override
    public void sort(Integer[] list) {

        if (list.length<2) {
            return;
        }

        int mid = list.length/2;
        Integer [] left = new Integer[mid];
        Integer [] right = new Integer[list.length - mid];

        for (int i=0;i<mid;i++) {
            left[i] = list[i];
        }

        for (int i=mid;i<list.length;i++) {
            right[i-mid] = list[i];
        }

        sort(left);
        sort(right);

        merge(list,left,right);
    }

    private void merge(Integer[] list, Integer[] left, Integer[] right) {
        int i=0, j=0, k=0;

        while (i < left.length && j <right.length) {
            if (left[i] <= right[j]) {
                list[k++] = left[i++];
            } else {
                list[k++] = right[j++];
            }
        }

        while (i<left.length) {
            list[k++] = left[i++];
        }
        while (j<right.length) {
            list[k++] = right[j++];
        }

    }
}

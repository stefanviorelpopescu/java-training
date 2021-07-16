package code._4_student_effort.Challenge2;

import java.util.Arrays;

public class MergeSort implements SortingStrategy {

    private void merge(Integer[] l, Integer[] r, Integer[] list) {
        int listIdx = 0;
        int rightIdx = 0;
        int leftIdx = 0;

        while (listIdx < l.length && rightIdx < r.length) {
            if (l[listIdx] < r[rightIdx]) {
                list[leftIdx++] = l[listIdx++];
            } else {
                list[leftIdx++] = r[rightIdx++];
            }
        }

        while (listIdx < l.length) {
            list[leftIdx++] = l[listIdx++];
        }

        while (rightIdx < r.length) {
            list[leftIdx++] = r[rightIdx++];
        }
    }

    @Override
    public void sort(Integer[] list) {
        int length = list.length;
        if(length > 2) {
            int m = length / 2;
            Integer[] l = Arrays.copyOfRange(list, 0, m);
            Integer[] r = Arrays.copyOfRange(list, m, length);

            sort(l);
            sort(r);

            merge(l, r, list);
        }
    }
}

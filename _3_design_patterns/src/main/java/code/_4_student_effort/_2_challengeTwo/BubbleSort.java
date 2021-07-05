package code._4_student_effort._2_challengeTwo;

import java.util.ArrayList;

public class BubbleSort implements SortingStrategy {
    @Override
    public void sort(int[] a) {
        int temp;
        boolean swapped;
        for (int i = 0; i < a.length; i++) {
            swapped = false;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

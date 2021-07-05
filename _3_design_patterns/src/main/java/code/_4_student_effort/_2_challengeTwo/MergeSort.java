package code._4_student_effort._2_challengeTwo;

import java.util.ArrayList;

public class MergeSort implements SortingStrategy {
    @Override
    public void sort(int[] a) {
        int left = 0;
        int right = a.length - 1;
        int middle = (a.length + 1) / 2;
        if( a.length > 1 ){
            int[] leftPart = new int[middle - left];
            int[] rightPart = new int[right - (middle - 1) ];
            for (int i = 0; i < middle; i++) {
                leftPart[i] = a[i];
            }
            for(int j = middle; j <= right; j++){
                rightPart[j - middle] = a[j];
            }
            sort(leftPart);
            sort(rightPart);
//            int[] b = new int[leftPart.length + rightPart.length];
            int i = 0; int j = 0; int k = 0;
            while (j < leftPart.length && k < rightPart.length) {
                if (leftPart[j] < rightPart[k]) {
                    a[i] = leftPart[j];
                    i++;
                    j++;
                } else {
                    a[i] = rightPart[k];
                    i++;
                    k++;
                }
            }
            while (j < leftPart.length) {
                a[i] = leftPart[j];
                i++;
                j++;
            }
            while (k < rightPart.length) {
                a[i] = rightPart[k];
                i++;
                k++;
            }
        }
    }
}

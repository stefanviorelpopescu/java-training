package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BubbleSortStrategy implements SortingStrategy {

    public void sort(Integer[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i].compareTo(list[j]) > 0) {
                    Collections.swap(Arrays.asList(list),i,j);
                }
            }
        }
    }
}

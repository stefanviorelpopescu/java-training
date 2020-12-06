package code._4_student_effort;

import java.util.Arrays;
import java.util.Collections;

public abstract class TemplateMethodBubbleSort {
    void sort(Integer[] list) {
        for (int i = 0; i < list.length; i++)
            for (int j = 0; j < list.length; j++) {
                if (numbersInCorrectOrder(list[i], list[j])) {
                    Collections.swap(Arrays.asList(list), i, j);
                }
            }
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}

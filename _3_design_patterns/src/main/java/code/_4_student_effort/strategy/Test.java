package code._4_student_effort.strategy;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(array, array.length);
        Integer[] copy02OfArr = Arrays.copyOf(array, array.length);
        displaySorted(new BubbleSort(), copy01OfArr);
        displaySorted(new MergeSort(), copy02OfArr);
    }

    public static void displaySorted(SortingStrategy strategy, Integer[] array) {
        strategy.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

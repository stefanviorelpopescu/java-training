package code._4_student_effort.Challenge2;

import code._2_challenge._2_strategy.BubleSort;
import code._2_challenge._2_strategy.MergeSort;
import code._2_challenge._2_strategy.SortingStrategy;

import java.util.Arrays;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubleSort(), copy01OfArr);
        displaySorted(new MergeSort(), copy02OfArr);
    }

    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {

        strategy.sort(arr);

        for (int arrIdx = 0; arrIdx < arr.length; arrIdx++) {
            System.out.print(arr[arrIdx] + "\t");
        }
        System.out.println();
    }

}

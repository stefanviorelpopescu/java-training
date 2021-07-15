package code._4_student_effort.Challenge2;

import code._2_challenge._2_strategy.BubleSort;
import code._2_challenge._2_strategy.MergeSort;
import code._2_challenge._2_strategy.SortingStrategy;

import java.util.Arrays;

public class StrategyExemple {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        System.out.println("Bublesort:");
        displaySorted(new BubleSort(), copy01OfArr);
        System.out.println("MergeSort:");
        displaySorted(new MergeSort(), copy02OfArr);
    }

    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}

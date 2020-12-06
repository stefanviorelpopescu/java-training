package code._4_student_effort._2_challenge_strategy;

import java.util.Arrays;

public class Main {
    //Declaration for text output color//
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void CodeChallenge2(){
        Integer[] arr = new Integer[] { 1, 4, 5 ,2 ,3, 6 ,9, 8, 7, 10, 14, 20, 35, 77};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubleSortStrategy(), copy01OfArr);
        displaySorted(new MergeSortStrategy(), copy02OfArr);
    }

    private static void displaySorted(SortingStrategy sortingStrategy, Integer[] arr) {
        sortingStrategy.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String[] args) {
        System.out.println(ANSI_RED + "---- Code Challenge 2 ----" + ANSI_RESET);
        CodeChallenge2();
    }
}

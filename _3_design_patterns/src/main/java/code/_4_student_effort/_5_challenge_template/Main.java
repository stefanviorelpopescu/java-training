package code._4_student_effort._5_challenge_template;

import java.util.Arrays;

public class Main {
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void CodeChallenge5(){
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy01OfArr);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy02OfArr);

        displaySorted(copy01OfArr);
        displaySorted(copy02OfArr);
    }

    public static void displaySorted(Integer[] arr){
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "---- Code Challenge 5 ----" + ANSI_RESET);
        CodeChallenge5();
    }
}
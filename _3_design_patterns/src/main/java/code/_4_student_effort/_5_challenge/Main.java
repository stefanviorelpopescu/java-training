package code._4_student_effort._5_challenge;

import java.util.Arrays;

public class Main {

    public static void CodeChallenge5() {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy01OfArr);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy02OfArr);

        System.out.println("Ascending sort:");
        displaySorted(copy01OfArr);
        System.out.println("Descending sort:");
        displaySorted(copy02OfArr);
    }

    private static void displaySorted(Integer[] arr) {
        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CodeChallenge5();
    }
}

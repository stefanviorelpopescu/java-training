package code._4_student_effort._2_challenge;

import java.util.Arrays;

public class Main {

    private static void displaySorted(SortingStrategy sortingStrategy, Integer[] arr) {
        sortingStrategy.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void CodeChallenge2(){
        Integer[] arr = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSortStrategy(), copy01OfArr);
        displaySorted(new MergeSortStrategy(), copy02OfArr);
    }

    public static void main(String[] args) {
        System.out.println("=== Output for Challenge 2 ===");
        CodeChallenge2();
    }
}

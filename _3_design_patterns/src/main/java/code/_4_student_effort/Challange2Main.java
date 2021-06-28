package code._4_student_effort;


import code._4_student_effort.Strategy;
import java.util.Arrays;

public class Challange2Main{

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);

        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new Buble(), copy01OfArr);

        displaySorted(new Merge(), copy02OfArr);
    }
    public static void displaySorted(Strategy strategy, Integer[] arr) {
        strategy.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

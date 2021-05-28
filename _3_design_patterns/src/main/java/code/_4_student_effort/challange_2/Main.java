package code._4_student_effort.challange_2;

import java.util.Arrays;


public class Main {

    public static void displaySorted(SortingStrategy strategy, Integer[] arr){
        strategy.sort(arr);

        for(Integer i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy1 = Arrays.copyOf(arr, arr.length);
        Integer[] copy2 = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubbleSort(), copy1);
        displaySorted(new MergeSort(), copy2);
    }
}

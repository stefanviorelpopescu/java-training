package code._4_student_effort.CodeChallengeTwo;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubleSort(), copy01OfArr);
        displaySorted(new MergeSort(), copy02OfArr);
    }

    private static void displaySorted(SortingStrategy s, Integer[] arr) {
    s.sort(arr);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]+" ");
        System.out.println("///////// ");
    }


}

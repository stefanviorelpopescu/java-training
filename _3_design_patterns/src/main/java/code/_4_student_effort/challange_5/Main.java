package code._4_student_effort.challange_5;

import java.util.Arrays;

public class Main {
    public static void displaySorted(Integer[] list){
        for(Integer i : list){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8 ,7};
        Integer[] copy1 = Arrays.copyOf(arr, arr.length);
        Integer[] copy2 = Arrays.copyOf(arr, arr.length);

        AscBubleSort asc = new AscBubleSort();
        asc.sort(copy1);
        DescBubleSort desc = new DescBubleSort();
        desc.sort(copy2);

        displaySorted(copy1);
        displaySorted(copy2);


    }
}

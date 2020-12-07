package code._4_student_effort.template_method;

import code._2_challenge._5_template_method.AscBubleSort;
import code._2_challenge._5_template_method.DescBubleSort;

import java.util.Arrays;

public class Main {
    public static void main(String [] args){
        Integer[] arr = new Integer[]{1,4,5,2,3,6,9,8,7};
        Integer[] copy010fArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy020fArr = Arrays.copyOf(arr,arr.length);

        AscBubleSort asc = new AscBubleSort();
        asc.sort(copy010fArr);
        DescBubleSort desc = new DescBubleSort();
        desc.sort(copy020fArr);

        displaySorted(copy010fArr);
        displaySorted(copy020fArr);
    }
    private static void displaySorted (Integer[] list){
        for (Integer e : list) {

            System.out.print(e+ " ");
        }
        System.out.println();
    }
}

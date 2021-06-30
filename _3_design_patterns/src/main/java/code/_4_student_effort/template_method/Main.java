package code._4_student_effort.template_method;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArray = Arrays.copyOf(array, array.length);
        Integer[] copy02OfArray = Arrays.copyOf(array, array.length);

        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy01OfArray);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy02OfArray);

        displaySorted(copy01OfArray);
        displaySorted(copy02OfArray);
    }

    public static void displaySorted(Integer[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }

        System.out.println();
    }
}

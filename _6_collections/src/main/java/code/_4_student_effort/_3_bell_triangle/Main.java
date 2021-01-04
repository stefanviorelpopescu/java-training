package code._4_student_effort._3_bell_triangle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "----Code Challenge 3----" + ANSI_RESET );

        int noOfLines = 6;
        List<List<Integer>> bellTriangle = printBell(noOfLines);
        displayBell(bellTriangle,noOfLines);
    }

    public static List<List<Integer>> printBell(int lines) {
        List<List<Integer>> bellTriangle = new ArrayList<>();
        bellTriangle.add(Collections.singletonList(1));

        for (int i = 1; i < lines; i++) {
            List<Integer> upperRow = bellTriangle.get(i-1);
            List<Integer> currentRow = new ArrayList<>();
            currentRow.add(upperRow.get(i-1));

            for (int j = 1; j <= i; j++) {
                currentRow.add(upperRow.get(j-1) + currentRow.get(j-1));
            }

            bellTriangle.add(currentRow);
        }
        return bellTriangle;
    }


    public static void displayBell (List<List<Integer>> bellTriangle, int noOfLines ) {
        for (int line = 0; line < noOfLines; line ++) {
            List<Integer> currentLine = bellTriangle.get(line);


            for (Integer integer : currentLine) {
                System.out.print(integer + "  ");
            }
            System.out.println();
        }
    }
}

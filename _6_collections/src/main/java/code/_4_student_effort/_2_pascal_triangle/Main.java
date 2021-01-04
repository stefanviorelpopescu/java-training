package code._4_student_effort._2_pascal_triangle;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "----Code Challenge 2----" + ANSI_RESET );

        int noOfLines = 9;
        List<List<Integer>> pascalTriangle = printPascal(noOfLines);
        displayPascal(pascalTriangle,noOfLines);
    }

    public static List<List<Integer>> printPascal(int lines) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();
        pascalTriangle.add(Collections.singletonList(1));

        for (int i = 1; i < lines; i++) {
            pascalTriangle.add(new ArrayList<>());
            pascalTriangle.get(i).add(1);

            for (int j = 1; j < i; j++) {
                int left = pascalTriangle.get(i - 1).get(j);
                int right = pascalTriangle.get(i - 1).get(j - 1);
                pascalTriangle.get(i).add(left + right);
            }
            pascalTriangle.get(i).add(1);
        }
        return pascalTriangle;
    }

    //The whole purpose of spaces is for the triangle design//
    public static void displayPascal (List<List<Integer>> pascalTriangle, int noOfLines ) {
        int spaces = noOfLines;
        for (int line = 0; line < noOfLines; line ++) {
            List<Integer> currentLine = pascalTriangle.get(line);

            for (int space = 0; space < spaces; space++) {
                System.out.print(" ");
            }
            spaces--;

            for (Integer integer : currentLine) {
                System.out.print(integer + "  ");
            }
            System.out.println();
        }
    }
}

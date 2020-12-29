package code._4_student_effort.challenge6;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class MatrixSpiralMain {
    public static void main(String[] args) {
        int size = 4;
        List<List<Integer>> matrix = new ArrayList<>(asList(asList(1, 2, 3, 4),
                asList(5, 6, 7, 8), asList(9, 10, 11, 12), asList(13, 14, 15, 16)));

        spiralPrint(matrix, size, 0, 0);
    }

    private static void spiralPrint(List<List<Integer>> matrix, int size, int i, int j) {
        if (i >= size || j >= size) {
            return;
        }

        // first row
        for (int a = i; a < size; a++) {
            System.out.print(matrix.get(i).get(a) + " ");
        }

        // last column
        for (int a = i + 1; a < size; a++) {
            System.out.print(matrix.get(a).get(size - 1) + " ");
        }

        // print last row if last and first row are not the same
        if ((size - 1) != i) {
            for (int a = size - 2; a >= j; a--) {
                System.out.print(matrix.get(size - 1).get(a) + " ");
            }
        }

        // print last column if last and first column are not the same
        if ((size - 1) != j) {
            for (int a = size - 2; a > i; a--) {
                System.out.print(matrix.get(a).get(j) + " ");
            }
        }
        spiralPrint(matrix, size - 1, i + 1, j + 1);
    }
}

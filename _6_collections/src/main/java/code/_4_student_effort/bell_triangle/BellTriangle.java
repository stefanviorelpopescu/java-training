package code._4_student_effort.bell_triangle;

import java.util.*;
import java.util.stream.Collectors;

public class BellTriangle {
    public static void main(String[] args) {
        List<Integer> previousRow = new ArrayList<>();
        previousRow.add(1);

        buildBellTriangle(previousRow, 10);
    }

    private static void buildBellTriangle(List<Integer> previousRow, int rows) {
        System.out.print(previousRow.get(0)+"\n");
        List<Integer> currentRow = new ArrayList<>();
        for(int i = 1; i < rows; i++) {
            currentRow.add(previousRow.get(previousRow.size()-1));
            for( int j = 0; j < i; j++)
            currentRow.add(previousRow.get(j)+currentRow.get(j));
            for(Integer integer : currentRow)
                System.out.print(integer + " ");
            previousRow = currentRow.stream().collect(Collectors.toList());
            currentRow.clear();
            System.out.println();
        }
    }
}

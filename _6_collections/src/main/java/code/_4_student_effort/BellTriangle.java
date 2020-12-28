package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;


public class BellTriangle {

    public static List<List<Integer>> generateBellNumbers(int n) {

        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(asList(1));

        for (int i = 1; i < n; i++) {
            List<Integer> previousLevel = triangle.get(i - 1);
            List<Integer> currentLevel = new ArrayList<>();
            currentLevel.add(previousLevel.get(i - 1));
            for (int j = 1; j <= i; j++) {
                currentLevel.add(currentLevel.get(j - 1) + previousLevel.get(j - 1));
            }

            triangle.add(currentLevel);
        }
        return triangle;
    }

    public static void main(String[] args) {

        List<List<Integer>> triangle = generateBellNumbers(7);

        for (List<Integer> row : triangle) {
            for (Integer cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }


}

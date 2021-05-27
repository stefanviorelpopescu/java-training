package code._4_student_effort;

import java.util.ArrayList;

public class PairOf3 {
    public static void main(String[] args) {
        System.out.println(numberOfPairs(new int[]{-1, -1, -1, 2}));
        System.out.println(numberOfPairs(new int[]{4, 5, 6, 3, 0, 0, -2, 3, 0, -1}));
    }

    public static int numberOfPairs(int[] array) {
        int pairs = 0;
        ArrayList<Integer> positions = new ArrayList<>(array.length);
        boolean visited;
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = i + 1; j < array.length - 1; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    visited = false;
                    if (positions.contains(i) || positions.contains(j) || positions.contains(k)) {
                        visited = true;
                    }

                    if (array[i] + array[j] + array[k] == 0 && !visited) {
                        pairs++;
                        positions.add(i);
                        positions.add(j);
                        positions.add(k);
                        break;
                    }
                }
            }
        }
        return pairs;
    }
}



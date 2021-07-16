package code._4_student_effort;

import java.util.LinkedList;
import java.util.List;

public class Challenge3 {
    static int PairOf2(int[] array) {
        List<Integer> aux = new LinkedList<Integer>();
        int numberOfPairs = 0;

        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                if(array[i] + array[j] == 0) {
                    if(!aux.contains(i) && !aux.contains(j)) {
                        ++numberOfPairs;
                        aux.add(i);
                        aux.add(j);
                    }
                }
            }
        }
        return numberOfPairs;
    }

    static void run() {

        System.out.print("#############  Start Challenge #3   ############# \n");
        int[] array1 = {3, 2, -3, -2, 3, 0};
        int[] array2 = {1, 1, 0, -1, -1};
        int[] array3 = {5, 9, -5, 7, -5};
        System.out.println("[3, 2, -3, -2, 3, 0] => " + PairOf2(array1));
        System.out.println("[1, 1, 0, -1, -1]    => " + PairOf2(array2));
        System.out.println("[5, 9, -5, 7, -5]    => " + PairOf2(array3));
        System.out.print("#############  End Challenge #3   ############# \n");
    }
}

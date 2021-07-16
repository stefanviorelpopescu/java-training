package code._4_student_effort;

import java.util.LinkedList;
import java.util.List;

public class Challenge4 {
    static int PairOf3(int[] array) {
        List<Integer> aux = new LinkedList<Integer>();
        int numberOfPairs = 0;

        for(int i = 0; i < array.length; i++) {
            for(int j = i+1; j < array.length; j++) {
                for(int k = j+1; k < array.length; k++) {
                    if(array[i] + array[j] + array[k] == 0) {
                        if(!aux.contains(i) && !aux.contains(j) && !aux.contains(k)) {
                            ++numberOfPairs;
                            aux.add(i);
                            aux.add(j);
                            aux.add(k);
                        }
                    }
                }
            }
        }
        return numberOfPairs;
    }

    static void run() {

        System.out.print("#############  Start Challenge #4   ############# \n");
        int[] array = {-1, -1, -1, 2};
        System.out.println("[-1, -1, -1, 2] => " + PairOf3(array));
        System.out.print("#############  End Challenge #4   ############# \n");
    }
}

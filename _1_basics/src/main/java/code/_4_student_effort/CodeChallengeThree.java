package code._4_student_effort;

import java.util.ArrayList;

public class CodeChallengeThree {

    Integer pairsOf2WithoutCollections(int[] noArray) {
        int numberOfPairs = 0;
        int[] numbersInPairs = new int[noArray.length];
        int indexedPairs = 0;

        for (int i = 0; i <= noArray.length - 3; i++) {
            for (int j = i + 1; j <= noArray.length - 2; j++) {
                boolean pairsExisting = false;
                for (int k = 0; k < indexedPairs; k++) {
                    if (numbersInPairs[k] == i || numbersInPairs[k] == j) {
                        pairsExisting = true;
                        break;
                    }
                }
                if (!pairsExisting && (noArray[i] + noArray[j] == 0)) {
                    numbersInPairs[indexedPairs++] = i;
                    numbersInPairs[indexedPairs++] = j;
                    numberOfPairs++;
                    break;
                }
            }
        }
        return numberOfPairs;
    }

    Integer pairsOf2WithCollections(ArrayList<Integer> array) {
        int numberOfPairs = 0;
        for (int i = 0; i < array.size() - 1 ; i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if (array.get(i) + array.get(j) == 0) {
                    numberOfPairs += 1;
                    array.remove(i);
                    array.remove(j);
                }
            }
        }
        return numberOfPairs;
    }
}

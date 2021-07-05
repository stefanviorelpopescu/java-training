package code._4_student_effort;

import java.util.ArrayList;

public class CodeChallengeFour {

    Integer pairsOf3WithoutCollections(int[] noArray) {
        int numberOfPairs = 0;
        int[] numbersInPairs = new int[noArray.length];
        int indexedPairs = 0;

        for (int i = 0; i <= noArray.length - 3; i++) {
            for (int j = i + 1; j <= noArray.length - 2; j++) {
                for (int n = j + 1; n <= noArray.length - 1; n++) {
                    boolean pairsExisting = false;
                    for (int k = 0; k < indexedPairs; k++) {
                        if (numbersInPairs[k] == i || numbersInPairs[k] == j || numbersInPairs[k] == n) {
                            pairsExisting = true;
                            break;
                        }
                    }
                    if (!pairsExisting && (noArray[i] + noArray[j] + noArray[n] == 0)) {
                        numbersInPairs[indexedPairs++] = i;
                        numbersInPairs[indexedPairs++] = j;
                        numbersInPairs[indexedPairs++] = n;
                        numberOfPairs++;
                        break;
                    }
                }
            }
        }
        return numberOfPairs;
    }

    Integer pairsOf3WithCollections(ArrayList<Integer> array) {
        int numberOfPairs = 0;
        String exception = "";
        for (int i = 0; i < array.size() - 2; i++) {
            for (int j = i + 1; j < array.size() - 1; j++) {
                for (int k = j + 1; k < array.size(); k++) {
                    try {
                        if (array.get(i) + array.get(j) + array.get(k) == 0) {
                            numberOfPairs += 1;
                            array.remove(i);
                            array.remove(j);
                            array.remove(k);
                        }
                    } catch (IndexOutOfBoundsException e) {
                        exception += "List was iterated until it's no more long enough to be verified. The result is:";
                    }
                }
            }
        }
        System.out.println(exception);
        return numberOfPairs;
    }
}

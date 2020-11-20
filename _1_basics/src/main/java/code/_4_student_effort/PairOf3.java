package code._4_student_effort;

public class PairOf3 {
    static public Integer countPairsOf3(Integer[] numbers /*deleted sum variable*/)
    { //create new function, make it static
        // to access it without instances

        Integer pairs = 0;
        Integer[] indexesIncludedInPairs = new Integer[numbers.length];
        int nrOfIndexesIncludedInPairs = 0;
        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    boolean indexesIncludedInOtherPairs = false;
                    for (int p = 0; p < nrOfIndexesIncludedInPairs; p++) {
                        if (indexesIncludedInPairs[p] == i || indexesIncludedInPairs[p] == j || indexesIncludedInPairs[p] == k) {
                            indexesIncludedInOtherPairs = true;
                        }
                    }
                    if (!indexesIncludedInOtherPairs && (numbers[i] + numbers[j] + numbers[k] == 0)) {
                        indexesIncludedInPairs[nrOfIndexesIncludedInPairs++] = i;
                        indexesIncludedInPairs[nrOfIndexesIncludedInPairs++] = j;
                        indexesIncludedInPairs[nrOfIndexesIncludedInPairs++] = k;
                        pairs++;
                        //System.out.println(numbers[i] + " + " + numbers[j] + " + " + numbers[k] + " = " + sum);
                        break;
                    }
                }
            }
        }
        return pairs;
    }
}

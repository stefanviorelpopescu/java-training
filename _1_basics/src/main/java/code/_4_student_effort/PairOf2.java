package code._4_student_effort;

    public class PairOf2 {
        static public Integer countPairsOf2(Integer[] numbers) {   //create new function, make it static
                                                             // to access it without instances
            Integer pairs = 0;
            Integer[] indexesIncludedInPairs = new Integer[numbers.length];
            int nrOfIndexesIncludedInPairs = 0;

            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = i + 1; j < numbers.length; j++) {
                    boolean indexesIncludedInOtherPairs = false;
                    for (int k = 0; k < nrOfIndexesIncludedInPairs; k++) {
                        if (indexesIncludedInPairs[k] == i || indexesIncludedInPairs[k] == j) {
                            indexesIncludedInOtherPairs = true;
                            break;
                        }
                    }
                    if (!indexesIncludedInOtherPairs && (numbers[i] + numbers[j] == 0)) {
                        indexesIncludedInPairs[nrOfIndexesIncludedInPairs++] = i;
                        indexesIncludedInPairs[nrOfIndexesIncludedInPairs++] = j;
                        pairs++;
                        //System.out.println(numbers[i] + " + " + numbers[j] + " = " + 0);
                        break;
                    }
                }
            }
            return pairs;
        }

    }


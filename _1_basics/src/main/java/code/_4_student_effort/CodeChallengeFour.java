package code._4_student_effort;

import java.util.ArrayList;

public class CodeChallengeFour {
    public Integer RunCodeChallengeFour(Integer[] array) {
        Integer nrOfPairs = 0;
        boolean weHavePair;
        ArrayList<Integer> indexesIncluded = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for(int k=j+1;k<array.length;k++){
                weHavePair = false;
                for (Integer item : indexesIncluded)
                    if (item == i || item == j || item == k)
                        weHavePair = true;


                if (!weHavePair && (array[i] + array[j]+array[k]) == 0) {
                    indexesIncluded.add(i);
                    indexesIncluded.add(j);
                    indexesIncluded.add(k);
                    nrOfPairs++;
                    break;
                }
            }
        }
        }
        return nrOfPairs;
    }
    }


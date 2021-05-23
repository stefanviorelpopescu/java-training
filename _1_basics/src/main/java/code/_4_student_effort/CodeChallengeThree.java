package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Math.abs;

public class CodeChallengeThree {

    public Integer RunCodeChallengeThree(Integer[] array) {
//        int numberOfPairs=0; TODO: tried with arraylist, can't iterate two times over the same array
//        HashMap<Integer,Integer> pairs=new HashMap<>();
//
//        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(array));
//
//
//        for(Integer el1:arr)
//            for(Integer el2:arr)
//                if(el1!=el2)
//                    if((el1+el2)==0) {
//                        pairs.put(arr.indexOf( el1),arr.indexOf(el2));
//                        arr.remove(el1);
//                        arr.remove(el2);
//                        numberOfPairs++;
//                    }
//        System.out.println(numberOfPairs);
//        for (Integer item:pairs.keySet())
//            System.out.println(item+":"+pairs.get(item));
//        for(Integer item:arr)
//            System.out.println(item+":"+arr.indexOf(item));
        Integer nrOfPairs = 0;
        boolean weHavePair;
        ArrayList<Integer> indexesIncluded = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                weHavePair = false;
                for (Integer item : indexesIncluded)
                    if (item == i || item == j)
                        weHavePair = true;
                if (!weHavePair && array[i] + array[j] == 0) {
                    indexesIncluded.add(i);
                    indexesIncluded.add(j);
                    nrOfPairs++;
                    break;
                }
            }
        }
        return nrOfPairs;
    }
}

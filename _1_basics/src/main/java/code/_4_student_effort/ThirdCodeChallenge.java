package code._4_student_effort;

import java.util.HashMap;
import java.util.Map;

public class ThirdCodeChallenge {

    public static Integer pairOfTwo(Integer[] array) {
        Integer nrPerechi = 0;
        Map<Integer, Integer> mappedArray = new HashMap<>(); // key = array value, value = number of appearances
        // adding array elements to hashmap
        for (Integer value : array) {
            if (!mappedArray.containsKey(value)) // entry does not exist, add it
                mappedArray.put(value, 1);
            else
                mappedArray.replace(value, mappedArray.get(value) + 1); // entry already exists, increase
            // number of appearances
        }

        for (Integer integer : array) {
            // dealing with the '0' case
            if (integer == 0) {
                if (mappedArray.get(integer) == 2) {
                    mappedArray.remove(integer); // remove both 0 entries
                    nrPerechi++;
                } else if (mappedArray.get(integer) > 2) {
                    mappedArray.put(integer, mappedArray.get(integer) - 2); // remove 2 entries
                    nrPerechi++;
                }
                continue; // just skip the next part
            }
            if (mappedArray.containsKey(integer) && mappedArray.containsKey(-integer)) {
                // check to see if both the complement and the number are available to form a pair
                if (mappedArray.get(integer) == 1) // only 1 element with that value
                    mappedArray.remove(integer);
                else
                    mappedArray.put(integer, mappedArray.get(integer) - 1);
                if (mappedArray.get(-integer) == 1) // only 1 element with that value
                    mappedArray.remove(-integer);
                else
                    mappedArray.put(-integer, mappedArray.get(-integer) - 1);

                nrPerechi++;
            }
        }

        return nrPerechi;
    }
}

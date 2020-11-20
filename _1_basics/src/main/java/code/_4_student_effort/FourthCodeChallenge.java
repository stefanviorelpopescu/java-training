package code._4_student_effort;

import java.util.HashMap;
import java.util.Map;

public class FourthCodeChallenge {

    static class WrapInt{

        WrapInt() {}

        WrapInt(int value) {
            this.value = value;
        }
        public Integer value;
    }

    public static Map<Integer, Integer> buildMap (Integer[] array) {
        Map<Integer, Integer> mappedArray = new HashMap<>(); // key = array value, value = number of appearances
        // adding array elements to hashmap
        for (Integer value : array) {
            if (!mappedArray.containsKey(value)) // entry does not exist, add it
                mappedArray.put(value, 1);
            else
                mappedArray.replace(value, mappedArray.get(value) + 1); // entry already exists, increase
            // number of appearances
        }
        return mappedArray;
    }

    public static boolean cornerCase(Map<Integer, Integer> mappedArray, Integer num1, Integer num2, WrapInt nrPerechi) {
        if (num1.equals(num2)) {
            if (mappedArray.get(num2) == 2) {
                mappedArray.remove(num2);
                nrPerechi.value++;
            }
            else if (mappedArray.get(num2) > 2) {
                mappedArray.put(num2, mappedArray.get(num2) - 2);
                nrPerechi.value++;
            }
            else
                return true;
            // removing the third number
            if (mappedArray.get(-num1 - num2) == 1) // only 1 element with that value
                mappedArray.remove(-num1 - num2);
            else
                mappedArray.put(-num1 - num2, mappedArray.get(-num1 - num2) - 1);
            return true;
        }
        return false; // is not corner case
    }

    public static Integer pairOfTwo(Integer[] array) {
        Map<Integer, Integer> mappedArray = buildMap(array);
        WrapInt nrPerechi = new WrapInt(0);

        for (int i = 0; i < array.length; i++) {

            if (mappedArray.containsKey(array[i])) {
                Integer currInteger = mappedArray.get(array[i]);
                // searching for 2 number to add to currInteger
                for (int j = 0; j < array.length; j++) {
                    if (i != j && mappedArray.containsKey(array[j]) && mappedArray.containsKey(- array[i] - array[j])) {
                        // triple equality corner case
                        if (array[j].equals(-array[i] - array[j]) && array[j].equals(array[i])) {
                            if (mappedArray.get(array[j]) == 3) {
                                mappedArray.remove(array[j]);
                                nrPerechi.value++;
                            }
                            else if (mappedArray.get(array[j]) > 3) {
                                mappedArray.put(array[j], mappedArray.get(array[j]) - 3);
                                nrPerechi.value++;
                            }
                            continue;
                        }

                        boolean isCorner;
                        isCorner = cornerCase(mappedArray, array[j], -array[i] - array[j], nrPerechi);
                        isCorner |= cornerCase(mappedArray, array[i], -array[i] - array[j], nrPerechi);
                        isCorner |= cornerCase(mappedArray, array[j], array[i], nrPerechi);
                        if (isCorner) // is corner case, already been dealt with
                            continue;

                        if (mappedArray.get(array[i]) == 1) // only 1 element with that value
                            mappedArray.remove(array[i]);
                        else
                            mappedArray.put(array[i], mappedArray.get(array[i]) - 1);

                        if (mappedArray.get(array[j]) == 1) // only 1 element with that value
                            mappedArray.remove(array[j]);
                        else
                            mappedArray.put(array[j], mappedArray.get(array[j]) - 1);

                        if (mappedArray.get(- array[i] - array[j]) == 1) // only 1 element with that value
                            mappedArray.remove(- array[i] - array[j]);
                        else
                            mappedArray.put(- array[i] - array[j], mappedArray.get(- array[i] - array[j]) - 1);

                        nrPerechi.value++;
                    }
                }
            }
        }

        return nrPerechi.value;
    }
}

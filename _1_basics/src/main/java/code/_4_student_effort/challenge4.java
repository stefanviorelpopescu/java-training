package code._4_student_effort;

import java.util.HashMap;
import java.util.Scanner;

public class challenge4 {

    // O(n^2) complexity, expanded code from challenge 3

    public static void main(String[] args) {
        System.out.print("Insert array length: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];

        System.out.println("Insert your array elements: ");
        for(int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Number of pairs:" + checkTripletPairs(len, arr));

    }

    private static String checkTripletPairs(int len, int[] arr) {
        // hash map which contains the number and true or false value; we use the boolean
        HashMap<Integer, Boolean> pairMap = new HashMap<>();
        int count = 0;

        // inserting elements in map
        for(int i = 0; i < len; i++) {
            pairMap.put(arr[i], true);
        }

        // counting the pairs
        for(int i = 0; i < len - 1; i++) {

            // Find pairs with sum equals to -arr[i]
            for(int j = i+1; j < len; j++)
            {
                // we calculate x which would get a 0 sum
                int x = -(arr[i] + arr[j]);

                // we check if value is null first so we don't get an out of bounds error
                // we check if it's greater than 0 in case arr[i] or arr[j] are 0 that 0 values aren't taken into consideration
                // if we have an opposite we increase the counter and mark the values as used
                if (pairMap.get(x) != null && arr[i]*arr[j] > 0 && pairMap.get(x) && pairMap.get(arr[j])){
                    count++;
                    pairMap.put(arr[j], false);
                    pairMap.put(x, false);
                }

                pairMap.put(arr[i], false);
            }
        }

        return String.valueOf(count);
    }
}

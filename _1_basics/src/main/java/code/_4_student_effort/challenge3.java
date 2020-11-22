package code._4_student_effort;

import java.util.HashMap;
import java.util.Scanner;

public class challenge3 {

    // the easy way would be to find the solution in O(n^2) time using 2 fors but I decided to not solve it using the greedy solution
    // my solution does however use more memory

    public static void main(String[] args) {
        System.out.print("Insert array length: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];

        System.out.println("Insert your array elements: ");
        for(int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Number of pairs:" + checkPairs(len, arr));

    }

    private static String checkPairs(int len, int[] arr) {
        // hash map which contains the number and true or false value; we use the boolean
        HashMap<Integer, Boolean> pairMap = new HashMap<>();
        int count = 0;

        // inserting elements in map
        for(int i = 0; i < len; i++) {
            pairMap.put(arr[i], true);
        }

        // counting the pairs
        for(int i = 0; i < len; i++) {

            // we check if value is null first so we don't get an out of bounds error
            // greater than 0 is to make sure that 0 values don't create pairs with themselves
            // if we have an opposite we increase the counter
            if (pairMap.get(-arr[i]) != null && arr[i] > 0 && pairMap.get(-arr[i]))
                count++;
            pairMap.put(arr[i], false);

        }

        return String.valueOf(count);
    }
}

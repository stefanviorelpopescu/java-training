package code._4_student_effort;
import java.util.HashMap;
import java.util.Scanner;

public class CodeChallenge4 {
    public static void main(String[] args) {
        System.out.println("Insert array length: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];

        System.out.println("Insert your array elements: ");
        for(int i =  0; i < len; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Number of pairs: " + checkPairs(len, arr));
    }

    private static String checkPairs(int len, int[] arr) {
        HashMap<Integer, Boolean> pairMap = new HashMap<>();
        int count = 0;
        for (int i = 0; i < len; i++) {
            pairMap.put(arr[i], true);
        }
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int x = -(arr[i] + arr[j]);

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
package code._4_student_effort;
import java.util.HashMap;
import java.util.Scanner;

public class CodeChallenge3 {

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
            HashMap<Integer, Boolean> pairMap = new HashMap<>();
            int count = 0;

            for(int i = 0; i < len; i++) {
                pairMap.put(arr[i], true);
            }

            for(int i = 0; i < len; i++) {

                if (pairMap.get(-arr[i]) != null && arr[i] > 0 && pairMap.get(-arr[i]))
                    count++;
                pairMap.put(arr[i], false);

            }

            return String.valueOf(count);
        }
    }
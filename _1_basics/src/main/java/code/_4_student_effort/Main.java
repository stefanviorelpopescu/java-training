package code._4_student_effort;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        // first Java course
        System.out.println("Challenge 1 output:");
        challenge1();
        System.out.println("Challenge 2 output:");
        System.out.println(compute(537));
        System.out.println("Challenge 3 output:");
        System.out.println(challenge3());
        System.out.println("Challenge 4 output:");
        System.out.println(challenge4());

    }

    /* Challenge 1 - Program that prints numbers from 1 to 100; for multiples of 3 print "Fizz", for multiples of 5 print "Buzz" and for
       multiples of 3 and 5 print "FizzBuzz".
       */

    static void challenge1() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz, ");
            } else {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }

    /* Challenge 2 - Implement a function String compute (int); if the number is divisible by 3 write 'Foo";
    for numbers divisible by 5, add "Bar"; if the number is divisible by 7, add "Qix";
    for each digit 3, 5, 7 add "Foo", "Bar", "Qix" in the digits order
    */
    public static String compute(int a) {
        String s = "";
        if (a % 3 == 0) {
            s += "Foo";
        }
        if (a % 5 == 0) {
            s += "Bar";
        }
        if (a % 7 == 0) {
            s += "Qix";
        }

        String temp = Integer.toString(a);
        int[] digits = new int[temp.length()];
        for (int i = 0; i < temp.length(); i++) {
            digits[i] = temp.charAt(i);
            if (digits[i] == '3') {
                s += "Foo";
            } else if (digits[i] == '5') {
                s += "Bar";
            } else if (digits[i] == '7') {
                s += "Qix";
            }
        }
        return s;
    }

    /* Challenge 3 - Pair of 2
    Given an array of integers, find the number of pairs (any 2 numbers that added result to 0) from the array
     */
    static int challenge3() {
        int[] a = {-7, -3, -2, 0, 1, 2, 3, 6, 7};
        int nrOfPairs = 0;
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if ((a[i] + a[j]) == 0) {
                    nrOfPairs += 1;
                    k++;
                }
            }
        }
        return nrOfPairs / 2;
    }
    /* Challenge 3 - Pair of 2
      Given an array of integers, find the number of unique pairs (any 3 numbers that added result to 0) from the array
       */
    static int challenge4() {
        int[] a = {-1,-1,-1,2};
        int nrOfPairs = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length-1; j++) {
                for (int k = 3; j < a.length-2; j++) {
                    if ((a[i] + a[j] + a[k]) == 0) {
                        nrOfPairs += 1;
                    }
                }
            }
        }
        return nrOfPairs/3;
    }
}

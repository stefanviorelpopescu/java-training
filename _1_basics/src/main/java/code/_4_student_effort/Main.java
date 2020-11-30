package code._4_student_effort;

import code._2_challenge._1_fizzbuzz.FizzBuzz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    // Challenge 1
    doChallenge1();

    // Challenge 2
    doChallenge2();

    // Challenge 3
    doChallenge3();

    // Challenge 4
    //TODO doChallenge4();
  }

  // Challenge 1 usage in Main function
  public static void doChallenge1() {
    System.out.println("Result of challenge 1: ");
    doFizzBuzz();
  }

  // Challenge 2 usage in Main function
  public static void doChallenge2() {
    System.out.println("\nResult of challenge 2: " + compute(53));
    System.out.println("Result of challenge 2 request 2: " + compute2(10101));
  }

  // Challenge 3 usage in Main function
  public static void doChallenge3() {
    int[] array = { 3, 2, -3, -2, 3, 0 };
    System.out.println("Result of challenge 3: " + findPairs(array, 0));
  }

  // Challenge 4 usage in Main function
  public static void doChallenge4() {
    int[] array = { -1, -1, -1, 2 };
    System.out.println("Result of challenge 3: " + findPairsOf3(array, 0));
  }

  // Prints numbers between 1 and num with the following particularities:
  // *) if num is multiple of 3 print Fizz instead of num
  // *) if num is multiple of 5 print Buzz instead of num
  // *) if num is multiple of 3 and 5 print FizzBuzz instead of num
  // *) if num is multiple of 7 print Rizz instead of num
  // *) if num is multiple of 11 print Jazz instead of num
  public static void doFizzBuzz() {
    for (int num = 1; num < 100; num++) {
      if (num % 3 == 0) {
        if (num % 5 == 0) {
          System.out.print("FizzBuzz, ");
        } else {
          System.out.print("Fizz, ");
        }
      } else if (num % 5 == 0) {
        System.out.print("Buzz, ");
      } else if (num % 7 == 0) {
        System.out.print("Rizz, ");
      } else if (num % 11 == 0) {
        System.out.print("Jazz, ");
      } else {
        System.out.print(num + ", ");
      }
    }
  }

  //FooBarQix Challenge
  // *) if num is multiple of 3 or contains 3 print Foo
  // *) if num is multiple of 5 or contains 5 print Bar
  // *) if num is multiple of 7 or contains 7 print Qix
  public static String compute(int num) {
    String result = "";

    if (num % 3 == 0)
      result += "Foo";
    if (num % 5 == 0)
      result += "Bar";
    if (num % 7 == 0)
      result += "Qix";

    char[] chars = String.valueOf(num).toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '3') result += "Foo";
      if (chars[i] == '5') result += "Bar";
      if (chars[i] == '7') result += "Qix";
    }

    return result.isEmpty() ? String.valueOf(num) : result;
  }

  //FooBarQix Challenge
  // *) if num is multiple of 3 or contains 3 print Foo
  // *) if num is multiple of 5 or contains 5 print Bar
  // *) if num is multiple of 7 or contains 7 print Qix
  // *) 0 will be replaced with *
  public static String compute2(int num) {
    String result = "";

    if (num % 3 == 0)
      result += "Foo";
    if (num % 5 == 0)
      result += "Bar";
    if (num % 7 == 0)
      result += "Qix";

    char[] chars = String.valueOf(num).toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '3') result += "Foo";
      if (chars[i] == '5') result += "Bar";
      if (chars[i] == '7') result += "Qix";
      if (chars[i] == '0') result += "*";
    }

    return result.isEmpty() ? String.valueOf(num) : result;
  }

  // Challenge 3
  // Find number of pairs from an array of integers
  public static int findPairs(int[] arr, int targetSum) {
    // Map of integers and number of appearences
    HashMap<Integer, Integer> numAppearence = new HashMap<Integer, Integer>();

    // num of pais
    int pairs = 0;

    for (int num : arr) {
      if (numAppearence.containsKey(targetSum-num) && (numAppearence.get(targetSum-num) > 0)) {
        numAppearence.put(targetSum-num, numAppearence.get(targetSum-num) - 1);
        pairs += 1;
      } else if (!numAppearence.containsKey(num)) {
        numAppearence.put(num, 1);
      } else {
        numAppearence.put(num, numAppearence.get(num) + 1);
      }
    }

    //if (numAppearence.isEmpty()) System.out.println("[Debug] Map is not empty");
    // [Debug]
    /*for (Integer num: numAppearence.keySet()) {
      String key = num.toString();
      String value = numAppearence.get(num).toString();
      System.out.println(key + " " + value);
    }*/

    return pairs;
  }

  // Challenge 4
  public static int findPairsOf3(int[] arr, int targeSum) {
    // num of pais
    int pairs = 0;

    // Sort the elements of the array
    Arrays.sort(arr);

    // Map of integers and number of appearences
    HashMap<Integer, Integer> numAppearence = new HashMap<Integer, Integer>();

    for (int i = 0; i < arr.length - 2; i++) {
      // index of the first element in the remaining elements
      int left = i + 1;

      // index of the last element
      int right = arr.length - 1;

      while (left < right) {
        if (arr[i] + arr[left] + arr[right] == targeSum) {
          pairs++;
          // Increment the left value index
          left++;
          // Decrement the right value index
          right--;

        } else if (arr[i] + arr[left] + arr[right] < targeSum) {
          left++; // Increment the left value index
        } else {
          right--; // Decrement the right value index
        }
      }
    }

    return pairs;
  }

}

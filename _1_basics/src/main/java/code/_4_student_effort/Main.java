package code._4_student_effort;

import code._2_challenge._1_fizzbuzz.FizzBuzz;

import java.util.HashMap;

public class Main {

  public static void main(String[] args) {
    // Challenge 1
    System.out.println("Result of challenge 1: ");
    doFizzBuzz();

    // Challenge 2
    System.out.println("\nResult of challenge 2: " + compute(53));
    System.out.println("Result of challenge 2 request 2: " + compute2(10101));

    // Challenge 3
    int[] array = { 3, 2, -3, -2, 3, 0 };
    System.out.println("Result of challenge 3: " + findPairs(array));

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
  public static int findPairs(int[] arr) {
    // Map of integers and number of appearences
    HashMap<Integer, Integer> numAppearence = new HashMap<Integer, Integer>();

    // num of pais
    int pairs = 0;

    for (int num : arr) {
      if (!numAppearence.containsKey(num)) {
        numAppearence.put(num, 1);
      } else {
        numAppearence.put(num, numAppearence.get(num) + 1);
      }
    }

    //if (numAppearence.isEmpty()) System.out.println("[Debug] Map is not empty");
    // [Debug]
    /*for (Integer num: numAppearence.keySet()){
      String key = num.toString();
      String value = numAppearence.get(num).toString();
      System.out.println(key + " " + value);
    }*/

    for (int i = 0; i < arr.length; i++) {
      // if (numAppearence.containsValue(0-arr[i])) System.out.println("[Debug] Map has value");

      if (numAppearence.containsValue(0-arr[i]) && (numAppearence.get(0-arr[i]) > 0)) {
        numAppearence.put(arr[i], numAppearence.get(arr[i]) - 1);
        numAppearence.put(arr[i], numAppearence.get(0-arr[i]) - 1);
        pairs += 1;
      }
    }

    return pairs;
  }
}

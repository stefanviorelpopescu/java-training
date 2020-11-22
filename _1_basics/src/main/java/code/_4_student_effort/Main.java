package code._4_student_effort;

import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {
//    calling the methods
    fizzBuzz1Print(100);
    fizzBuzz2Print(100);
    assert fooBarQix1(105).equals("FooBarQixBar") : "wrong";
    assert fooBarQix2(101).equals("1*1") : "not working on numbers that do not divide";
    assert pairOfTwo(new int[]{10, -10, 3, -10,-3}) == 2 : "wrong";
    assert pairOfThree(new int[]{-1,-1,-1,2,3,-2,-1}) == 2 : "wrong";
//    System.out.println(fooBarQix1(105));
//    System.out.println(fooBarQix2(101));//not working
//    System.out.println(pairOfTwo(new int[]{10, -10, 3, -10,-3}));
//    System.out.println(pairOfThree(new int[]{-1,-1,-1,2,3,-2,-1}));
  }

  private static void fizzBuzz1Print(int num) {
//    create a sequence of primitive int-valued elements in closed range from one to the arg
    IntStream.rangeClosed(1, num)
//          apply the given function to each element
//          function being an if conditional to check the divisors of i
            .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : i))
//          print each number
            .forEach(System.out::println);
  }

  private static void fizzBuzz2Print(int num) {
    //    create a sequence of primitive int-valued elements in closed range from one to the arg
    IntStream.rangeClosed(1, num)
//          apply the given function to each element
//          function being an if conditional to check the divisors of i
            .mapToObj(i -> i % 3 == 0 ? (i % 5 == 0 ? (i % 7 == 0 ? (i % 11 == 0 ? "FizzBuzzRizzJazz" : "FizzBuzzRizz") : (i % 11 == 0 ? "FizzBuzzJazz" : "FizzBuzz")) : (i % 7 == 0 ? (i % 11 == 0 ? "FizzRizzJazz" : "FizzRizz"):(i % 11 == 0 ? "FizzJazz":"Fizz"))) : (i % 5 == 0 ? (i % 7 == 0 ? (i % 11 == 0 ? "BuzzRizzJazz": "BuzzRizz") : (i % 11 == 0 ? "BuzzJazz" : "Buzz")) : (i % 7 == 0 ? (i % 11 == 0 ? "RizzJazz" : "Rizz") : (i % 11 == 0 ? "Jazz": i))))
//          print each number
            .forEach(System.out::println);
  }

  private static String fooBarQix1 (int num) {
    // create String with the divisibility condition
    String s = num % 3 == 0 ? (num % 5 == 0 ? (num % 7 == 0 ? "FooBarQix" : "FooBar") : (num % 7 == 0 ? "FooQix" : "Foo")) : (num % 5 == 0 ? (num % 7 == 0 ? "BarQix" : "Bar") : (num % 7 == 0 ? "Qix" : ""));
    // parse through the number and add the specific word for each digit from rule
    for (char digit:String.valueOf(num).toCharArray()) {
      s = (digit == '3') ? s + "Foo" : (digit == '5' ? s + "Bar" : (digit == '7' ? s + "Qix" : s));
    }
    // add number to string if none of the conditions apply
    s = s.equals("") ? s+ num : s;
    return s;
  }

  // not working for numbers the do not divide
  private static String fooBarQix2 (int num) {
    String s = num % 3 == 0 ? (num % 5 == 0 ? (num % 7 == 0 ? "FooBarQix" : "FooBar") : (num % 7 == 0 ? "FooQix" : "Foo")) : (num % 5 == 0 ? (num % 7 == 0 ? "BarQix" : "Bar") : (num % 7 == 0 ? "Qix" : ""));
    for (char digit:String.valueOf(num).toCharArray()) {
      s = (digit == '3') ? s + "Foo" : (digit == '5' ? s + "Bar" : (digit == '7' ? s + "Qix" : digit == '0' ? s + "*" : s));
    }
    if (s.equals("")) {
      char[] digits = String.valueOf(num).toCharArray();
      for (char digit:digits) {
        s = (digit ==  '0') ? s + "*" : s + digit;
      }
    }
    return s;
  }

  private static Integer pairOfTwo (@org.jetbrains.annotations.NotNull int[] nums) {
    int count = 0;
    for (int i=0;i<=nums.length; i++){
      for (int j=i+1;j<nums.length;j++){
        if ((nums[i]!= 0)&&(nums[j]!=0)) {
          if (nums[i]+nums[j]==0) {
            count ++;
            nums[i]=0;
            nums[j]=0;
          }
        }
      }
    }
    return count;
  }

  private static Integer pairOfThree (@org.jetbrains.annotations.NotNull int[] nums) {
    int count = 0;
    for (int i=0;i<=nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        for (int k = j + 1; k < nums.length; k++) {
          if ((nums[i] != 0) && (nums[j] != 0) && (nums[k] != 0)) {
            if (nums[i] + nums[j] + nums[k] == 0) {
              count++;
              nums[i] = 0;
              nums[j] = 0;
              nums[k] = 0;
            }
          }
        }
      }
    }
    return count;
  }
}

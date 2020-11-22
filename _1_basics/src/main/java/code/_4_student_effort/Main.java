package code._4_student_effort;

public class Main {

  public static String my_fizzBuzz(int i) {
      String s = "";
      if (i % 3 == 0 && i % 5 != 0) {
        s += "Fizz";
      } else if (i % 5 == 0 & i % 3 != 0) {
        s+= "Buzz";
      } else if (i % 15 == 0) {
        s += "FizzBuzz";
      } else {
        s += i;
      }

      return s;
  }

  public static String my_fizzBuzz2(int i) {
    String s = "";
    if (i % 3 == 0 && i % 5 != 0 && i % 7 != 0 && i % 11 != 0) {
      s += "Fizz";
    } else if (i % 5 == 0 & i % 3 != 0 && i % 7 != 0 && i % 11 != 0) {
      s += "Buzz";
    } else if (i % 15 == 0 && i % 7 != 0 && i % 11 != 0) {
      s += "FizzBuzz";
    } else if (i % 7 == 0 && i % 11 != 0) {
      s += "Rizz";
    } else if (i % 11 == 0) {
      s += "Jazz";
    } else {
      s += i;
    }
    return s;
  }

  public static String compute(int i) {
    String s = "";
    if (i % 3 == 0) {
        s += "Foo";
    }
    if (i % 5 == 0) {
      s += "Bar";
    }

    if (i % 7 == 0) {
      s += "Qix";
    }

    if (i % 7 != 0 && i % 3 != 0 && i % 5 != 0) {
      s += String.valueOf(i);
    }

    char[] digits = String.valueOf(i).toCharArray();
    int three = 0;
    int five = 0;
    int seven = 0;

    for (char d : digits) {
        if (d == '3') {
          three++;
        }
        if (d == '5') {
          five++;
        }
        if (d == '7') {
          seven++;
        }
    }

    while (three != 0) {
      s += "Foo";
      three--;
    }
    while (five != 0) {
      s += "Bar";
      five--;
    }
    while (seven != 0) {
      s += "Qix";
      seven--;
    }

    return s;
  }

  public static String compute2(int i) {
    String s = "";
    if (i % 3 == 0) {
      s += "Foo";
    }
    if (i % 5 == 0) {
      s += "Bar";
    }

    if (i % 7 == 0) {
      s += "Qix";
    }

    if (i % 7 != 0 && i % 3 != 0 && i % 5 != 0) {
      s += String.valueOf(i);
    }

    char[] digits = String.valueOf(i).toCharArray();
    int three = 0;
    int five = 0;
    int seven = 0;
    int zeros = 0;

    for (char d : digits) {
      if (d == '3') {
        three++;
      }
      if (d == '5') {
        five++;
      }
      if (d == '7') {
        seven++;
      }
      if (d == '0') {
        zeros++;
      }
    }

    while (zeros != 0) {
      s += "*";
      zeros--;
    }

    while (three != 0) {
      s += "Foo";
      three--;
    }
    while (five != 0) {
      s += "Bar";
      five--;
    }
    while (seven != 0) {
      s += "Qix";
      seven--;
    }

    return s;
  }

  public static int indexesNotUsed_2(int i, int j, Integer[] index_used) {
    if (index_used[j] == 1 || index_used[i] == 1){
      return 0;
    }
    return 1;
  }
  public static Integer count_pairs_2(Integer[] numbers) {
    Integer count = 0;
    Integer[] index_used = new Integer[numbers.length];
    for (int i = 0; i < index_used.length; ++i) {
      index_used[i] = 0;
    }
    for (int i = 0; i < numbers.length - 1; ++i) {
      for (int j = i + 1; j < numbers.length; ++j) {
        if (numbers[i] + numbers[j] == 0 && indexesNotUsed_2(i, j, index_used) == 1){
          index_used[i] = 1;
          index_used[j] = 1;
          count++;
        }
      }

    }
    return count;
  }

  public static int indexesNotUsed_3(int i, int j, int k, Integer[] index_used) {
    if (index_used[j] == 1 || index_used[i] == 1 || index_used[k] == 1){
      return 0;
    }
    return 1;
  }

  public static Integer count_pairs_3(Integer[] numbers) {
    Integer count = 0;
    Integer[] index_used = new Integer[numbers.length];
    for (int i = 0; i < index_used.length; ++i) {
      index_used[i] = 0;
    }
    for (int i = 0; i < numbers.length - 2; ++i) {
      for (int j = i + 1; j < numbers.length - 1; ++j) {
        for (int k = j + 1; k < numbers.length; ++k) {
          if (numbers[i] + numbers[j] + numbers[k] == 0 && indexesNotUsed_3(i, j, k, index_used) == 1) {
            index_used[i] = 1;
            index_used[j] = 1;
            index_used[k] = 1;
            count++;
          }
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    //TODO put your code changes in here
   /* for (int i = 1; i <= 100; ++i) {
      System.out.println(my_fizzBuzz(i));
    }

    for (int i = 1; i <= 100; ++i) {
      System.out.println(my_fizzBuzz2(i));
    }*/

    // System.out.println(compute(105));
    // System.out.println(compute2(10101));

    Integer[] array = {-2, -2, -2, 4, 4};
    System.out.println(count_pairs_2(array));

    System.out.println(count_pairs_3(array));
  }
}

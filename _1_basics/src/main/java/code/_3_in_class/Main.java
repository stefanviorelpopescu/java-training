package  code._3_in_class;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    int[] num = new int[6];
    int value = 10101;
    // read num
    challenge_1();

    challenge_2(value);

    challenge_3(num);

    challenge_4(num);
  }

  private static void challenge_1() {
    String s ="";
    for (int i = 1; i <= 100; i++) {
      if (i % 15 == 0)
        System.out.println("FizzBuzz");
      else if (i % 3 == 0)
        System.out.println("Fizz");
      else if (i % 5 == 0)
        System.out.println("Buzz");
      else
        System.out.println(i);

    }

    for (int i = 1; i <= 100; i++) {
      s = "";
      if (i % 3 == 0)
        s += "Fizz";
      if (i % 5 == 0)
        s += "Buzz";
      if (i % 7 == 0)
        s += "Rizz";
      if (i % 11 == 0)
        s += "Jazz";
      if (s.length() == 0)
        System.out.println(i);
      else
        System.out.println(s);
    }
  }


  private static void challenge_2(int value) {
    System.out.println(compute(value));
    System.out.println(compute2(value));
  }

  private static String compute(int value) {
    String s = "";
    boolean ok = false;
    if (value % 3 == 0)
      s += "Foo";
    if (value % 5 == 0)
      s += "Bar";
    if (value % 7 == 0)
      s += "Qix";

    if (s.length() == 0)
      ok = true;
    char[] digits = String.valueOf(value).toCharArray();
    for (int i = 0; i < digits.length; i++) {

      if (digits[i] == '3')
        s += "Foo";
      else if (digits[i] == '5')
        s += "Bar";
      else if (digits[i] == '7')
        s += "Qix";
      else if (ok)
        s += digits[i];
    }
    return s;
  }

  private static String compute2(int value) {
    String s = "";
    boolean ok = false;
    if (value % 3 == 0)
      s += "Foo";
    if (value % 5 == 0)
      s += "Bar";
    if (value % 7 == 0)
      s += "Qix";
    if (s.length() == 0)
      ok = true;
    char[] digits = String.valueOf(value).toCharArray();
    for (int i = 0; i < digits.length; i++) {

      if (digits[i] == '3') s += "Foo";
      else if (digits[i] == '5')
        s += "Bar";
      else if (digits[i] == '7')
        s += "Qix";
      else if (digits[i] == '0')
        s += "*";
      else if (ok)
        s += digits[i];
    }
    return s;
  }

  private static void challenge_3(int[] num) {
    int sol = 0;
    int[] frecv = new int[num.length];

    for (int i = 0; i < num.length - 1; i++) {
      if (frecv[i] == 0) {
        for (int j = i + 1; j < num.length; j++) {

          if (frecv[j] == 0 && (num[i] + num[j] == 0)) {
            frecv[i] = 1;
            frecv[j] = 1;
            sol++;
            break;
          }
        }
      }
    }
    System.out.println(sol);
  }

  private static void challenge_4(int[] num) {
    int sol = 0;
    int[] frecv = new int[num.length];

    for (int i = 0; i < num.length - 2; i++) {
      if (frecv[i] == 0) {
        for (int j = i + 1; j < num.length - 1; j++) {
          if (frecv[j] == 0) {
            for (int k = j + 1; k < num.length; k++) {

              if (frecv[k] == 0 && (num[i] + num[j] + num[k] == 0)) {
                frecv[i] = 1;
                frecv[j] = 1;
                frecv[k] = 1;
                sol++;
                break;
              }
            }
          }
        }
      }
    }
    System.out.println(sol);
  }
}

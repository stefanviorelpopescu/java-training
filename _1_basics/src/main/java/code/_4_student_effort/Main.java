package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    String rez = compute(27);
    System.out.println(rez);

  }


  public static String compute(int i) {
    String s = "";

    boolean isDivisible = false;
    if (i % 3 == 0) {
      s += "Foo";
      isDivisible = true;
    }
    if (i % 5 == 0) {
      s += "Bar";
      isDivisible = true;
    }
    if (i % 7 == 0) {
      s += "Qix";
      isDivisible = true;
    }

    char[] digits = String.valueOf(i).toCharArray();
    for (char digit : digits) {

      if (digit == '3') s += "Foo";
      else if (digit == '5') s += "Bar";
      else if (digit == '7') s += "Qix";
      else if (digit == '0') s += "*";
      else if (!isDivisible) s += digit;
    }

    return s;
  }
}
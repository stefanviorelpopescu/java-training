package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    System.out.println("Challenge 1 FizzBuzz");
    Challenge1.FizzBuzz();
    System.out.println();
    System.out.println("Challenge 1 RizzJazz");
    Challenge1.RizzJazz();
    System.out.println();
    System.out.println("Challenge 2 Compute");
    for (int i = 1; i < 100; i++) {
      System.out.println(i + ": " + Challenge2.compute(i));
    }
    System.out.println("Challenge 2 Compute2");
    for (int i = 1; i < 200; i++) {
      System.out.println(i + ": " + Challenge2.compute2(i));
    }
    System.out.println("Challenge 3 PairOf2");
    int[] array3 = {3, 2, -3, -2, 3, 0, 0, 5};
    for (int el : array3) {
      System.out.print(el + " ");
    }
    System.out.print(": " + Challenge3.PairOf2(array3));
    System.out.println();
    System.out.println("Challenge 4 PairOf3");
    int[] array4 = {-2, -1, -1, 2, -2, 8, 4};
    for (int el : array4) {
      System.out.print(el + " ");
    }
    System.out.print(": " + Challenge4.PairOf3(array4));
  }
}

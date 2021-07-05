package code._4_student_effort._1_challengeOne;

public class Main {

  public static void main(String[] args) {
    /* Challenge one */
    System.out.println("Challenge one");
    System.out.println();

    Fighter one = new Fighter("Gregor", 100, 78);
    Fighter two = new Fighter("Gufi", 100, 81);
    BoxingMatch boxingMatch = new BoxingMatch(one, two);
    System.out.println(boxingMatch.fight(one, two));
    System.out.println("-------------");
  }
}

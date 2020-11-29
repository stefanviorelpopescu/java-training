package code._4_student_effort;

public class Main {

  public static void CodeChallenge1() {

    Fighter Mihai = new Fighter("Mihai", 100, (int) (Math.random()*10)+1);
    Fighter Dorel = new Fighter("Dorel", 100, (int) (Math.random()*10)+1);

    BoxingMatch boxingMatch = new BoxingMatch(Mihai,Dorel);
    System.out.println(boxingMatch.fight());
  }

  public static void main(String[] args) {
    //TODO put your code changes in here
    CodeChallenge1();

  }
}

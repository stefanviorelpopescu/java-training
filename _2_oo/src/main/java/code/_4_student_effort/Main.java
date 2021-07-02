package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    //first challenge
    Fighter fighter1 = new Fighter("Warrior1", 10, 2);
    Fighter fighter2 = new Fighter("Warrior2", 8, 3);
    BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
    String winner = boxingMatch.fight();
    System.out.println("The winner is " + winner);

    //second challenge
    Instances.studioName();
    Instances.moviesOfActor();
    Instances.studioOfActor();

    // third challenge
  }

  }


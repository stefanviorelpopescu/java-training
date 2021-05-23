package code._4_student_effort;

import code._4_student_effort.fighters.BoxingMatch;
import code._4_student_effort.fighters.Fighter;
import code._4_student_effort.movie.*;

public class Main {

  public static void main(String[] args) {

    System.out.println("\nChallenge 1 : \n");

    Fighter f1 = new Fighter("Fighter 1", 10, 2);
    Fighter f2 = new Fighter("Fighter 2", 10, 1);

    BoxingMatch match = new BoxingMatch(f1, f2);
    String winner = match.fight();
    System.out.println("The winner of the match is " + winner);

    System.out.println("\nChallenge 2 : \n");
    Requirements r = new Requirements();
    System.out.println("Studios that have published more than 2 movies : ");
    r.allStudioNames();
    System.out.println("Studios in which plays the actor with name actor cu 2 oscaruri : ");
    r.studioActoriOscaruri();
    System.out.println("Movies in which plays at least an actor over 50 : ");
    r.movieNames();

    System.out.println("\nChallenge 3 : \n");
  }
}

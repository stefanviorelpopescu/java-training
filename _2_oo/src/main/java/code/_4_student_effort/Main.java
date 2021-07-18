package code._4_student_effort;

import code._4_student_effort.challenge_1.BoxingMatch;
import code._4_student_effort.challenge_1.Fighter;
import code._4_student_effort.challenge_2.Studio;
import code._4_student_effort.challenge_3.TestAnimals;

public class Main {

  public static void main(String[] args) {
    System.out.println("Challenge 1: Two fighters, one winner");
    Fighter opponent1 = new Fighter("First opponent", 120, 35);
    Fighter opponent2 = new Fighter("Second opponent", 175, 23);
    BoxingMatch match = new BoxingMatch(opponent1, opponent2);
    String winner = match.fight();
    System.out.println("Winner: " + winner);
    System.out.println("Challenge 2: Movie Database");
    Studio.getStudioNamesThatHavePublishedMoreThan2Movies();
    Studio.getStudioNamesWithActorNamedActorCu2Oscaruri();
    Studio.getMoviesNameWithMin1ActorWithAgeAbove50();
    System.out.println("Challenge 3: Animal Hierarchy");
    TestAnimals.main();
  }
}

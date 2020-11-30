package code._4_student_effort;

import static code._4_student_effort.Database.*;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    Fighter f1 = new Fighter("Gigel", 120,20);
    Fighter f2 = new Fighter("Ionel", 100, 30);
    BoxingMatch boxingMatch = new BoxingMatch(f1,f2);
    System.out.println(boxingMatch.fight());

    studiosWithMoreThanTwoMovies();

    studioWithNamedActor();

    moviesWithActorsOverFifty();

    Fish d = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();


    c.play();
    a.walk();
    e.walk();
    d.walk();
    c.play();
    e.eat();
  }
}

package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // Challenge 1
    doChallenge1();
    printChallengeSeparator();

    // Challenge 2
    doChallenge2();
    printChallengeSeparator();

    // Challenge 3
    doChallenge3();
  }

  // Challenge 1 usage in Main function
  public static void doChallenge1() {
    Fighter f1 = new Fighter("Tyson", 100, 25);
    Fighter f2 = new Fighter("Roy Jones Jr", 100, 25);

    BoxingMatch boxingMatch = new BoxingMatch(f1, f2);
    System.out.println(boxingMatch.fight());
  }

  // Challenge 2 usage in Main function
  public static void doChallenge2() {
    Premiu oscar1990 = new Premiu("oscar", 1990);
    Premiu oscar2000 = new Premiu("oscar", 2000);
    Premiu oscar2010 = new Premiu("oscar", 2010);
    Premiu oscar2018 = new Premiu("oscar", 2018);

    Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[] { oscar1990, oscar2000 });
    Actor actorOscar2010 = new Actor("actor cu oscar din 2010", 55, new Premiu[] { oscar2010 });
    Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[] { oscar2018 });
    Actor actorOscarFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[] { });
    Actor actorOscarFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[] { });
    Actor actorOscarFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[] { });

    Film film1 = new Film(1990, "film cu actori de oscar", new Actor[] { actorOscar1990, actorOscarFaraPremii01 });
    Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[] { actorOscarFaraPremii01, actorOscarFaraPremii02, actorOscarFaraPremii03 });
    Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[] { actorOscarFaraPremii01, actorOscarFaraPremii02, actorOscarFaraPremii03 });
    Film film4 = new Film(2018, "film cu actori de oscar", new Actor[] { actorOscar2010, actorOscar2018, actorOscarFaraPremii02 });
    Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[] { actorOscarFaraPremii02, actorOscarFaraPremii03 });

    Studio studio1 = new Studio("MGM", new Film[] { film1, film2 });
    Studio studio2 = new Studio("Disney", new Film[] { film3, film4, film5 });

    Studio[] studioDatabase = new Studio[] { studio1, studio2 };

    // Query 1
    doQuery1(studioDatabase);
    printSeparator();

    // Query 2
    doQuery2(studioDatabase);
    printSeparator();

    // Query 3
    doQuery3(studioDatabase);
  }

  // Query 1 from challenge 1
  public static void doQuery1(Studio[] studioDatabase) {
    System.out.println("All studio names that have published more than 2 movies are: ");
    for (Studio studio : studioDatabase) {
      if (studio.filme.length >= 2) {
        System.out.println(studio.nume);
      }
    }
  }

  // Query 2 from challenge 1
  public static void doQuery2(Studio[] studioDatabase) {
    List<String> studioNames = new ArrayList<>();
    for (Studio studio : studioDatabase) {
      for (Film film : studio.filme) {
        for (Actor actor : film.actori) {
          if (actor.nume.equals("actor cu 2 oscaruri")) {
            studioNames.add(studio.nume);
            break;
          }
        }
        // If already contains the name of the studio from a previous movie
        if (studioNames.contains(studio.nume)) break;
      }
    }

    System.out.println("All studio names in which plays the actor with the name \"actor cu doua oscaruri\": ");
    for(String studioName: studioNames) {
      System.out.println(studioName);
    }
  }

  // Query 3 from challenge 1
  public static void doQuery3(Studio[] studioDatabase) {
    List<String> movieNames = new ArrayList<>();
    for (Studio studio : studioDatabase) {
      for (Film film : studio.filme) {
        for (Actor actor : film.actori) {
          if (actor.varsta > 50) {
            movieNames.add(film.nume);
            break;
          }
        }
      }
    }

    System.out.println("All movie names in which plays at least an actor with age above 50: ");
    for(String movieName: movieNames) {
      System.out.println(movieName);
    }
  }

  // Challenge 3 usage in Main function
  public static <p> void doChallenge3() {
    Fish d = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();

    List<Animal> animals = new ArrayList<> ( Arrays.asList(d, c, a, e) ); //( List.of(d,c,a, e) );
    List<Pet> pets = new ArrayList<>() {
                                          { add(d);
                                            add(c);
                                            add(p); }
                                        };
    // Experiment by:
    // calling the methods in each object
    // casting objects
    // using polymorphism
    // using super to call super class methods
    for (Animal animal : animals) {
      animal.walk();
      animal.eat();
    }

    for (Pet pet : pets) {
      System.out.println(pet.getName());
      pet.play();
    }
  }

  public static void printChallengeSeparator() {
    System.out.println("=====================================================================");
  }

  public static void printSeparator() {
    System.out.println("---------------------------------------------------------------------");
  }
}

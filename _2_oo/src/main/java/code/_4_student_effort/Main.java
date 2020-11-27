package code._4_student_effort;

import java.util.ArrayList;

public class Main {

  public static void printMovieNamesWhichHasActorsWithAgeAbove (Studio[] studios, Integer age) {
    ArrayList<String> movieNames = new ArrayList<String>();
    for (Studio studio : studios) {
      for (Film film : studio.filme) {
        for (Actor actor : film.actori ) {
          if (actor.varsta > age) {
            if(!movieNames.contains(film.nume)){
              movieNames.add(film.nume);
              break;
            }
          }
        }
      }
    }
    System.out.println("Movies in which plays at least an actor with age above " + age + ": ");
    for (String movieName : movieNames) {
      System.out.println(movieName);
    }
  }
  public static void printStudioNamesInWhichPlaysThisActor(Studio[] studios, String actorName) {
    ArrayList<String> studioNames = new ArrayList<String>();
    for (Studio studio : studios) {
      for (Film film : studio.filme) {
        for (Actor actor : film.actori ) {
          if (actorName.equals(actor.nume)) {
            if(!studioNames.contains(studio.nume)){
              studioNames.add(studio.nume);
            }
          }
        }
      }
    }
    System.out.println("Studios in which plays the actor with name '" + actorName + "': ");
    for (String studioName : studioNames) {
      System.out.println(studioName);
    }
  }

  public static void printStudioNamesThatHavePublishedMoreThan2Movies(Studio[] studios) {
    for (Studio studio : studios) {
      if (studio.filme.length > 2){
        System.out.println("Studios that have published more than 2 movies: " + studio.nume);
      }
    }
  }
  public static Studio[] createStudioDatabase () {
    Premiu oscar1990 = new Premiu("oscar", 1990);
    Premiu oscar2000 = new Premiu("oscar", 2000);
    Premiu oscar2010 = new Premiu("oscar", 2010);
    Premiu oscar2018 = new Premiu("oscar", 2018);

    Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
    Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
    Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
    Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
    Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
    Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new Premiu[]{});

    Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
    Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
    Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

    Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
    Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

    Studio[] studioDatabase = new Studio[]{studio1, studio2};

    return studioDatabase;
  }

  public static void codeChallenge2(){
    Studio[] studioDatabase = createStudioDatabase();

    printStudioNamesThatHavePublishedMoreThan2Movies(studioDatabase);
    printStudioNamesInWhichPlaysThisActor(studioDatabase, "actor cu 2 oscaruri");
    printMovieNamesWhichHasActorsWithAgeAbove(studioDatabase, 50);
  }
  public static void codeChallenge1(){
    Fighter f1 = new Fighter("Doroftei", 100, 30);
    Fighter f2 = new Fighter("Rocky", 100, 30);
    BoxingMatch match = new BoxingMatch(f1, f2);

    System.out.println(match.fight());
  }

  public static void main(String[] args) {
    //TODO put your code changes in here
    //codeChallenge1();
    codeChallenge2();
  }
}

package code._4_student_effort;

import code._4_student_effort.movie_db.Actor;
import code._4_student_effort.movie_db.Film;
import code._4_student_effort.movie_db.Premiu;
import code._4_student_effort.movie_db.Studio;
import code._4_student_effort.two_fighters.BoxingMatch;
import code._4_student_effort.two_fighters.Fighter;

public class Main {

  public static void main(String[] args) {

    //Challenge 1
    BoxingMatch boxingMatch = new BoxingMatch(
            new Fighter("Conor McGregor", 100, 23.6),
            new Fighter( "Dustin Poirier", 100, 23.7)
    );

    System.out.println(boxingMatch.fight());

    //Challenge 2

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

    getStudioNamesWithMoreThan2Movies(studioDatabase);
    getStudioNamesWhereActorIs(studioDatabase,"actor cu 2 oscaruri");
    getMovieNamesWhereAtLeast1ActorAge50(studioDatabase);
  }


  public static void getStudioNamesWithMoreThan2Movies(Studio[] studios) {
    for(Studio studio : studios)
      if(studio.getFilme().length >= 2)
        System.out.printf(studio.getNume() + " ");
  }

  public static void getStudioNamesWhereActorIs ( Studio[] studios, String numeActor) {
    for (Studio studio :studios) {
      for(Film film : studio.getFilme())
        for(Actor actor : film.getActori())
          if(actor.getNume().equals(numeActor))
            System.out.println("\n" +  studio.getNume());
    }
  }

  public static void getMovieNamesWhereAtLeast1ActorAge50 ( Studio[] studios) {
    for (Studio studio :studios) {
      for(Film film : studio.getFilme())
        for(Actor actor : film.getActori())
          if(actor.getVarsta() > 50) {
            System.out.println(film.getNume());
            break;
          }
    }
  }

}

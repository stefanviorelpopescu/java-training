package code._4_student_effort;

import code._4_student_effort.Challenge1.BoxingMatch;
import code._4_student_effort.Challenge2.*;

public class Main {

  public static void main(String[] args) {

//    BoxingMatch match=new BoxingMatch();
//    System.out.println("aaa");
//    System.out.println("winner is:"+match.fight());

    Prize oscar1990=new Prize("oscar",1990);
    Prize oscar2000=new Prize("oscar",2000);
    Prize oscar2010=new Prize("oscar",2010);
    Prize oscar2018=new Prize("oscar",2018);

    Actor actorOscar1990=new Actor("Actor with two oscar prizes", 35, new Prize[]{oscar1990,oscar2000});
    Actor actorOscar2010=new Actor("Actor with 2000 oscar prize", 55, new Prize[]{oscar2010});
    Actor actorOscar2018=new Actor("Actor with 2018 oscar prize", 23, new Prize[]{oscar2018});
    Actor actorWithoutOscar01=new Actor("Actor without oscar prizes 01", 35, new Prize[]{});
    Actor actorWithoutOscar02=new Actor("Actor without oscar prizes 02", 60, new Prize[]{});
    Actor actorWithoutOscar03=new Actor("Actor without oscar prizes 03", 20, new Prize[]{});

    Movie movie1=new Movie(1990,"Movie with oscar winning actors01",new Actor[]{actorOscar1990,actorWithoutOscar01});
    Movie movie2=new Movie(2010,"Movie without oscar winning actors02",new Actor[]{actorWithoutOscar01,actorWithoutOscar02,actorWithoutOscar03});
    Movie movie3=new Movie(2010,"Movie without oscar winning actors03",new Actor[]{actorWithoutOscar01,actorWithoutOscar02,actorWithoutOscar03});
    Movie movie4=new Movie(2018,"Movie with oscar winning actors04",new Actor[]{actorOscar2010,actorOscar2018,actorWithoutOscar02});
    Movie movie5=new Movie(2018,"Movie without oscar winning actors05",new Actor[]{actorWithoutOscar02,actorWithoutOscar03});

    Studio studio1=new Studio("MGM", new Movie[]{movie1,movie2});
    Studio studio2=new Studio("Disney", new Movie[]{movie3,movie4,movie5});

    Studio[] studioDatabase=new Studio[]{studio1,studio2};
    Movie[] movieDatabase=new Movie[]{movie1,movie2,movie3,movie4,movie5};

    Controller controller=new Controller();

    System.out.println("1.Get all studio names that have published more than  2 movies");
    System.out.println(controller.getStudioWithMoreThan2Movies(studioDatabase));
    System.out.print("\n");
    System.out.println("2.Get the studio names in which plays the actor with name: actor with 2 oscar prizes");
    System.out.println(controller.getStudioWithTwoOscarsPrizesActor(studioDatabase));
    System.out.print("\n");
    System.out.println("3.Get movies in wich plays at least an actor with age above 50");
    System.out.println(controller.getMovieWithActorsAbove50(movieDatabase));



  }
}

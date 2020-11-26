package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void codeChallenge1() {
    Fighter f1 = new Fighter("Doroftei", 100, 25);
    Fighter f2 = new Fighter("Rocky", 100, 25);
    BoxingMatch match = new BoxingMatch(f1, f2);

    System.out.println(match.fight());
  }

  public static void codeChallenge2() {
    //Stage 2
    Premiu oscar1990 = new Premiu("oscar", 1990);
    Premiu oscar2000 = new Premiu("oscar", 2000);
    Premiu oscar2010 = new Premiu("oscar", 2010);
    Premiu oscar2018 = new Premiu("oscar", 2018);

    Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
    Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
    Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
    Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
    Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
    Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

    Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
    Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
    Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

    Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
    Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

    Studio[] studioDatabase = new Studio[]{studio1, studio2};

    //Stage 3

    //1. Get all studio names that have published more than 2 movies.
    for (Studio st : studioDatabase) {
      if (st.filme.length > 2)
        System.out.println(st.nume);
    }

    //2. Get the studio names in which plays the actor with name "actor cu 2 oscaruri"
    Actor[] actors = new Actor[]{actorOscar1990, actorOscar2010, actorOscar2018, actorFaraPremii01, actorFaraPremii02, actorFaraPremii03};
    Film[] film = new Film[]{film1, film2, film3, film4, film5};
    List<Actor> actorList = new ArrayList<Actor>();
    for (Actor act : actors) {
      if (act.nume.equals("actor cu 2 oscaruri")) {
        actorList.add(act);
        //System.out.println(act.toString());
        //String name = act.nume;
      }
    }
    List<Film> listFilm = new ArrayList<Film>();
    for (Actor act : actorList) {
      for (Film f : film) {
        for (Actor a : f.actori) {
          if (a.equals(act))
            listFilm.add(f);

        }
      }
    }

    for (Film f : listFilm) {
      for (Studio s : studioDatabase) {
        for (Film f2 : s.filme) {
          if (f2.equals(f))
            System.out.println(s.nume);
        }
      }
    }

    //3. Get the movie names in which plays at least an actor with age above 50.
    List<Actor> actorListAgeAbove50 = new ArrayList<Actor>(); //it will be created a list that contains the actors with age above 50
    for (Actor act : actors) {
      if (act.varsta>50) {
        actorListAgeAbove50.add(act);
      }
    }
    List<Film> specificFilmList = new ArrayList<Film>(); //it will be created a list that contains the films in which plays at least an actor with age above 50
    for(Actor a:actorListAgeAbove50) {
      for (Film f : film) {
        for (Actor ac : f.actori) {
          if (ac.equals(a))
            specificFilmList.add(f);
        }
      }
    }

    for(Film movie:specificFilmList)
      System.out.println(movie.nume);

  }

  //Code Challenge 3
  public static void TestAnimals(){
    Fish d = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();

    d.eat();
    d.walk();
    c.play();
    a.eat();
    a.walk();
    e.eat();
    e.walk();
    p.play();

    //cast
    String x = "4";
    int n = Integer.parseInt(x);
    System.out.println("The number of legs for a Cat object:"+n);


  }
  public static void main(String[] args) {
    //TODO put your code changes in here

      codeChallenge1();
      codeChallenge2();
      //Challenge3
      TestAnimals();


  }
}

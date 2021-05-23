package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here

    /*Fighter opponent1 = new Fighter("John", 100, 15, 5);
    Fighter opponent2 = new Fighter("Larry", 120, 5, 10);
    BoxingMatch bm = new BoxingMatch(opponent1,opponent2);
    System.out.println(bm.winner());*/

    Premiu oscar1990 = new Premiu("oscar", 1990);
    Premiu oscar2000 = new Premiu("oscar", 2000);
    Premiu oscar2010 = new Premiu("oscar", 2010);
    Premiu oscar2018 = new Premiu("oscar", 2018);

    Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35);
    actorOscar1990.getAwards().add(oscar1990);
    actorOscar1990.getAwards().add(oscar2000);

    Actor actorOscar2010 = new Actor("actor cu oscar din 2010", 55);
    actorOscar2010.getAwards().add(oscar2010);

    Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23);
    actorOscar2018.getAwards().add(oscar2018);

    Actor actorFaraPremii1 = new Actor("actor fara oscar 1", 33);
    Actor actorFaraPremii2 = new Actor("actor fara oscar 2", 60);
    Actor actorFaraPremii3 = new Actor("actor fara oscar 3", 20);

    Film film1 = new Film(1990, "film cu actori de oscar");
    film1.getActors().add(actorOscar1990);
    film1.getActors().add(actorFaraPremii1);

    Film film2 = new Film(2010, "film cu actori fara premii");
    film1.getActors().add(actorFaraPremii1);
    film1.getActors().add(actorFaraPremii2);
    film1.getActors().add(actorFaraPremii3);

    Film film3 = new Film(2010, "film cu actori fara premii");
    film1.getActors().add(actorFaraPremii1);
    film1.getActors().add(actorFaraPremii2);
    film1.getActors().add(actorFaraPremii3);

    Film film4 = new Film(2018, "film cu actori de oscar");
    film1.getActors().add(actorOscar2010);
    film1.getActors().add(actorOscar2018);
    film1.getActors().add(actorFaraPremii2);

    Film film5 = new Film(2010, "film cu actori fara premii");
    film1.getActors().add(actorFaraPremii2);
    film1.getActors().add(actorFaraPremii3);

    Studio studio1 = new Studio("MGM");
    studio1.getFilms().add(film1);
    studio1.getFilms().add(film2);

    Studio studio2 = new Studio("Disney");
    studio2.getFilms().add(film3);
    studio2.getFilms().add(film4);
    studio2.getFilms().add(film5);

    List<Studio> studioDatabase = new ArrayList<>();
    studioDatabase.add(studio1);
    studioDatabase.add(studio2);

    //1. query
    List<String> query1 = new ArrayList<>();
    if(studio1.getFilms().size() > 2){
      query1.add(studio1.getName());
    }
    if(studio2.getFilms().size() > 2){
      query1.add(studio2.getName());
    }
    System.out.println("Query 1");
    query1.forEach(System.out::println);


    List<String> query2 = new ArrayList<>();
    List<Film> studioFilms1 = studio1.getFilms();
    for(Film f : studioFilms1){
      List<Actor> actors = f.getActors();
      for(Actor a : actors){
        if(a.getName().equals("actor cu 2 oscaruri")){
          query2.add(studio1.getName());
        }
      }
    }

    List<Film> studioFilms2 = studio2.getFilms();
    for(Film f : studioFilms2){
      List<Actor> actors = f.getActors();
      for(Actor a : actors){
        if(a.getName().equals("actor cu 2 oscaruri")){
          query2.add(studio2.getName());
        }
      }
    }
    System.out.println("Query 2");
    query2.forEach(System.out::println);

    List<String> query3 = new ArrayList<>();
    List<Film> allFilms = new ArrayList<>();
    allFilms.addAll(studioFilms1);
    allFilms.addAll(studioFilms2);

    allFilms.forEach(f -> {
      List<Actor> actors = f.getActors();
      for(Actor a : actors){
        if(a.getAge() > 50){
          query3.add(f.getName());
          break;
        }
      }
    });
    System.out.println("Query 3");
    query3.forEach(System.out::println);
  }
}

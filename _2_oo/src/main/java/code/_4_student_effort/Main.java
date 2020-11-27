package code._4_student_effort;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    codeChallenge1();

    codeChallenge2();

    codeChallenge3();
  }

  public static void codeChallenge1(){
    Fighter fighterOne = new Fighter("Bogdan",5,3);
    Fighter fighterTwo = new Fighter("Alex",3,4);

    BoxingMatch firstMatch = new BoxingMatch(fighterOne, fighterTwo);

    System.out.println("The winner of the match is: " + firstMatch.fight());
  }

  public static void codeChallenge2(){

    Premiu oscar1990 = new Premiu("oscar", 1990);
    Premiu oscar2000 = new Premiu("oscar", 2000);
    Premiu oscar2010 = new Premiu("oscar", 2010);
    Premiu oscar2018 = new Premiu("oscar", 2018);

    Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, Arrays.asList(oscar1990, oscar2000));
    Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, Arrays.asList(oscar2010));
    Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, Arrays.asList(oscar2018));
    Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, Arrays.asList());
    Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, Arrays.asList());
    Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, Arrays.asList());

    Film film1 = new Film(1990, "film cu actori de oscar",Arrays.asList(actorOscar1990, actorFaraPremii01));
    Film film2 = new Film(2010, "film cu actori fara premii02",Arrays.asList(actorFaraPremii01, actorFaraPremii02, actorFaraPremii03));
    Film film3 = new Film(2010, "film cu actori fara premii03",Arrays.asList(actorFaraPremii01, actorFaraPremii02, actorFaraPremii03));
    Film film4 = new Film(2018, "film cu actori de oscar",Arrays.asList(actorOscar2010, actorOscar2018, actorFaraPremii02));
    Film film5 = new Film(2018, "film cu actori fara premii05",Arrays.asList(actorFaraPremii02, actorFaraPremii03));

    Studio studio1 = new Studio("MGM", Arrays.asList(film1, film2));
    Studio studio2 = new Studio("Disney", Arrays.asList(film3, film4, film5));

    Studio[] studioDatabase = new Studio[]{studio1, studio2};

    System.out.println("\nStudios that have published more than 2 videos:");

    for (Studio stud : studioDatabase){
      if(stud.getFilme().size() > 2){
        System.out.print(stud.getNume());
      }
    }

    System.out.println("\n\nStudio names in which plays the actor named actor cu 2 oscaruri:");

    for(Studio stud : studioDatabase){
      for(Film film : stud.getFilme()){
        for(Actor actor : film.getActori()){
          if(actor.getNume().equals("actor cu 2 oscaruri")){
            System.out.println(stud.getNume());
            break;
          }
        }
      }
    }

    System.out.println("\nMovie names in which plays at least an actor with age above 50:");

    for(Studio stud : studioDatabase){
      for(Film film : stud.getFilme()){
        for(Actor actor : film.getActori()){
          if(actor.getVarsta() > 50){
            System.out.println(film.getNume());
            break;
          }
        }
      }
    }

  }

  public static void codeChallenge3(){

    Fish d = new Fish() ;

    Cat c = new Cat("Fluffy");

    Animal a = new Fish();

    Animal e = new Spider();

    Pet p = new Cat();

    d.setName("Nemo");
    System.out.println("\n" + d.getName());

    d.walk();
    d.eat();
    d.play();

    System.out.println("\n" + c.getName());

    c.walk();
    c.eat();
    c.play();

    System.out.println("\n");

    e.eat();
    e.walk();

  }
}

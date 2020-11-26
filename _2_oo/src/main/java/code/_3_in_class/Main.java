package code._3_in_class;

import code._4_student_effort.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void codeChallenge2() {

    //Stage 2
    Premiu oscar1990 = new Premiu("oscar", 1990);
    Premiu oscar2000 = new Premiu("oscar", 2000);
    Premiu oscar2010 = new Premiu("oscar", 2010);
    Premiu oscar2018 = new Premiu("oscar", 2018);

    Actor actorOscar1990 = new Actor("actor cu 2 oscaruri",35,new Premiu[] {oscar1990,oscar2000});
    Actor actorOscar2010 = new Actor("actor cu oscar din 2010",55,new Premiu[] {oscar2010});
    Actor actorOscar2018 = new Actor("actor cu oscar din 2018",23,new Premiu[] {oscar2018});
    Actor actorFaraPremii01 = new Actor("actor fara oscar 01",33,new Premiu[] {});
    Actor actorFaraPremii02 = new Actor("actor fara oscar 02",60,new Premiu[] {});
    Actor actorFaraPremii03 = new Actor("actor fara oscar 03",20,new Premiu[] {});

    Film film1 = new Film(1990,"film cu actori de oscar",new Actor[]{actorOscar1990,actorFaraPremii01});
    Film film2 = new Film(2010,"film cu actori fara premii2",new Actor[]{actorFaraPremii01,actorFaraPremii02,actorFaraPremii03});
    Film film3 = new Film(2010,"film cu actori fara premii3",new Actor[]{actorFaraPremii01,actorFaraPremii02,actorFaraPremii03});
    Film film4 = new Film(2018,"film cu actori de oscar",new Actor[]{actorOscar2010,actorOscar2018,actorFaraPremii02});
    Film film5 = new Film(2018,"film cu actori fara premii5",new Actor[]{actorFaraPremii02,actorFaraPremii03});

    Studio studio1 = new Studio("MGM",new Film[]{film1,film2});
    Studio studio2 = new Studio("Disney",new Film[]{film3,film4,film5});

    Studio[] studioDatabase = new Studio[]{studio1,studio2};

    //Stage 3

    //Ex 1
    for (Studio studio: studioDatabase) {
      if( studio.getMovies().length >= 2 )
        System.out.println(studio.getName());
    }

    //Ex 2
    for (Studio studio: studioDatabase) {
      for (Film movie : studio.getMovies() ) {
        for (Actor actor: movie.getActors()) {
          if(actor.getName().equals("actor cu 2 oscaruri")){
            System.out.println(studio.getName());
            break;
          }
        }
      }
    }

    //Ex 3
    for (Studio studio: studioDatabase) {
      for (Film movie : studio.getMovies() ) {
        for (Actor actor: movie.getActors()) {
          if(actor.getAge()>50) {
            System.out.println(movie.getName());
            break;
          }
        }
      }
    }


  }
  public static void codeChallenge3(){
    Fish d = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a =  new Fish();
    Animal e = new Spider();
    Pet p = new Cat();

    //Experiment by calling the methods in each object
    d.setName("Fishes");
    d.eat();
    d.play();
    d.walk();
    System.out.println(d.getName());

    c.eat();
    c.play();
    c.walk();
    System.out.println(c.getName());

    a.walk();
    a.eat();

    e.walk();
    e.eat();

    p.play();
    p.setName("Pet");
    System.out.println(p.getName());

    //Experiment by casting objects

    Animal animal = c;
    animal.eat();
    animal.walk();

    Pet pet = c;
    pet.setName("New Fluffy");
    pet.play();
    System.out.println(pet.getName());

    List<Animal> animalList = new ArrayList<>();
    animalList.add(c);
    animalList.add(d);
    animalList.add(a);
    animalList.add(e);

    for (Animal animalTemp : animalList) {
        animalTemp.walk();
        animalTemp.eat();
    }

  }



  public static void main(String[] args) {
    //TODO put your code changes in here

    //codeChallenge2();
    codeChallenge3();
  }




}
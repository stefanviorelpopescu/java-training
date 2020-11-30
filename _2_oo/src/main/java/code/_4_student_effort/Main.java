package code._4_student_effort;


import code._4_student_effort.animalHierarchy.*;
import code._4_student_effort.movieDatabase.Database;

public class Main {

  public static void codeChallenge1(){
    Fighter f1=new Fighter("Doroftei",100,30);
    Fighter f2=new Fighter("Ana",100,30);
    BoxingMatch match=new BoxingMatch(f1,f2);

    System.out.println(match.fight());
  }

  public static void codeChallenge2(){
    Database database=new Database();
    System.out.println("1.Studio names that have published more than 2 movies");
    database.getStudioNameWithMoreThan2Movies();
    System.out.println("2.Studio names in which plays the actor with name <actor cu 2 oscaruri>");
    database.getStudioNameActorWithName("actor cu 2 oscaruri");
    System.out.println("3.Movie names in which plays at least an actor with age above 50 ");
    database.getMovieNameWithActorAboveAge50();
  }

  public static void codeChallenge3(){
    Fish d=new Fish();
    Cat c=new Cat("Fluffy");
    Animal a=new Fish();
    Animal e=new Spider(8);
    Pet p=new Cat("Anda");

    d.eat();
    d.setName("Issy");
   System.out.println(d.getName());
    d.walk();

    c.eat();
    c.play();
    c.setName("Caat");
    System.out.println(c.getName());
    c.walk();

    a.eat();
    a.walk();

    p.play();
    p.setName("Daada");
    System.out.println(p.getName());


  }

  public static void main(String[] args) {
        System.out.println("---Code challenge 1---");
        codeChallenge1();
        System.out.println("---Code challenge 2---");
        codeChallenge2();
        System.out.println();
        System.out.println("---Code challenge 3---");
        codeChallenge3();
  }
}

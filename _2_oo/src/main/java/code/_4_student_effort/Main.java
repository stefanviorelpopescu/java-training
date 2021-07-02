package code._4_student_effort;

public class Main
{
  public static void main(String[] args)
  {
    //Challenge 1
    /*
    Fighter fighter1 = new Fighter("Player1", 100, 80);
    Fighter fighter2 = new Fighter("Player2", 100, 60);
    Match Match = new Match(fighter1, fighter2);

    String winner = Match.fight();

    System.out.println(winner);
     */

    //Challenge 2
    /*
    printAllStudioNamesThatHavePublishedMoreThen2Movies();
    printStudioNamesInWitchPlaysTheActorWithNameActorCu2Oscaruri();
    printMovieNamesInWitchPlaysAtLeastAnActorWithAgeAbove50();
     */

    //Challenge 3
    /*
    Fish d = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();
     */
  }
}

//Challenge 1
class Fighter
{
   String name;
   int health;
   int damagePerAttack;

  public Fighter(String fighterName, int fighterHealth, int fighterDamagePerAttack)
  {
    name = fighterName;
    health = fighterHealth;
    damagePerAttack = fighterDamagePerAttack;
  }

  public void attack(Fighter opponent)
  {
    opponent.health = opponent.health - this.damagePerAttack;
  }
}
class Match
{
  Fighter fighter1;
  Fighter fighter2;

  public Match(Fighter fighter1, Fighter fighter2)
  {
    this.fighter1 = fighter1;
    this.fighter2 = fighter2;
  }

  public String fight()
  {
    while (fighter1.health > 0 && fighter2.health > 0)
    {
      fighter1.attack(fighter2);
      fighter2.attack(fighter1);
    }
    if (fighter1.health <= 0)
    {
      return fighter1.name;
    }
    else
    {
      return fighter2.name;
    }
  }
}

//Challenge 2
class Prize
{
  String name;
  int year;

  public Prize(String name, int year)
  {
    this.name = name;
    this.year = year;
  }
}
class Actor
{
  String name;
  int age;
  Prize[] prizes;

  public Actor(String name, int age, Prize[] prizes)
  {
    this.name = name;
    this.age = age;
    this.prizes = prizes;
  }
}
class Film
{
  String name;
  int appearanceYear;
  Actor[] actors;

  public Film(int appearanceYear, String name, Actor[] actors)
  {
    this.appearanceYear = appearanceYear;
    this.name = name;
    this.actors = actors;
  }
}
class Studio
{
  String name;
  Film[] films;

  public Studio(String name, Film[] films)
  {
    this.name = name;
    this.films = films;
  }
}
class Database
{

  public static Studio[] getData()
  {
    Prize oscar1990 = new Prize("oscar", 1990);
    Prize oscar2000 = new Prize("oscar", 2000);
    Prize oscar2010 = new Prize("oscar", 2010);
    Prize oscar2018 = new Prize("oscar", 2018);

    Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Prize[] { oscar1990, oscar2000 });
    Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Prize[] { oscar2010 });
    Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Prize[] { oscar2018 });
    Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Prize[] { });
    Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Prize[] { });
    Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new Prize[] { });

    Film film1 = new Film(1990, "film cu actori de oscar", new Actor[] { actorOscar1990, actorFaraPremii01 });
    Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[] { actorFaraPremii01, actorFaraPremii02, actorFaraPremii03 });
    Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[] { actorFaraPremii01, actorFaraPremii02, actorFaraPremii03 });
    Film film4 = new Film(2018, "film cu actori de oscar", new Actor[] { actorOscar2010, actorOscar2018, actorFaraPremii02 });
    Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[] { actorFaraPremii02, actorFaraPremii03 });

    Studio studio1 = new Studio("MGM", new Film[] { film1, film2 });
    Studio studio2 = new Studio("Disney", new Film[] { film3, film4, film5 });

    Studio[] studioDatabase = new Studio[] { studio1, studio2 };

    return studioDatabase;
  }

  public static void printAllStudioNamesThatHavePublishedMoreThen2Movies()
  {
    for (Studio studio : getData())
    {
      if (studio.films.length > 2)
      {
        System.out.println(studio.name);
      }
    }
  }

  public static void printStudioNamesInWitchPlaysTheActorWithNameActorCu2Oscaruri()
  {
    for (Studio studio : getData())
    {
      for (Film film : studio.films)
      {
        for (Actor actor : film.actors)
        {
          if (actor.name.equals("Actor with 2 Oscar prizes"))
          {
            System.out.println(studio.name);
          }
        }
      }
    }
  }

  public static void printMovieNamesInWitchPlaysAtLeastAnActorWithAgeAbove50()
  {
    for (Studio studio : getData())
    {
      for (Film film : studio.films)
      {
        for (Actor actor : film.actors)
        {
          if (actor.age > 50)
          {
            System.out.println(film.name);
          }
        }
      }
    }
  }
}

//Challenge 3
abstract class Animal
{
  protected int legs;

  protected Animal(int legs)
  {
    this.legs = legs;
  }

  public abstract void eat();

  public void walk()
  {
    System.out.println("Animal with " + legs + " legs is walking");
  }
}
class Spider extends Animal
{
  public Spider()
  {
    super(8);
  }

  @Override
  public void eat()
  {
    System.out.println("The spider eats");
  }
}
interface Pet {

  String getName();

  void setName(String name);

  void play();
}
class Cat extends Animal implements Pet
{
  private String name;

  public Cat(String name)
  {
    super(4);
    this.name = name;
  }

  public Cat()
  {
    this("");
  }

  @Override
  public void eat()
  {
    System.out.println("Cat " + name + " is eating");
  }

  @Override
  public String getName()
  {
    return this.name;
  }

  @Override
  public void setName(String name)
  {
    this.name = name;
  }

  @Override
  public void play()
  {
    System.out.println("Cat " + name + " is playing");
  }
}
class Fish extends Animal implements Pet
{
  private String name;

  public Fish()
  {
    super(0);
  }

  @Override
  public void eat()
  {
    System.out.println("Fish is eating");
  }

  @Override
  public void walk()
  {
    System.out.println("Fish can't walk");
  }

  @Override
  public String getName()
  {
    return this.name;
  }

  @Override
  public void setName(String name)
  {
    this.name = name;
  }

  @Override
  public void play()
  {
    System.out.println("Fish is playing");
  }
}

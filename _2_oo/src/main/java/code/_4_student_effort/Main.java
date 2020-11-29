package code._4_student_effort;

public class Main {

  public static void CodeChallenge1() {

    Fighter Mihai = new Fighter("Mihai", 100, (int) (Math.random()*10)+1);
    Fighter Dorel = new Fighter("Dorel", 100, (int) (Math.random()*10)+1);

    BoxingMatch boxingMatch = new BoxingMatch(Mihai,Dorel);
    System.out.println(boxingMatch.fight());
  }


  public static void CodeChallenge2() {

    Premiu oscar1990 = new Premiu("oscar", 1990);
    Premiu oscar2000 = new Premiu("oscar", 2000);
    Premiu oscar2010 = new Premiu("oscar", 2010);
    Premiu oscar2018 = new Premiu("oscar", 2018);

    Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
    Actor actorOscar2010 = new Actor("actor cu oscar din 2010", 55, new Premiu[]{oscar2010});
    Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
    Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
    Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
    Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

    Film film1 = new Film(1990, "film cu actori oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
    Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    Film film4 = new Film(2018, "film cu actori de oscar2018", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
    Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

    Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
    Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

    // Get all studio names that have published more than 2 movies
    Studio arrayStudio[] = new Studio[]{studio1, studio2};
    String firstObjective = "";
    for (int i = 0; i < arrayStudio.length; i++) {
      if (arrayStudio[i].getNumbersOfFilms() > 2) {
        firstObjective += arrayStudio[i].getNume() + " ";
      }
    }
    System.out.println(firstObjective + "\n");

    // Get the studio names in witch plays the actor with name "actor cu 2 oscaruri"
    String secondObjective = "";

    // how many studios we have
    for (int i = 0; i < arrayStudio.length; i++) {
      // for every studio how many films exists
      for (int j = 0; j < arrayStudio[i].getNumbersOfFilms(); j++) {
        // for every film how many actors played
        for (int k = 0; k < arrayStudio[i].getFilme(j).getLenghtOfActori(); k++) {
          // we search for our actor
          if (arrayStudio[i].getFilme(j).getActori(k).getNume() == "actor cu 2 oscaruri") {
            // search to find if the studio is already in our string
            if (!secondObjective.contains(arrayStudio[i].getNume())) {
              secondObjective += arrayStudio[i].getNume() + " ";
            }
          }
        }
      }
    }
    System.out.println(secondObjective + "\n");

    // get movie names in witch plays at least an actor with age above 50
    String thirdObjective = "";

    // how many studios we have
    for (int i = 0; i < arrayStudio.length; i++) {
      // for every studio how many films exists
      for (int j = 0; j < arrayStudio[i].getNumbersOfFilms(); j++) {
        // for every film how many actors played
        for (int k = 0; k < arrayStudio[i].getFilme(j).getLenghtOfActori(); k++) {
          // search to find if the movies has any actors with age above 50
          if (arrayStudio[i].getFilme(j).getActori(k).getVarsta() > 50) {
            if (!thirdObjective.contains(arrayStudio[i].getFilme(j).getNume())) {
              thirdObjective += arrayStudio[i].getFilme(j).getNume() + "\n";
            }
          }
        }
      }
    }
    System.out.println(thirdObjective);
  }


  public static void CodeChallenge3() {

    Fish d = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();

    // all methods from Fish d = new Fish();
    System.out.println("Fish name: " + d.getName());
    d.play();
    d.setName("Nemo");
    d.play();
    d.walk();
    d.eat();
    System.out.println("\n");

    // all methods from Cat c = new Cat("Fluffly);
    System.out.println("Cat name: " + c.getName());
    System.out.println("Number of legs: " + c.legs);
    c.eat();
    c.play();
    c.walk();
    System.out.println("\n");

    // all methods from Animal a = new Fish();
    System.out.println("Number of legs of Animal a = new Fish() -> " + a.legs);
    a.eat();
    a.walk();
    System.out.println("\n");

    // all methods from Animal e = new Spider();
    System.out.println("Number of legs of Animal e = new Spider() -> " + e.legs);
    e.walk();
    e.eat();
    System.out.println("\n");

    // all methods from Pet p = new Cat();
    System.out.println("Name: " + p.getName());
    p.play();
    p.setName("Tom");
    System.out.println(p.getName());
  }

  public static void main(String[] args) {
    //TODO put your code changes in here

    //CodeChallenge1();
    //CodeChallenge2();
    CodeChallenge3();
  }
}

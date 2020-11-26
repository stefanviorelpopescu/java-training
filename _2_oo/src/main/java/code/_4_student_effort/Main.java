package code._4_student_effort;


public class Main {

  public static void CodeChallenge1() {
    Fighter f1 = new Fighter("Rocky Balboa", 100, 13);
    Fighter f2 = new Fighter("Muhammad Ali", 100, 18);

    BoxingMatch match = new BoxingMatch(f1,f2);

    System.out.println(match.fight());

  }


  public static void CodeChallenge2(){
    Premiu oscar1990 = new Premiu("Oscar", 1990);
    Premiu oscar2000 = new Premiu("Oscar", 2000);
    Premiu oscar2010 = new Premiu("Oscar", 2010);
    Premiu oscar2018 = new Premiu("Oscar", 2018);

    Actor actorOscar1990 = new Actor("Actor cu 2 Oscar-uri", 35, new Premiu[] {oscar1990, oscar2000});
    Actor actorOscar2010 = new Actor("Actor cu Oscar din 2000", 55, new Premiu[] {oscar2010});
    Actor actorOscar2018 = new Actor("Actor cu Oscar din 2018", 23, new Premiu[] {oscar2018});
    Actor actorFaraPremii01 = new Actor("Actor fara Oscar 01", 33, new Premiu[]{});
    Actor actorFaraPremii02 = new Actor("Actor fara Oscar 02", 60, new Premiu[]{});
    Actor actorFaraPremii03 = new Actor("Actor fara Oscar 03", 20, new Premiu[]{});

    Film film1 = new Film(1990,"Film cu actori de Oscar", new Actor[] {actorOscar1990, actorFaraPremii01});
    Film film2 = new Film(2010,"Film cu actori fara premii 2", new Actor[] {actorFaraPremii01,actorFaraPremii02, actorFaraPremii03});
    Film film3 = new Film(2010,"Film cu actori fara premii 3", new Actor[] {actorFaraPremii01,actorFaraPremii02, actorFaraPremii03});
    Film film4 = new Film(2018,"Film cu actori de Oscar", new Actor[] {actorOscar2010, actorOscar2018, actorFaraPremii02});
    Film film5 = new Film(2018,"Film cu actori fara premii 5", new Actor[] {actorFaraPremii02, actorFaraPremii03});

    Studio studio1 = new Studio("MGM", new Film[] {film1, film2});
    Studio studio2 = new Studio("Disney", new Film[] {film3, film4, film5});

    Studio[] studioDatabase = new Studio [] {studio1, studio2};

    System.out.println(Studio.checkStudio(studioDatabase));
    System.out.println(Studio.checkActor(studioDatabase));
    System.out.println(Studio.checkMovie(studioDatabase));


  }


  public static void CodeChallenge3(){
    Fish d = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();

    // -------- The Fish Object ----------
    d.setName("Jabba the Hut");
    System.out.println("The fish name is:  " + d.getName());
    System.out.println("The fish has: " + d.legs + " legs.");
    d.walk();
    d.eat();
    d.play();


    // -------- The Cat Object ----------
    System.out.println("\nThe cat name is:  " + c.getName());
    System.out.println("The cat has: " + c.legs + " legs.");
    c.walk();
    c.eat();
    c.play();


    // -------- The Animal Objects ----------

    System.out.println("\nFish animal object: ");
    Fish aAfterCast = (Fish)a;
    aAfterCast.setName("Jabba the Hut Jr. ");
    System.out.println("The fish name is: " + aAfterCast.getName());
    System.out.println("The fish has: " + aAfterCast.legs + " legs.");
    a.walk();
    a.eat();
    aAfterCast.play();

    System.out.println("\nSpider animal object: ");
    System.out.println("The spider has: " + e.legs + " legs.");
    e.walk();
    e.eat();


    // -------- The Pet Objects ----------
    p.setName("Fluffy the Second");
    System.out.println("\nThe cat name is:  " + p.getName());
    Animal pAfterCast = (Animal)p;
    System.out.println("The cat has: " + pAfterCast.legs + " legs.");
    pAfterCast.walk();
    pAfterCast.eat();
    p.play();

    // ------ Super class methods ------
    System.out.println("\nSuper class methods: ");
    System.out.println("Fish object calls super method: ");
    d.superWalk();
    System.out.println("Fish cast calls super method: ");
    aAfterCast.superWalk();


  }

  public static void main(String[] args) {
    System.out.println("Result for Code Challenge 1: ");
    CodeChallenge1();


    System.out.println("\nResult for Code Challenge 2: ");
    CodeChallenge2();

    System.out.println("\nResult for Code Challenge 3: ");
    CodeChallenge3();

  }

}

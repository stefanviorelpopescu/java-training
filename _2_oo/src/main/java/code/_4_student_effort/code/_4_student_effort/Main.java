package code._4_student_effort;

public class Main {
  static void MovieDatabase(){
    Premiu oscar1990 = new Premiu("oscar", 1990);
    Premiu oscar2000 = new Premiu("oscar", 2000);
    Premiu oscar2010 = new Premiu("oscar", 2010);
    Premiu oscar2018 = new Premiu("oscar", 2018);

    Actor actoroscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
    Actor actoroscar2010 = new Actor("actor cu oscar din 2000", 55, new Premiu[]{oscar2010});
    Actor actoroscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
    Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
    Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
    Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});

    Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actoroscar1990, actorFaraPremii01});
    Film film2 = new Film(2010, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    Film film3 = new Film(2010, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
    Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actoroscar2010, actoroscar2018, actorFaraPremii02});
    Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

    Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
    Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});

    Studio[] studioDatabase = new Studio[]{studio1, studio2};

    //solving Stage 3 - Requirements

    //1. Get all studio names that have published more than 2 movies
    System.out.println("Studio names with more than 2 movies published:");
    int i = 0;
    for (Studio s : studioDatabase){
      if(s.filme.length > 2){
        i++;
        System.out.println(i + ". " + s.nume);
      }
    }
    System.out.println();

    //2. Get the studio names in which plays the actor with name "actor cu 2 oscaruri"

    System.out.println("Studio names in which plays the actor with name ''actor cu 2 oscaruri'':");
    i = 0;
    for(Studio s : studioDatabase){
      boolean contains = false;
      for(Film f : s.filme){
        for(Actor a : f.actori){
          if(a.nume.equals("actor cu 2 oscaruri") && !contains) {
            contains = true;
            i++;
            System.out.println(i + ". " + s.nume);
          }
        }
      }
    }
    System.out.println();

    //3. Get movie names in which plays at least an actor with age above 50

    System.out.println("Movies names in which plays at least an actor with age above 50:");
    i = 0;
    for(Studio s : studioDatabase){
      for(Film f : s.filme){
        boolean contains = false;
        for(Actor a : f.actori){
          if(a.varsta > 50 && !contains){
            contains = true;
            i++;
            System.out.println(i + ". " + f.nume);
          }
        }
      }
    }
  }

  static void AnimalHierarchy(){
    Fish d = new Fish();
    Cat c = new Cat("Fluffy");
    Animal a = new Fish();
    Animal e = new Spider();
    Pet p = new Cat();

    d.eat();
    d.play();
    d.walk();
    d.setName("Nemo");
    System.out.println(d.getName());
    c.eat();
    c.walk();
    c.play();
    System.out.println(c.getName());
    Fish g = (Fish) a;

    g.eat();
    g.walk();
    g.setName("John");
    System.out.println(g.getName());
    e.walk();
    e.eat();
    p.play();
    p.setName("Jerry");
    System.out.println(p.getName());
    p.play();
  }
  public static void main(String[] args) {
    //TODO put your code changes in here
    //MovieDatabase();
    //AnimalHierarchy();
  }
}

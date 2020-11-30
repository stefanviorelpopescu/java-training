package code._4_student_effort;

public class Main {

  public static void challenge1() {
    Fighter fighter1 = new Fighter("Sub-Zero", 100, 17);
    Fighter fighter2 = new Fighter("Scorpio", 100, 20);

    BoxingMatch newMatch;
    newMatch = new BoxingMatch(fighter1, fighter2);

    System.out.println(newMatch.fight());
  }

    public static void challenge2() {

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

        // 1. Get all studio names that have published more than 2 movies
        Studio arrayOfStudio[] = new Studio[]{studio1, studio2};
        String firstOutput = "";
        for (int i = 0; i < arrayOfStudio.length; i++) {
            if (arrayOfStudio[i].getNumbersOfFilms() > 2) {
                firstOutput += arrayOfStudio[i].getNume() + " ";
            }
        }
        System.out.println(firstOutput + "\n");

        // 2. Get the studio names in which plays the actor with name "actor cu 2 oscaruri"
        String secondOutput = "";

        for (int i = 0; i < arrayOfStudio.length; i++) {
            for (int j = 0; j < arrayOfStudio[i].getNumbersOfFilms(); j++) {
                for (int k = 0; k < arrayOfStudio[i].getFilme(j).getLenghtOfActori(); k++) {
                    if (arrayOfStudio[i].getFilme(j).getActori(k).getNume() == "actor cu 2 oscaruri") {
                        if (secondOutput.contains(arrayOfStudio[i].getNume())) {
                            secondOutput += arrayOfStudio[i].getNume() + " ";
                        }
                    }
                }
            }
        }
        System.out.println(secondOutput + "\n");

        // 3. Get movie names in witch plays at least an actor with age above 50
        String thirdOutput = "";

        for (int i = 0; i < arrayOfStudio.length; i++) {
            for (int j = 0; j < arrayOfStudio[i].getNumbersOfFilms(); j++) {
                for (int k = 0; k < arrayOfStudio[i].getFilme(j).getLenghtOfActori(); k++) {
                    if (arrayOfStudio[i].getFilme(j).getActori(k).getVarsta() > 50) {
                        if (!thirdOutput.contains(arrayOfStudio[i].getFilme(j).getNume())) {
                            thirdOutput += arrayOfStudio[i].getFilme(j).getNume() + "\n";
                        }
                    }
                }
            }
        }
        System.out.println(thirdOutput);
    }

    public static void challenge3() {

        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        System.out.println("Fish name: " + d.getName());
        d.play();
        d.setName("Nemo");
        d.play();
        d.walk();
        d.eat();
        System.out.println("\n");

        System.out.println("Cat name: " + c.getName());
        System.out.println("Number of legs: " + c.legs);
        c.eat();
        c.play();
        c.walk();
        System.out.println("\n");

        System.out.println("Number of legs of Animal a = new Fish() -> " + a.legs);
        a.eat();
        a.walk();
        System.out.println("\n");

        System.out.println("Number of legs of Animal e = new Spider() -> " + e.legs);
        e.walk();
        e.eat();
        System.out.println("\n");

        System.out.println("Name: " + p.getName());
        p.play();
        p.setName("Tom");
        System.out.println(p.getName());
    }

  public static void main(String[] args) {
    //TODO put your code changes in here
    System.out.println("Output of Code Challenge1: ");
    //challenge1();

    System.out.println("Output of Code Challenge2: ");
    //challenge2();

    System.out.println("Output of Code Challenge3: ");
    challenge3();
  }

}

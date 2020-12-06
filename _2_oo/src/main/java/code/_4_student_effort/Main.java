package code._4_student_effort;

public class Main {

    public static void movieDataBase() {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);
        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actpr cu oscar din 2000", 55, new Premiu[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Premiu[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Premiu[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Premiu[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 03", 20, new Premiu[]{});
        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Film film2 = new Film(2000, "film cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film3 = new Film(1990, "film cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Film film4 = new Film(2018, "film cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Film film5 = new Film(2018, "film cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});
        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});
        Studio[] studioDatabase = new Studio[]{studio1, studio2};
        //punctul 1

        for (Studio i : studioDatabase) {
            if (i.filme.length > 2) {
                System.out.println(i.nume+" a publicat mai mult de 2 filme");
            }
        }

        //punctul 2
        for (Studio i : studioDatabase) {
            boolean ok = false;
            for (Film f : i.filme) {
                for (Actor a : f.actori) {
                    if (a.nume.equals("actor cu 2 oscaruri")) {
                        ok = true;
                    }
                }
            }
            if (ok) System.out.println("actorul cu 2 oscaruri joaca in studio-ul " + i.nume);
        }
        //punctul 3
        for (Studio i : studioDatabase) {
            for (Film f : i.filme) {
                Integer count = 0;
                for (Actor a : f.actori) {
                    if (a.varsta > 50) count++;
                }
                if (count > 0)
                    System.out.println("cel putin un actor cu o varsta mai mare de 50 de ani joaca in filmul " + f.nume);
            }
        }
    }

    static void testAnimals(){
        Fish d = new Fish();
       Cat c = new Cat("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();
        d.eat();
        c.play();
        a.eat();
        a.walk();
        e.eat();
        p.play();
    }

    public static void main(String[] args) {

        //TODO put your code changes in here
        Main.movieDataBase();
        Main.testAnimals();
    }
}

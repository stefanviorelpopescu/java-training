package code._4_student_effort.Challenge2;

public class Main {
    public static void main(String[] args) {
        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2020 = new Premiu("oscar", 2020);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 55, new Premiu[] {oscar1990, oscar2010});
        Actor actorOscar2000 = new Actor("actor cu 1 oscar", 29, new Premiu[] {oscar2000});
        Actor actorFaraPremiu1 = new Actor("actor fara premii 1", 45, new Premiu[] {});
        Actor actorFaraPremiu2 = new Actor("actor fara premii 2", 25, new Premiu[] {});

        Film film1 = new Film(1990, "film cu actori de oscar", new Actor[]{actorOscar1990, actorOscar2000});
        Film film2 = new Film(2019, "film cu actori fara premii", new Actor[]{actorFaraPremiu1, actorFaraPremiu2});
        Film film3 = new Film(2020, "film cu actori cu si fara premii", new Actor[]{actorOscar1990, actorOscar2000, actorFaraPremiu1, actorFaraPremiu2});
        Film film4 = new Film(2020, "film 2000 +", new Actor[]{actorOscar2000, actorFaraPremiu1, actorFaraPremiu2});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2, film4});
        Studio studio2 = new Studio("Warner Bros", new Film[]{film3});

        Studio[] studioDB = new Studio[]{studio1, studio2};

        System.out.println("Studio-uri cu mai mult de 2 filme: ");
        for (Studio studio: studioDB) {
            if(studio.hasMoreThan2Movies()) System.out.println(studio.getNume());
        }

        System.out.println("Studio-uri cu actori care au numele actor cu 2 oscaruri ");
        for (Studio studio: studioDB) {
            if(studio.areActoriCuNumele("actor cu 2 oscaruri")) System.out.println(studio.getNume());
        }

        System.out.println("Filme cu actori peste 50 de ani. ");
        for (Studio studio: studioDB) {
            System.out.println(studio.filmeCuActoriPeste50());
        }
    }
}

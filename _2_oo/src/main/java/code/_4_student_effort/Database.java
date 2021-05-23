package code._4_student_effort;

public class Database {
    public static Studio[] getData() {


        Premiu oscar1990 = new Premiu("oscar", 1990);
        Premiu oscar2000 = new Premiu("oscar", 2000);
        Premiu oscar2010 = new Premiu("oscar", 2010);
        Premiu oscar2018 = new Premiu("oscar", 2018);

        Actor actorOscar1990 = new Actor("Actor cu doua premii Oscar", 45, new Premiu[]{oscar1990, oscar2000});
        Actor actorOscar2018 = new Actor("Actor cu un singur Oscar 2018", 50, new Premiu[]{oscar2018});
        Actor actorOscar2010 = new Actor("Actor cu un singur Oscar 2010", 45, new Premiu[]{oscar2010});
        Actor actorFaraPremiu1 = new Actor("Actor fara premii Oscar 1", 34, new Premiu[]{});
        Actor actorFaraPremiu2 = new Actor("Actor fara Oscar 2", 55, new Premiu[]{});
        Actor actoriFaraPremiu3 = new Actor("Actor fara premiu 3", 25, new Premiu[]{});

        Film film1 = new Film(1990, "Film cu actori de Oscar", new Actor[]{actorOscar1990, actorFaraPremiu2});
        Film film2 = new Film(2010, "Film 1 cu actori fara premii", new Actor[]{actorFaraPremiu1, actoriFaraPremiu3});
        Film film3 = new Film(2010, "Film 2 cu actori fara premii", new Actor[]{actorOscar1990,actorFaraPremiu1, actorFaraPremiu2});
        Film film4 = new Film(2010, "Film 3 cu actori fara premii", new Actor[]{actorFaraPremiu2, actoriFaraPremiu3});
        Film film5 = new Film(2018, "Film cu actori de Oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremiu1});

        Studio studio1 = new Studio("MGM", new Film[]{film1, film2});
        Studio studio2 = new Studio("Disney", new Film[]{film3, film4, film5});
        Studio[] studioDatabase = new Studio[]{studio1, studio2};
        return studioDatabase;


    }


    public static void StuidosWithMoreThan2Movies() {
        for (Studio studio : getData()) {
            if (studio.filme.length >= 2) {
                System.out.println(studio.nume);
            }
        }
    }

    public static void MoviesWithActorWith2Oscars() {
        for (Studio studio : getData()) {
            for(Film film : studio.filme){
                for (Actor actor: film.actori){
                    if (actor.nume.equals("Actor cu doua premii Oscar")){
                        System.out.println(film.nume);
                    }
                }
            }

        }
    }
    public static void MovieNamesWithActorsOlderThan40(){
        for (Studio studio : getData()){
            for (Film film : studio.filme){
                for (Actor actor : film.actori){
                    if (actor.varsta > 40){
                        System.out.println(film.nume);
                    }
                }
            }
        }
    }

    public static void main (String [] args){
        StuidosWithMoreThan2Movies();
        MoviesWithActorWith2Oscars();
        MovieNamesWithActorsOlderThan40();

    }

}
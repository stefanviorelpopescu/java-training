package main.java.code._4_student_effort.movie_database;

public class Database {
    public static void main(String[] args) {
        Award oscar1990 = new Award("Oscar", 1990);
        Award oscar2000 = new Award("Oscar", 2000);
        Award oscar2010 = new Award("Oscar", 2010);
        Award oscar2018 = new Award("Oscar", 2018);

        Actor actorOscar1990 = new Actor("Actor that won 2 Oscars", 35, new Award[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("Actor that won an Oscar in 2000", 55, new Award[]{oscar2010});
        Actor actorOscar2018 = new Actor("Actor that won an Oscar in 2018", 23, new Award[]{oscar2018});
        Actor actorWithNoAwards01 = new Actor("Actor with no Oscar 01", 33, new Award[]{});
        Actor actorWithNoAwards02 = new Actor("Actor with no Oscar 02", 60, new Award[]{});
        Actor actorWithNoAwards03 = new Actor("Actor with no Oscar 02", 20, new Award[]{});

        Movie movie1 = new Movie(1990, "Movie with actors that won Oscars", new Actor[]{actorOscar1990, actorOscar2018});
        Movie movie2 = new Movie(2010, "Movie with no awards2", new Actor[]{actorWithNoAwards01, actorWithNoAwards02, actorWithNoAwards03});
        Movie movie3 = new Movie(2010, "Movie with actors that won no Oscars", new Actor[]{actorWithNoAwards01, actorWithNoAwards02, actorWithNoAwards03});
        Movie movie4 = new Movie(2018, "Movie with actors that won Oscars", new Actor[]{actorOscar2010, actorOscar2018, actorOscar2010});
        Movie movie5 = new Movie(2018, "Movie with no awards5", new Actor[]{actorWithNoAwards02, actorWithNoAwards03});

        Studio studio1 = new Studio("MGM", new Movie[]{movie1, movie2});
        Studio studio2 = new Studio("Disney", new Movie[]{movie3, movie4, movie5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};

        System.out.println("Studio names that have published more than 2 movies are: ");
        for (Studio studio : studioDatabase) {
            if (studio.getMovies().length > 2) {
                System.out.println(studio.getName());
            }
        }

        System.out.print("\nThe studio in which plays the actor with name \"Actor that won 2 Oscars\" is ");
        for (Studio studio : studioDatabase) {
            for (Movie movie : studio.getMovies()) {
                for (Actor actor : movie.getActors()) {
                    if (actor.getName().equals("Actor that won 2 Oscars")) {
                        System.out.print(studio.getName());
                    }
                }
            }
        }

        System.out.println("\n\nThe movie names in which plays at least an actor with age above 50: ");
        for (Studio studio : studioDatabase) {
            for (Movie movie : studio.getMovies()) {
                for (Actor actor : movie.getActors()) {
                    if (actor.getAge() > 50) {
                        System.out.println(movie.getName());
                    }
                }
            }
        }
    }
}

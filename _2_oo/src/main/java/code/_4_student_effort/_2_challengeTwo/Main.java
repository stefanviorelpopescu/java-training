package code._4_student_effort._2_challengeTwo;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        /* Challenge two */
        System.out.println("Challenge two");
        System.out.println();

        Prize oscar1990 = new Prize("oscar", 1990);
        Prize oscar2000= new Prize("oscar", 2000);
        Prize oscar2010 = new Prize("oscar", 2010);
        Prize oscar2018 = new Prize("oscar", 2018);

        Actor actorOscar1990 = new Actor("Actor with 2 Oscars", 35, new Prize[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("Actor with 2010s Oscar", 55, new Prize[]{oscar2010});
        Actor actorOscar2018 = new Actor("Actor with 2018s Oscar", 23, new Prize[]{oscar2018});
        Actor actorWithoutPrize01 = new Actor("Actor without a prize 01", 33, new Prize[]{});
        Actor actorWithoutPrize02 = new Actor("Actor without a prize 02", 60, new Prize[]{});
        Actor actorWithoutPrize03 = new Actor("Actor without a prize 03", 20, new Prize[]{});

        Movie movie1 = new Movie(2010, "Movie with Oscar actors 01", new Actor[]{actorOscar1990, actorOscar2010});
        Movie movie2 = new Movie(1990, "Movie without Oscar actors 01", new Actor[]{actorWithoutPrize01, actorWithoutPrize02, actorWithoutPrize03});
        Movie movie3 = new Movie(1985, "Movie without Oscar actors 02", new Actor[]{actorWithoutPrize01, actorWithoutPrize02, actorWithoutPrize03});
        Movie movie4 = new Movie(2018, "Movie with Oscar actors 02", new Actor[]{actorOscar2018, actorOscar2010, actorWithoutPrize02});
        Movie movie5 = new Movie (2018, "Movie without Oscar actors 03", new Actor[]{actorWithoutPrize02, actorWithoutPrize03});

        Studio studio1 = new Studio("MGM", new Movie[]{movie1, movie2});
        Studio studio2 = new Studio("Disney", new Movie[]{movie3, movie4, movie5});

        Studio[] studioDatabase = new Studio[] {studio1, studio2};

        // stage 3.1

        for (Studio studio : studioDatabase) {
            if (studio.getMovies().length >= 2) {
                System.out.println("Studios with more than 2 published movies are: " + studio.getName() + ".");
            }
        }
        System.out.println();

        // stage 3.2

        for (Studio studio : studioDatabase) {
            for (Movie movie : studio.getMovies()) {
                for (Actor actor : movie.getActors()) {
                    if (actor.getName().equals("Actor with 2 Oscars")) {
                        System.out.println("Studios in which 'actor with 2 oscars' is playing are: " + studio.getName() + ".");
                    }
                }
            }
        }
        System.out.println();

        // stage 3.3

        HashSet<Movie> movies = new HashSet<>();
        for (Studio studio : studioDatabase) {
            for (Movie movie : studio.getMovies()) {
                for (Actor actor : movie.getActors()) {
                    if (actor.getAge() > 50) {
                        movies.add(movie);
                    }
                }
            }
        }
        for (Movie movie : movies) {
            System.out.println("Movies in which are playing actors above 50 yo are: " + movie.getName() + ".");
        }
        System.out.println();
    }
}

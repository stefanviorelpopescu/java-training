package code._4_student_effort;

public class Database {
    public static void main(String[] args) {
        // Stage 2
        Award oscar1990 = new Award("Oscar", 1990);
        Award oscar2000 = new Award("Oscar", 2000);
        Award oscar2010 = new Award("Oscar", 2010);
        Award oscar2018 = new Award("Oscar", 2018);

        Actor actorOscar1990 = new Actor("Actor with 2 Oscars", 35, new Award[]{oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("Actor with one Oscar in 2000", 55, new Award[]{oscar2010});
        Actor actorOscar2018 = new Actor("Actor with one Oscar in 2018", 23, new Award[]{oscar2018});
        Actor actorWithNoAwards01 = new Actor("Actor without Oscar 01", 33, new Award[]{});
        Actor actorWithNoAwards02 = new Actor("Actor without Oscar 02", 60, new Award[]{});
        Actor actorWithNoAwards03 = new Actor("Actor without Oscar 03", 20, new Award[]{});

        Movie movie1 = new Movie(1990, "Movie with Oscar actors", new Actor[]{actorOscar1990, actorWithNoAwards01});
        Movie movie2 = new Movie(2010, "Movie with actors without awards2", new Actor[]{actorWithNoAwards01, actorWithNoAwards02, actorWithNoAwards03});
        Movie movie3 = new Movie(2010, "Movie with actors without awards3", new Actor[]{actorWithNoAwards01, actorWithNoAwards02, actorWithNoAwards03});
        Movie movie4 = new Movie(2018, "Movie with Oscar actors", new Actor[]{actorOscar2010, actorOscar2018, actorWithNoAwards02});
        Movie movie5 = new Movie(2018, "Movie with actors without awards5", new Actor[]{actorWithNoAwards02, actorWithNoAwards03});

        Studio studio1 = new Studio("MGM", new Movie[]{movie1, movie2});
        Studio studio2 = new Studio("Disney", new Movie[]{movie3, movie4, movie5});

        Studio[] studioDatabase = new Studio[]{studio1, studio2};
        // Stage 3
        // Stage 3.1
        System.out.println("Studio names that have published more than 2 movies:");
        for(Studio studio : studioDatabase){
            if(studio.movies.length>=2){
                System.out.println("The studio with more than 2 published movies is : " + studio.name );
            }
        }
        System.out.println();
        //Stage 3.2
        System.out.println("Studio name in witch plays the actor with name \"Actor with 2 Oscars\" :");
        for (Studio studio : studioDatabase){
            for(Movie movie : studio.movies){
                for(Actor actor : movie.actors){
                    if(actor.name.equals("Actor with 2 Oscars")){
                        System.out.println(studio.name);
                    }
                }
            }
        }
        System.out.println();
        //Stage 3.3
        System.out.println("Movies in witch plays at least an actor with age above 50:");
        for(Studio studio : studioDatabase){
            for(Movie movie : studio.movies){
                for (Actor actor : movie.actors) {
                    if (actor.age>50){
                        System.out.println(movie.name);
                    }
                }
            }
        }
    }
}

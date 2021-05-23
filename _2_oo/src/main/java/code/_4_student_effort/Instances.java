package code._4_student_effort;

public class Instances {
    public static Studio[] instantiate() {
        Award oscar1990 = new Award("oscar", 1990);
        Award oscar2000 = new Award("oscar", 2000);
        Award oscar2010 = new Award("oscar", 2010);
        Award oscar2018 = new Award("oscar", 2018);

        Actor actorOscar1990 = new Actor("actor cu 2 oscaruri", 35, new Award[]{
                oscar1990, oscar2000});
        Actor actorOscar2010 = new Actor("actor cu oscar din 2000", 55, new Award[]{oscar2010});
        Actor actorOscar2018 = new Actor("actor cu oscar din 2018", 23, new Award[]{oscar2018});
        Actor actorFaraPremii01 = new Actor("actor fara oscar 01", 33, new Award[]{});
        Actor actorFaraPremii02 = new Actor("actor fara oscar 02", 60, new Award[]{});
        Actor actorFaraPremii03 = new Actor("actor fara oscar 02", 20, new Award[]{});

        Movie Movie1 = new Movie(1990, "Movie cu actori de oscar", new Actor[]{actorOscar1990, actorFaraPremii01});
        Movie Movie2 = new Movie(2010, "Movie cu actori fara premii2", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Movie Movie3 = new Movie(2010, "Movie cu actori fara premii3", new Actor[]{actorFaraPremii01, actorFaraPremii02, actorFaraPremii03});
        Movie Movie4 = new Movie(2018, "Movie cu actori de oscar", new Actor[]{actorOscar2010, actorOscar2018, actorFaraPremii02});
        Movie Movie5 = new Movie(2018, "Movie cu actori fara premii5", new Actor[]{actorFaraPremii02, actorFaraPremii03});

        Studio studio1 = new Studio("MGM", new Movie[]{Movie1, Movie2});
        Studio studio2 = new Studio("Disney", new Movie[]{Movie3, Movie4, Movie5});
        Studio[] studioInstances = new Studio[]{studio1, studio2};
        return studioInstances;
    }

    //method to return all studio names with more than 2 movies produced
    public static void studioName() {
        for (Studio studio : instantiate()) {
            if (studio.movie.length > 2) {
                System.out.println(studio.name);
            }
        }
    }

    //method that returns all studios with the actor "actor cu 2 oscaruri"
    public static void studioOfActor() {
        for (Studio studio : instantiate()) {
            for (Movie movie : studio.movie) {
                for (Actor actor : movie.actors) {
                    if (actor.name.equals("actor cu 2 oscaruri")) {
                        System.out.println(studio.name);
                    }
                }
            }
        }
    }

    //method that returns movies of actors older than 50
    public static void moviesOfActor() {
        for (Studio studio : instantiate()) {
            for (Movie movie : studio.movie) {
                for (Actor actor : movie.actors) {
                    if (actor.age > 50) {
                        System.out.println(movie.name);
                    }
                }
            }
        }
    }
}

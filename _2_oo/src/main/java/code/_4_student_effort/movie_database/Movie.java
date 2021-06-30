package main.java.code._4_student_effort.movie_database;

public class Movie {
    private Integer releaseYear;
    private String name;
    private Actor[] actors;

    public Movie(Integer releaseYear, String name, Actor[] actors) {
        this.releaseYear = releaseYear;
        this.name = name;
        this.actors = actors;
    }

    public Actor[] getActors() {
        return actors;
    }

    public String getName() {
        return name;
    }
}

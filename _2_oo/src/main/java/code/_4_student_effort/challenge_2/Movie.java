package code._4_student_effort.challenge_2;

public class Movie {
    private Integer year;
    private String name;
    private Actor[] actors;

    public Movie(Integer year, String name, Actor[] actors) {
        this.year = year;
        this.name = name;
        this.actors = actors;
    }

    public Integer getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public Actor[] getActors() {
        return actors;
    }
}

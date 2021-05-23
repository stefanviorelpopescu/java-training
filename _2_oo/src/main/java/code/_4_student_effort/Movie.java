package code._4_student_effort;

public class Movie {
    public Integer releaseYear;
    public String name;
    public Actor[] actors;

    public Movie(Integer releaseYear,String name, Actor[] actors){
        this.releaseYear = releaseYear;
        this.name = name;
        this.actors = actors;
    }
}

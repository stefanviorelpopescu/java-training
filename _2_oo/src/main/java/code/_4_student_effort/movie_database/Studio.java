package main.java.code._4_student_effort.movie_database;

public class Studio {
    private String name;
    private Movie[] movies;

    public Studio(String name, Movie[] movies) {
        this.name = name;
        this.movies = movies;
    }

    public Movie[] getMovies() {
        return movies;
    }

    public String getName() {
        return name;
    }
}

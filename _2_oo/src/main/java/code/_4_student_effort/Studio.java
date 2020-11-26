package code._4_student_effort;

public class Studio {
    private String name;
    private Film[] movies;

    public Studio(){}

    public Studio(String name, Film[] movies) {
        this.name = name;
        this.movies = movies;
    }

    public String getName() {
        return name;
    }

    public Film[] getMovies() {
        return movies;
    }
}

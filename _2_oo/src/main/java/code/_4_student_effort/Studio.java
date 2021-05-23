package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Studio {
    private String name;
    private List<Film> films;

    public Studio(String name) {
        this.name = name;
        this.films = new ArrayList<>();
    }

    public List<Film> getFilms() {
        return films;
    }

    public String getName() {
        return name;
    }
}

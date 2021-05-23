package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private Integer outYear;
    private String name;
    private List<Actor> actors;

    public Film(Integer outYear, String name) {
        this.outYear = outYear;
        this.name = name;
        this.actors = new ArrayList<>();
    }

    public List<Actor> getActors() {
        return actors;
    }

    public String getName() {
        return name;
    }
}

package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private int anAparitie;
    private String nume;
    private List<Actor> actori;

    public String getNume() {
        return nume;
    }

    public List<Actor> getActori() {
        return actori;
    }

    public Film(int anAparitie, String nume, List<Actor> actori){
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = new ArrayList(actori);
    }
}

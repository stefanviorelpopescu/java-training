package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Studio {
    private String nume;
    private List<Film> filme;

    public String getNume() {
        return nume;
    }

    public List<Film> getFilme() {
        return filme;
    }

    public Studio(String nume, List<Film> filme){
        this.nume = nume;
        this.filme = new ArrayList(filme);
    }
}

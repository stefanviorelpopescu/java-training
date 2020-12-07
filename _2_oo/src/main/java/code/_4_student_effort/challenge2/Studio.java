package code._4_student_effort.challenge2;

import code._4_student_effort.challenge2.Film;

public class Studio {
    String nume;
    Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public Film[] getFilme() {
        return filme;
    }

    public String getNume() {
        return nume;
    }
}

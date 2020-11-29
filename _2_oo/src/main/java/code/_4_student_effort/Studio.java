package code._4_student_effort;

public class Studio {

    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = filme;
    }

    public int getNumbersOfFilms() {
        return filme.length;
    }

    public String getNume() {
        return nume;
    }

    public Film getFilme(int index) {
        return filme[index];
    }
}

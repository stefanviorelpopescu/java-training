package code._4_student_effort;

public class Studio {
    String nume;
    Film[] filme;

    // Explicit declaration of constructor with no parameters
    public Studio() {

    }

    // Constructor with 2 parameters
    public Studio(String nume, Film[] filme) {
        this.nume = nume;
        this.filme = new Film[filme.length];
        for(int i = 0; i < filme.length; i++) {
            this.filme[i] = new Film(filme[i]);
        }
    }
}

package code._4_student_effort;

public class Premiu {
    String nume;
    Integer an;

    // Explicit declaration of constructor with no parameters
    public Premiu() {

    }

    // Constructor with 2 parameters
    public Premiu(String nume, Integer an) {
        this.nume = nume;
        this.an = an;
    }

    // Copy construtor
    public Premiu(Premiu premiu) {
        this.nume = premiu.nume;
        this.an = premiu.an;
    }
}

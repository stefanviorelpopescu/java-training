package code._4_student_effort;

public class Premiu {
    String nume;
    Integer an;

    public Premiu(String nume,Integer an) {
        this.nume = nume;
        this.an=an;
    }

    public Integer getAn() {
        return an;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAn(int an) {
        this.an = an;
    }
}

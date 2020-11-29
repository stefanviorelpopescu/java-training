package code._4_student_effort;

public class Film {

    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Actor getActori(int index) {
        return actori[index];
    }

    public int getLenghtOfActori() {
        return actori.length;
    }

    public String getNume() {
        return nume;
    }
}

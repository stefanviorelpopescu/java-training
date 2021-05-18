package code._4_student_effort.Challenge2;

public class Film {
    public int anAparitie;
    public String nume;
    public Actor[] actori;

    public Film(int anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public boolean actoriPeste50Ani() {
        for(Actor actor : actori) {
            if(actor.peste50()) return true;
        }
        return false;
    }

    public boolean areActoriCuNumele(String nume) {
        for(Actor actor : actori) {
            if(actor.areNumele(nume)) return true;
        }
        return false;
    }

    public String getNume() {
        return nume;
    }
}

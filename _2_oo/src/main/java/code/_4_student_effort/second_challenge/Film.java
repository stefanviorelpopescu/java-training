package second_challenge;

public class Film {

    private Integer anAparitie;
    private String nume;
    private Actor[] actori;

    public Film() {}

    public Film(Integer anAparitie, String nume, Actor[] actori) {
        this.anAparitie = anAparitie;
        this.nume = nume;
        this.actori = actori;
    }

    public Integer getAnAparitie() {
        return anAparitie;
    }

    public String getNume() {
        return nume;
    }

    public Actor[] getActori() {
        return actori;
    }

    public void setAnAparitie(Integer anAparitie) {
        this.anAparitie = anAparitie;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setActori(Actor[] actori) {
        this.actori = actori;
    }
}

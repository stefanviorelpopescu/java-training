package second_challenge;

import java.awt.event.ActionListener;

public class Actor {

    private String nume;
    private Integer varsta;
    private Premiu[] premii;

    public Actor() { }

    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public String getNume() {
        return nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public Premiu[] getPremii() {
        return premii;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public void setPremii(Premiu[] premii) {
        this.premii = premii;
    }
}

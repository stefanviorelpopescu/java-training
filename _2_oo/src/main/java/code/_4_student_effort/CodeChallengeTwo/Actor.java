package code._4_student_effort.CodeChallengeTwo;

public class Actor {
    private  String nume;
    private  Integer varsta;
    private  Premiu[] premiiInPalmares;


    public Actor(String nume, Integer varsta, Premiu[] premiiInPalmares) {
        this.nume = nume;
        this.varsta = varsta;
        this.premiiInPalmares = premiiInPalmares;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }

    public Premiu[] getPremiiInPalmares() {
        return premiiInPalmares;
    }

    public void setPremiiInPalmares(Premiu[] premiiInPalmares) {
        this.premiiInPalmares = premiiInPalmares;
    }
}

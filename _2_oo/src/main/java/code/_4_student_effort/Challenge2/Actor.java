package code._4_student_effort.Challenge2;

public class Actor {
    public  String nume;
    public int varsta;
    public Premiu[] premii;

    public Actor(String nume, int varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    public boolean peste50() {
        if(varsta > 50) return true;
        return false;
    }

    public boolean areNumele(String nume) {
        if (this.nume == nume) return true;
        return false;
    }
}

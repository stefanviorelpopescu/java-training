package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Actor {
    private String nume;

    public int getVarsta() {
        return varsta;
    }

    private int varsta;
    private List <Premiu> premii;

    public Actor(String nume,int varsta, List <Premiu> premii ){
        this.nume = nume;
        this.varsta = varsta;
        this.premii = new ArrayList<>(premii);
    }

    public String getNume() {
        return nume;
    }
}

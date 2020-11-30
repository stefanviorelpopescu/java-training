package code._4_student_effort;

import java.util.Arrays;

public class Actor {
    String nume;
    Integer varsta;
    Premiu[] premii;

    // Explicit declaration of constructor with no parameters
    public Actor() {

    }

    // Constructor with 3 parameters
    public Actor(String nume, Integer varsta, Premiu[] premii) {
        this.nume = nume;
        this.varsta = varsta;
        // Deep copy lista de premii
        this.premii = new Premiu[premii.length];
        //[Arrays.copyOfRange produces shallow copy] this.premii = Arrays.copyOfRange(premii, 0, premii.length);
        for (int i = 0; i < premii.length; i++) {
            this.premii[i] = new Premiu(premii[i]);
        }
    }

    // Copy constructor
    public Actor(Actor actor) {
        this.nume = actor.nume;
        this.varsta = actor.varsta;
        // Deep copy lista de premii
        this.premii = new Premiu[actor.premii.length];
        for (int i = 0; i < premii.length; i++) {
            this.premii[i] = new Premiu(actor.premii[i]);
        }
    }
}

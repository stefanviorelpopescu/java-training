package code._4_student_effort;

import code._2_challenge._4_observer.Observer;

import java.beans.PropertyChangeEvent;

public class Elev {
    private String nume;

    public Elev(String nume) {
        this.nume = nume;
    }

    public void update(String s) {
        System.out.println(nume+" learned about "+s);
    }
    public void listenTo(Profesor p){
        p.getElevi().add(this);
    };


}

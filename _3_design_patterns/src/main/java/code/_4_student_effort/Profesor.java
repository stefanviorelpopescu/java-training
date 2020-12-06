package code._4_student_effort;

import code._2_challenge._4_observer.ObservedSubject;
import code._2_challenge._4_observer.Observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

public class Profesor {
    private String materie;
    private List<Elev> elevi=new ArrayList<>() ;

    public List<Elev> getElevi() {
        return elevi;
    }

    public void setElevi(ArrayList<Elev> elevi) {
        this.elevi = elevi;
    }

    public void teach(String s){
        for(Elev elev: elevi){
            elev.update(s);
        }
    }

    public void notifyAll(String s) {
       for(Elev e : elevi){
           e.update(s);
       }
    }

}

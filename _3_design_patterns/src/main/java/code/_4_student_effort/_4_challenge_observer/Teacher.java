package code._4_student_effort._4_challenge_observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Teacher implements ObservedSubject{
    String subject;
    private final PropertyChangeSupport support;

    public Teacher(){
        subject = "";
        support = new PropertyChangeSupport(this);
    }

    public void teach(String subject){
        notifyObservers(subject);
    }

    @Override
    public void register(Observer obj) {
        support.addPropertyChangeListener((PropertyChangeListener) obj);
    }

    @Override
    public void unregister(Observer obj) {
        support.removePropertyChangeListener((PropertyChangeListener) obj);
    }

    @Override
    public void notifyObservers(String subject) {
        support.firePropertyChange("Subject", this.subject, subject);
        this.subject = subject;
    }
}

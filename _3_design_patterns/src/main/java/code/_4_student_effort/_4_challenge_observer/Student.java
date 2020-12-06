package code._4_student_effort._4_challenge_observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Student implements Observer, PropertyChangeListener{
    String name;


    public Student(String name) {
        this.name = name;
    }

    public void propertyChange(PropertyChangeEvent event){
        update(event.getNewValue().toString());
    }

    public void listenTo(Teacher teacher){
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " learned about " + message);
    }
}

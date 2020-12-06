package code._4_student_effort._4_challenge_observer_v2;


import java.util.ArrayList;

public class Teacher implements ObservedSubject {
    String subject;
    ArrayList<Observer> studentList;

    public Teacher(){
        studentList = new ArrayList<>();
        subject = "";
    }

    public void teach(String subject){
        notifyObservers(subject);
    }

    @Override
    public void register(Observer obj) {
        studentList.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        studentList.remove(obj);
    }

    @Override
    public void notifyObservers(String subject) {
        this.subject = subject;
        for (Observer observer : studentList) {
            observer.update(subject);
        }
    }
}
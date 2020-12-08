package code._4_student_effort.CodeChallenge4;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject{

    private List<Observer> observers;

    public Teacher() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        this.observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        this.observers.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {

            for(Observer observer : this.observers){
                observer.update(observer + " learned about " + message);
            }
    }

    public void teach(String message) {
        notifyObservers(message);
    }
}

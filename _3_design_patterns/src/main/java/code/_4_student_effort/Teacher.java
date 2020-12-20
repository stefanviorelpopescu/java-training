package code._4_student_effort;

import java.util.ArrayList;

import java.util.List;


public class Teacher implements ObservedSubject {
    List<Observer> observers= new ArrayList<Observer>();

    @Override
        public void register(Observer obj) {
        observers.add(obj);

    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void teach(String topic){
        notifyObservers(topic);
    }

}


package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject{
    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void register(Observer observer){
        observers.add(observer);
    }
    @Override
    public void unregister(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void  notifyObserver(String message){
        for (Observer observer:observers){
            observer.update(message);
        }
    }
    public void teach(String topic){
        for(Observer observer:observers){
            observer.update(topic);
        }
    }
}

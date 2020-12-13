package code._4_student_effort.Challenge4;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject{

    private List<Observer> observerList = new ArrayList<>();

    public void tech(String topic) {
        notifyObservers(topic);
    }

    @Override
    public void register(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer obs: observerList) {
            obs.update(message);
        }
    }
}

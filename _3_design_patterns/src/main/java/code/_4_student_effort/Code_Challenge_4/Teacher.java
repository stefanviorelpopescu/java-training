package code._4_student_effort.Code_Challenge_4;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {

    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void register(Observer obj) {
        if(!observerList.contains(obj)){
            observerList.add(obj);
        }
    }

    @Override
    public void unregister(Observer obj) {
        observerList.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observerList){
            observer.update(message);
        }
    }
    public void teach(String topic){
        notifyObservers(topic);
    }
}

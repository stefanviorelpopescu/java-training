package code._4_student_effort.CodeChallenge4;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {
    private List<Observer> obs=new ArrayList<Observer>();
    @Override
    public void register(Observer obj) {
            obs.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        obs.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer o:obs){
            o.update(message);
        }
    }

    public void teach(String javaTopic) {
        for(Observer o: obs)
            o.update(javaTopic);
    }
}

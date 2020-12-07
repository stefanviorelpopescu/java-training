package code._4_student_effort.observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObserverSubject {
  private List<Observer> observers;

  public Teacher(){
      observers= new ArrayList<>();
  }
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
        for(int i=0; i < observers.size(); i++ ){
            observers.get(i).update(message);
        }
    }
}

package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Sensor extends Observable {
    private String id;
    private String size;
    private String location;
    private List<Observer> observers = new ArrayList<>();

    public Sensor(String id, String size, String location){
        this.id = id;
        this.size = size;
        this.location = location;
    }

    public void changeState(Object event){
        notifyAllObservers(event);
    }

    public void register(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(Object event){
        for(Observer observer : observers){
            observer.update(this, event);
        }
    }

    public String getId() {
        return id;
    }

    public String getSize() {
        return size;
    }

    public String getLocation() {
        return location;
    }
}

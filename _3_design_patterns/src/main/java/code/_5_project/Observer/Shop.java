package code._5_project.Observer;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Subject{

    private List<Observer> observers=new ArrayList<>();

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Item back in stock! Act fast before it sells out!");
        for (Observer observer : observers) {
            observer.update("Sale");
        }
    }
}

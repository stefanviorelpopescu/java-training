package Project;

import java.util.ArrayList;

public class Sensor implements ObservedSubject<Pair<Integer, Integer>> {
    // sensorType - tipul senzorului
    // pairMeasurement - pereche de valoarea curenta si valoarea precedenta ce este trimisa catre weatherstation la modificare
    private final String sensorType;
    Pair<Integer, Integer> pairMeasurement = new Pair<>();

    ArrayList<Observer<Pair<Integer, Integer>>> sensorObservers = new ArrayList<>();

    public Sensor(String sensorType) {
        this.sensorType = sensorType;
    }

    @Override
    public void registerObserver(Observer<Pair<Integer, Integer>> obj) {
        sensorObservers.add(obj);
    }

    @Override
    public void unregisterObserver(Observer<Pair<Integer, Integer>> obj) {
        sensorObservers.remove(obj);
    }

    @Override
    public void notifyObserver() {
        for (Observer<Pair<Integer, Integer>> observer : sensorObservers) {
            observer.update(sensorType, pairMeasurement);
        }
    }

    public void setSensorMeasurement(int sensorMeasurement) {
        this.pairMeasurement.second = this.pairMeasurement.first;
        this.pairMeasurement.first = sensorMeasurement;
        notifyObserver();
    }
}

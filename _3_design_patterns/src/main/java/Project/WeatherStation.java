package Project;

import java.util.HashMap;
import java.util.Map;

public class WeatherStation implements ObservedSubject<Map<String, Pair<Integer, Integer>>>, Observer<Pair<Integer, Integer>> {
    // stationName - numele statiei
    // sensors - mapez numele statie cu perechea de valori primite de la senzor si le trimit catre display la o schimbare a unui senzor
    private final String stationName;
    Map<String, Pair<Integer, Integer>> sensors = new HashMap<>();
    private Observer<Map<String, Pair<Integer, Integer>>> observer;


    public WeatherStation(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public void registerObserver(Observer<Map<String, Pair<Integer, Integer>>> obj) {
        this.observer = obj;
    }

    @Override
    public void unregisterObserver(Observer<Map<String, Pair<Integer, Integer>>> obj) {
        this.observer = null;
    }

    @Override
    public void notifyObserver() {
        observer.update(stationName, sensors);
    }

    @Override
    public void update(String name, Pair<Integer, Integer> value) {
        sensors.put(name, value);
        notifyObserver();
    }

}

package Project;

import java.util.Map;

public class Display implements Observer<Map<String, Pair<Integer, Integer>>> {

    private Display() {

    }

    private static class SingletonHelper {
        private static final Display instance = new Display();
    }

    public static Display getInstance() {
        return SingletonHelper.instance;
    }

    @Override
    public void update(String station, Map<String, Pair<Integer, Integer>> sensors) {
        System.out.println("Station " + station + " received the following data: ");
        for (Map.Entry<String, Pair<Integer, Integer>> sensorData : sensors.entrySet()) {
            System.out.println(sensorData.getKey() + " - " + sensorData.getValue().second + " -> " + sensorData.getValue().first);
//            if (sensorData.getValue().first != sensorData.getValue().second) {
//                System.out.println(sensorData.getKey() + " - " + sensorData.getValue().second + " -> " + sensorData.getValue().first);
//            } else {
//                System.out.println(sensorData.getKey() + " - " + sensorData.getValue().first);
//            }
        }
        System.out.println(System.lineSeparator());
    }
}

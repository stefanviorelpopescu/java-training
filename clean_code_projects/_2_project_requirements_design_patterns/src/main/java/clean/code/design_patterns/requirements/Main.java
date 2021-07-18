package clean.code.design_patterns.requirements;

public class Main {

    public static void main(String[] args) {
        //TODO implement your design patterns in this package

        Controller mainController = new Controller();
        HumiditySensor h1 = (HumiditySensor) SensorFactory.getSensor(new HumiditySensorFactory(), "11", "10x10", "Dorm");
        TemperatureSensor t1 = (TemperatureSensor) SensorFactory.getSensor(new TemperatureSensorFactory(), "2","20x20", "Kitchen");
        PressureSensor p1 = (PressureSensor) SensorFactory.getSensor(new PressureSensorFactory(), "3","20x20", "Bathroom");

        h1.register(mainController);
        t1.register(mainController);
        p1.register(mainController);

        h1.readSensor();
        System.out.println(h1.getValue() + "%");
        t1.readSensor();
        System.out.println(t1.getValue() + " C");
        p1.readSensor();
        System.out.println(p1.getValue() + " Pa");

    }
}

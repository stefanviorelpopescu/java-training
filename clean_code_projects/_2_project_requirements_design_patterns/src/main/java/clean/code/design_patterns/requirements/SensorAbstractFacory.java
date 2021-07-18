package clean.code.design_patterns.requirements;

public interface SensorAbstractFacory {
    public Sensor create(String id, String size, String location);
}

class TemperatureSensorFactory implements SensorAbstractFacory{

    @Override
    public Sensor create(String id, String size, String location) {
        return new TemperatureSensor(id,size,location);
    }
}

class PressureSensorFactory implements SensorAbstractFacory{

    @Override
    public Sensor create(String id, String size, String location) {
        return new PressureSensor(id,size,location);
    }
}
class HumiditySensorFactory implements SensorAbstractFacory{

    @Override
    public Sensor create(String id, String size, String location) {
        return new HumiditySensor(id,size,location);
    }
}

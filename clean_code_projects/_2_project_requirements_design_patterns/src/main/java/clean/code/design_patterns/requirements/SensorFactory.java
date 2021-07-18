package clean.code.design_patterns.requirements;

public class SensorFactory {

    public static Sensor getSensor(SensorAbstractFacory f, String id, String size, String location){
        return f.create(id, size, location);
    }
}

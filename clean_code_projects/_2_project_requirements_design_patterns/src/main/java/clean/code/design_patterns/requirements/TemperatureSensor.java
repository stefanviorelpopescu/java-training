package clean.code.design_patterns.requirements;

public class TemperatureSensor extends Sensor{

    private double value;
    public TemperatureSensor(String id, String size, String location) {
        super(id, size, location);
    }

    public void readSensor(){
        this.value = Math.random()*100-20;
        if(value > 60){
            changeState("Temperature sensor(" + getId() + ", " + getLocation() +") warning");
        }
    }

    public double getValue() {
        return value;
    }
}

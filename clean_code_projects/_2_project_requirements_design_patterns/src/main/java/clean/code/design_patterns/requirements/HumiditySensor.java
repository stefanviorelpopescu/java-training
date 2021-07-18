package clean.code.design_patterns.requirements;

public class HumiditySensor extends Sensor{
    private double value;

    public HumiditySensor(String id, String size, String location) {
        super(id, size, location);
    }

    public void readSensor(){
        this.value = Math.random()*100 + 1;
        if(value < 20){
            changeState("Humidity sensor(" + getId() + ", " + getLocation() +") warning");
        }
    }

    public double getValue() {
        return value;
    }
}

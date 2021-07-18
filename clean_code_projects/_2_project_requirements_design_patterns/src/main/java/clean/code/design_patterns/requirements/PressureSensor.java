package clean.code.design_patterns.requirements;

public class PressureSensor extends Sensor{
    private double value;

    public PressureSensor(String id, String size, String location){
        super(id,size, location);
    }

    public void readSensor(){
        this.value = Math.random()*1000 + 500;
        if(value > 1000){
            changeState("Pressure sensor(" + getId() + ", " + getLocation() +") warning");
        }
    }

    public double getValue() {
        return value;
    }
}

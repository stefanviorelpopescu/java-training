package clean.code.design_patterns.requirements;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        if(o != null) {
            System.out.println(arg);
            if (o instanceof TemperatureSensor) {
                System.out.println("HIGH TEMPERATURE!");
            } else if (o instanceof HumiditySensor){
                System.out.println("LOW HUMIDITY!");
            }
            else if(o instanceof PressureSensor){
                System.out.println("HIGH PRESSURE!");
            }
        }
    }
}

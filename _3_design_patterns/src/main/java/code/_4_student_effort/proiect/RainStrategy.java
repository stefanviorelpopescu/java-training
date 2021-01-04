package code._4_student_effort.proiect;

public class RainStrategy implements DrivingStrategy {

    public RainStrategy(Autopilot autopilot) {
        autopilot.setMod("Rain");
        autopilot.setSpeed(45);
    }
}

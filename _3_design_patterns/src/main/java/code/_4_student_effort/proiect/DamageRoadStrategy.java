package code._4_student_effort.proiect;

public class DamageRoadStrategy implements DrivingStrategy {
    public DamageRoadStrategy(Autopilot autopilot) {
        autopilot.setMod("Caution");
        autopilot.setSpeed(30);
    }
}

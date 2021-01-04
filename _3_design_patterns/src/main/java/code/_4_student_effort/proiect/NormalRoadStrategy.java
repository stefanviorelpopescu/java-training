package code._4_student_effort.proiect;

public class NormalRoadStrategy implements DrivingStrategy {

    public NormalRoadStrategy(Autopilot autopilot) {
        autopilot.setMod("Balanced");
        autopilot.setSpeed(90);
    }


}

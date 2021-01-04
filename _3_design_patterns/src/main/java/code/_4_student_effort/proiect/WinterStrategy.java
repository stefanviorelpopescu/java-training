package code._4_student_effort.proiect;

public class WinterStrategy implements DrivingStrategy {
    public WinterStrategy(Autopilot autopilot) {
            autopilot.setMod("Winter");
            autopilot.setSpeed(25);
        }
    }
//this strategy use more engine break than DamageRoadStrategy


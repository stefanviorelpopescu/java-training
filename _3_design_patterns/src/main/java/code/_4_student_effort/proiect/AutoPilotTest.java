/*
*Author:Cretu Alexandru Catalin
* Date:04.01.2021
* Description: AutoPilot class define an autopilot car with related properties(speed, lyfecycle,etc)
* which adapt the style of drive reporting to the weather conditions and to the road's
* quality.
*   */
package code._4_student_effort.proiect;
import java.util.concurrent.TimeUnit;

public class AutoPilotTest {
    public static void main(String[] args) throws InterruptedException {
        Autopilot autopilot = new Autopilot.Builder_Pilot(45)
                .setMod("sport")
                .build();
        System.out.println("Initial setup:"+autopilot.toString());
        String road[] = {"winter", "normal", "normal", "damaged", "rain"};
        //in a real scenario, every string from this array is given by the car's sensors
        for (int i = 0; i < road.length; i++) {
            switch (road[i]) {
                case "normal":
                    autopilot.setDrivingStrategy(new NormalRoadStrategy(autopilot));
                    System.out.println(autopilot.toString());
                    break;

                case "damaged":
                    autopilot.setDrivingStrategy(new DamageRoadStrategy(autopilot));
                    autopilot.check("sport");
                    System.out.println(autopilot.toString());
                    break;

                case "winter":
                    autopilot.setDrivingStrategy(new WinterStrategy(autopilot));
                    autopilot.check("sport");
                    System.out.println(autopilot.toString());
                    break;

                case "rain":
                    autopilot.setDrivingStrategy(new RainStrategy(autopilot));
                    autopilot.check("sport");
                    System.out.println(autopilot.toString());
                    break;
            }
            TimeUnit.SECONDS.sleep(1);
        }
    }
}

package code._4_student_effort;

import java.util.Random;

public class Player extends Thread {
    int result; // 1 - rock, 0 - paper, -1 - scissors

    @Override
    public void run() {
        //super.run();
        Random r = new Random();
        int low = -1;
        int high = 1;
        int result = r.nextInt(high-low) + low;
    }
}

package code._4_student_effort.CodeChallenge3;

import java.util.Random;

public class Player extends Thread {

    public int result;

    @Override
    public void run() {
        Random r = new Random();
        int low = -1;
        int high = 1;
        result = r.nextInt(high - low) + low;
    }

}



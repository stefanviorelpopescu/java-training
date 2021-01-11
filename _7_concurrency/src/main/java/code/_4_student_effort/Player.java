package code._4_student_effort;

import java.util.List;
import java.util.Random;
import static java.util.Arrays.asList;


public class Player extends Thread {
    public String result;

    @Override
    public void run() {
        List<String> possibilities = asList("paper", "scissors", "rock");
        result = possibilities.get(new Random().nextInt(3));
    }
}

package code._4_student_effort.rock_paper_scissors;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

public class Player extends Thread {

    String chooseSign;

    @Override
    public void run() {
        List<String> options = asList("paper", "scissors", "rock");
        chooseSign = options.get(new Random().nextInt(3));
    }
}

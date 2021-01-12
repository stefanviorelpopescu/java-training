package code._4_student_effort.Challenge3;

import java.util.Random;

public class Player extends Thread {
    private String name;
    private String choose;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        randomGenerate();
    }

    private void randomGenerate() {
        Random random = new Random();
        int min = 1;
        int max = 3;

        int number = random.nextInt(max - min + 1) + min;

        if (number == 1) {
            choose = "rock";
        }

        if (number == 2) {
            choose = "paper";
        }

        if (number == 3) {
            choose = "scissors";
        }
    }

    public String takeName() {
        return name;
    }

    public String getChoose() {
        return choose;
    }
}

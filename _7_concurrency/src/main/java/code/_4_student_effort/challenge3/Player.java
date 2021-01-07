package code._4_student_effort.challenge3;

import java.util.Random;

public class Player extends Thread {
    public Choice choice;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void run() {
/*        List<String> choices = asList("paper", "scissors", "rock");
        choice = choices.get(new Random().nextInt(3));*/
        Random random = new Random();
        int value = random.nextInt(3);
        this.choice = Choice.values()[value];
        //return Choice.values()[value];
    }

    public String getNameButItCantBeCalled_getName() {
        return name;
    }
}

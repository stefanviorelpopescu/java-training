package code._4_student_effort._1_challengeOne;

import java.util.Random;

public class BoxingMatch {
    private Fighter one;
    private Fighter two;

    public BoxingMatch (Fighter one, Fighter two) {
        this.one = one;
        this.two = two;
    }

    public StringBuilder fight(Fighter one, Fighter two) {
        one.attack(two);
        two.attack(one);
        Random random = new Random();
        StringBuilder winner = new StringBuilder();
        int randomInt = random.nextInt(100);
        if (randomInt % 2 == 0) {
            winner.append("The winner is: ").append(one.getName()).append("! His health condition is: ").append(one.getHealth()).append("%, while ").append(two.getName()).append("'s health ").append("condition is: ").append(two.getHealth()).append(".");
        } else {
            winner.append("The winner is: ").append(two.getName()).append("! His health condition is: ").append(two.getHealth()).append("%, while ").append(one.getName()).append("'s health ").append("condition is: ").append(one.getHealth()).append(".");
        }
        return winner;
    }
}

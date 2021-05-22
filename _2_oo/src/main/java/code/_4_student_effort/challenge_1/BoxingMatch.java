package code._4_student_effort.challenge_1;

public class BoxingMatch {
    private Fighter opponent1;
    private Fighter opponent2;

    public BoxingMatch(Fighter opponent1, Fighter opponent2) {
        this.opponent1 = opponent1;
        this.opponent2 = opponent2;
    }

    public String fight() {
        while (opponent1.getHealth() > 0 || opponent2.getHealth() > 0) {
            opponent1.attack(opponent2);
            opponent2.attack(opponent1);
        }
        if (opponent1.getHealth() <= 0) {
            return opponent2.getName();
        } else {
            return opponent1.getName();
        }
    }
}

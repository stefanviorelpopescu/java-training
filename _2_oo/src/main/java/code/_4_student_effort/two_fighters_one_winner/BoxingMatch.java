package main.java.code._4_student_effort.two_fighters_one_winner;

public class BoxingMatch {
    Fighter f1, f2;

    public BoxingMatch(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public String fight(Fighter f1, Fighter f2) {
        while (f1.getHealth() > 0 && f2.getHealth() > 0) {
            f1.attack(f2);
            f2.attack(f1);
        }

        if (f1.getHealth() > f2.getHealth()) {
            return f1.getName();
        } else if (f2.getHealth() > f1.getHealth()) {
            return f2.getName();
        }

        return "DRAW";
    }
}

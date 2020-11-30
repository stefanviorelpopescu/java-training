package code._4_student_effort;

public class BoxingMatch {
    private Fighter f1;
    private Fighter f2;

    BoxingMatch(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public String fight() {
        while ( (f1.getHealth() > 0) || (f2.getHealth() > 0) ) {
            f1.attack(f2);
            f2.attack(f1);
        }

        return f1.getHealth() < f2.getHealth() ? f1.getHealth() > f2.getHealth() ? f2.getName() : f1.getName(): "Remiza";
    }
}

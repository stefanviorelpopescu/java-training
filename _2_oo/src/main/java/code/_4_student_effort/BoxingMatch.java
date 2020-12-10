package code._4_student_effort;

public class BoxingMatch {


    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
    }

    public String fight(Fighter f1, Fighter f2) {
        while (f1.getHealth() > 0 || f2.getHealth() > 0) {
            f1.attack(f2);
            f2.attack(f1);
        }
            if (f1.getHealth() >= 0) {
                return f1.getName();
            } else {
                return f2.getName();
            }
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Andrei", 30, 5);
        Fighter fighter2 = new Fighter("Bogdan", 40, 10);
        BoxingMatch thematch = new BoxingMatch(fighter1, fighter2);
        System.out.println(thematch.fight(fighter1, fighter2));
    }

}

package code._4_student_effort.CodeChallengeOne;

public class BoxingMatch {

    public String fight(Fighter fighter1,Fighter fighter2) {
        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        if (fighter1.getHealth() <= 0) {
            return fighter2.getName();
        } else {
            return fighter1.getName();
        }
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Dorel", 200, 80);
        Fighter fighter2 = new Fighter("Tinichigiu", 300, 40);
        BoxingMatch firstMatch = new BoxingMatch();
        System.out.println(firstMatch.fight(fighter1,fighter2));

    }
}

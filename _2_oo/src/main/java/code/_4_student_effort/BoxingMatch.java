package code._4_student_effort;

import java.util.concurrent.ThreadLocalRandom;

public class BoxingMatch {
    Fighter I;
    Fighter II;

    public BoxingMatch(Fighter I, Fighter II) {
        this.I = I;
        this.II = II;
    }
    public String fight() {
        while (I.health > 0 && II.health > 0) {
            I.attack(II);
            II.attack(I);
        }
        if (I.health <= 0) {
            return I.name;
        }
        else {
            return II.name;
        }
    }

    public static void main (String [] args){
        int damage1 = ThreadLocalRandom.current().nextInt(0, 25);
        int damage2 = ThreadLocalRandom.current().nextInt(0, 25);
        Fighter I = new Fighter("Bogdan",damage1, 100);
        Fighter II = new Fighter("Marius",damage2, 100);
        BoxingMatch BM =new BoxingMatch(I,II);
        String winner = BM.fight();
        System.out.println("The winner is: " + winner);
        System.out.println("First fighter damage: " + damage1);
        System.out.println("Second fighter damage: " + damage2);

    }

}

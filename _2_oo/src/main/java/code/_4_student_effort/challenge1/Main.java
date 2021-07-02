package code._4_student_effort.challenge1;

import code._4_student_effort.challenge1.BoxingMatch;
import code._4_student_effort.challenge1.Fighter;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        //challenge 1
        Fighter fighter1 = new Fighter("Antonia",20,20);
        Fighter fighter2 = new Fighter("Maria",20,100);
        BoxingMatch boxingMatch = new BoxingMatch(fighter1,fighter2);
        System.out.println(boxingMatch.fight());
    }
}

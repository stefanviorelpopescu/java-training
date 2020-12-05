package code._4_student_effort.two_fighters;

public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight() {

        while ( fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            fighter1.attack(fighter1, fighter2);
            fighter2.attack(fighter2, fighter1);
        }
        if(fighter1.getHealth() > fighter2.getHealth())
            return fighter1.getName() + " has won";
        else if ( fighter1.getHealth() < fighter2.getHealth())
            return  fighter2.getName() + " has won";
        else return " It's a draw";
    }
}

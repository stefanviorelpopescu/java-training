package code._4_student_effort.challenge1;

public class BoxingMatch {

    private Fighter fighter1,fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight(){
        return fighter1.attack(fighter2);
    }
}

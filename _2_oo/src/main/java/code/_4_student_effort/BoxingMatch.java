package code._4_student_effort;

public class BoxingMatch {
    Fighter opponent1;
    Fighter opponent2;

    public BoxingMatch(Fighter opponent1, Fighter opponent2) {
        this.opponent1 = opponent1;
        this.opponent2 = opponent2;
    }

    public String winner(){
        while(opponent1.getHealth() > 0 && opponent2.getHealth() > 0){
            opponent1.attack(opponent2);
            opponent2.attack(opponent1);
//            System.out.println(opponent1.getName() + " health: " + opponent1.getHealth());
//            System.out.println(opponent2.getName() + " health: " + opponent2.getHealth());
        }
        if(opponent1.getHealth() <= 0){
            return opponent2.getName();
        }
        else {
            return opponent1.getName();
        }
    }
}

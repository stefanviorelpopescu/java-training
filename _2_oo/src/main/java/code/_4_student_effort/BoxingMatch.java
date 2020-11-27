package code._4_student_effort;

public class BoxingMatch {

    private String winner;
    private Fighter f1;
    private Fighter f2;

    public void setWinner(String winner) {
        this.winner = winner;
    }

    BoxingMatch(Fighter f1, Fighter f2){
       this.f1 = f1;
       this.f2 = f2;
    }

    public String fight() {
        while (f1.getHealth() > 0 && f2.getHealth() > 0) {
            f1.attack(f2);
            f2.attack(f1);
        }

        if (f1.getHealth() <= 0 && f2.getHealth() <= 0) {
            return ("Tie");
        }
        else if (f1.getHealth() != 0 && f2.getHealth() <= 0) {
            return (f1.getName());
        }
        else {
            return (f2.getName());
        }
    }
}

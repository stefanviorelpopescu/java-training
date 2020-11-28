package code._4_student_effort;

public class BoxingMatch {
    Fighter F1;
    Fighter F2;

    public BoxingMatch(Fighter f1, Fighter f2) {
        F1 = f1;
        F2 = f2;
    }

    public String fight() {
        while (F1.health > 0 && F2.health > 0) {
            F1.attack(F2);
            F2.attack(F1);
        }
        if(F1.health > 0) {
            return F1.name;
        }
        else if(F2.health > 0){
            return F2.name;
        }
        else{
            return "Draw";
        }
    }

}

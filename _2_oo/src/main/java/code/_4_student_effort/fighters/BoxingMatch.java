package code._4_student_effort.fighters;

public class BoxingMatch {

    Fighter f1;
    Fighter f2;

    public BoxingMatch(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public String fight() {
        while(f1.health > 0 && f2.health > 0) {
            f1.attack(f1);
        }
        if(f1.damagePerAttack < f2.damagePerAttack) {
            return  f1.name;
        }
        else {
            return f2.name;
        }
    }
}

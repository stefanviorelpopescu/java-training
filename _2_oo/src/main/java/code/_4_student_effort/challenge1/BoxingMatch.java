package code._4_student_effort.challenge1;

public class BoxingMatch {

    private final Fighter f1;
    private final Fighter f2;

    public BoxingMatch(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public String fight() {
        for( ; ;){
            System.out.println(f1.health + " " + f2.health);
            if(f1.health <= 0)
                return f2.name;
            f1.attack(f2);
            if(f2.health <= 0)
                return f1.name;
            f2.attack(f1);
        }

    }

    public static void main(String[] args) {
        Fighter f1 = new Fighter("ABC", 100, 12);
        Fighter f2 = new Fighter("MNO", 120, 8);

        BoxingMatch match = new BoxingMatch(f1, f2);

        System.out.print(match.fight());
    }
}

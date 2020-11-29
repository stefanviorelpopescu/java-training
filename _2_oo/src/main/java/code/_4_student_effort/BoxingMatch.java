package code._4_student_effort;

public class BoxingMatch {

    private Fighter one;
    private Fighter two;

    public BoxingMatch(Fighter one, Fighter two) {
        this.one = one;
        this.two = two;
    }

    public String fight() {

        String toShow=null;

        System.out.println("Firt boxer name is: " + one.getName() + " with " + one.getHealth() + " health and " + one.getDamagePerAttack() + " damage per attack");
        System.out.println("Firt boxer name is: " + two.getName() + " with " + two.getHealth() + " health and " + two.getDamagePerAttack() + " damage per attack");

        while (one.getHealth() >= 0 && two.getHealth() >=0) {
            one.attack(two);
            two.attack(one);
        }

        if (one.getHealth() <= 0 && two.getHealth() <=0) {
            toShow = "Tie";
        } else if (one.getHealth() > 0 && two.getHealth() <= 0) {
            toShow = one.getName() + " is the Winner with " + one.getHealth() + " health remain";
        } else if (one.getHealth() <= 0 && two.getHealth() >0) {
            toShow = two.getName() + " is the Winner with " + two.getHealth() + " health remain";
        }

        return toShow;
    }
}

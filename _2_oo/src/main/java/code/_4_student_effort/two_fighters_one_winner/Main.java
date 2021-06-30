package main.java.code._4_student_effort.two_fighters_one_winner;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Alexander", 100, 5);
        Fighter f2 = new Fighter("Wyatt", 100, 4);
        BoxingMatch match = new BoxingMatch(f1, f2);
        System.out.println("The winner is " + match.fight(f1, f2));
    }
}

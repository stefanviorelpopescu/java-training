package code._4_student_effort.challenge3;

public class RockPaperScissorsMain {
    public static void main(String[] args) throws InterruptedException {
        Player p1 = new Player("Ana");
        Player p2 = new Player("Maria");

        p1.start();
        p2.start();

        p1.join();
        p2.join();

        Choice c1 = p1.choice;
        Choice c2 = p2.choice;

        System.out.println(p1.getNameButItCantBeCalled_getName() + " has chosen " + p1.choice);
        System.out.println(p2.getNameButItCantBeCalled_getName() + " has chosen " + p2.choice);

        if(c1.equals(c2)) {
            System.out.println("DRAW");
        } else if(c1.equals(Choice.ROCK) && c2.equals(Choice.SCISSORS) ||
                c1.equals(Choice.PAPER) && c2.equals(Choice.ROCK) ||
                c1.equals(Choice.SCISSORS) && c2.equals(Choice.PAPER)) {
            System.out.printf("%s has won!", p1.getNameButItCantBeCalled_getName());
        } else {
            System.out.printf("%s has won!", p2.getNameButItCantBeCalled_getName());
        }
    }
}

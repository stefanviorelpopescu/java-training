package code._4_student_effort.Challenge3;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        for (int i=0;i<=100;i++) {
            Player player1 = new Player("Vlad");
            Player player2 = new Player("John");

            player1.start();
            player2.start();

            player1.join();
            player2.join();

            chooseWinner(player1, player2);
        }
    }

    public static void chooseWinner(Player player1, Player player2) {
        System.out.println(player1.takeName() + " with " + player1.getChoose());
        System.out.println(player2.takeName() + " with " + player2.getChoose());

        // equality
        if (player1.getChoose().equals(player2.getChoose())) {
            System.out.println("Equality!");
        } else {

            // winner
            if (player1.getChoose().equals("rock")) {
                if (player2.getChoose().equals("paper")) {
                    System.out.println(player2.takeName() + " win!");
                } else {
                    System.out.println(player1.takeName() + " win!");
                }
            }

            if (player1.getChoose().equals("paper")) {
                if (player2.getChoose().equals("scissors")) {
                    System.out.println(player2.takeName() + " win!");
                } else {
                    System.out.println(player1.takeName() + " win!");
                }
            }

            if (player1.getChoose().equals("scissors")) {
                if (player2.getChoose().equals("rock")) {
                    System.out.println(player2.takeName() + " win!");
                } else {
                    System.out.println(player1.takeName() + " win!");
                }
            }
        }

        // for a better view of console
        System.out.println();
    }
}

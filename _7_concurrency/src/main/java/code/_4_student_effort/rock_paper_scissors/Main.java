package code._4_student_effort.rock_paper_scissors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        Player player1 = new Player();
        Player player2 = new Player();

        //start
        player1.start();
        player2.start();

        //wait for then to finish
        player1.join();
        player2.join();

        if (player1.chooseSign.equals(player2.chooseSign)) {
            System.out.println(player1.chooseSign + " vs " + player2.chooseSign + " => Draw");
        } else if (
                player1.chooseSign.equals("paper") && player2.chooseSign.equals("rock") ||
                        player1.chooseSign.equals("rock") && player2.chooseSign.equals("scissors") ||
                        player1.chooseSign.equals("scissors") && player2.chooseSign.equals("paper")
        ) {
            System.out.println(player1.chooseSign + " vs " + player2.chooseSign + " => Player1 Wins");
        } else {
            System.out.println(player1.chooseSign + " vs " + player2.chooseSign + " => Player2 Wins");
        }
        
    }

}

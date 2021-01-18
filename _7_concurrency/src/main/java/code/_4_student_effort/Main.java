package code._4_student_effort;

import code._4_student_effort.CodeChallenge1.RabbitRunnable;
import code._4_student_effort.CodeChallenge1.RabbitThread;
import code._4_student_effort.CodeChallenge2.BankAccount;
import code._4_student_effort.CodeChallenge2.TransactionThread;
import code._4_student_effort.CodeChallenge3.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Code challenge 1:");
        codeChallenge1();

        System.out.println("\nCode challenge 2:");
        codeChallenge2();

        System.out.println("\nCode challenge 3:");
        codeChallenge3();
    }

   /*////////////////////////////////////////////////////////////
  //////////////////// Code Challenge 1 ////////////////////////
 ////////////////////////////////////////////////////////////*/

    public static void codeChallenge1() {

        List<Thread> rabbits = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                rabbits.add(new RabbitThread(i));
            } else {
                rabbits.add(new Thread(new RabbitRunnable(i)));
            }
        }

        for (Thread currentThread : rabbits) {
            currentThread.start();
        }

    }

   /*////////////////////////////////////////////////////////////
  //////////////////// Code Challenge 2 ////////////////////////
 ////////////////////////////////////////////////////////////*/

    public static void codeChallenge2() throws InterruptedException {

        BankAccount account1 = new BankAccount("Andrei", 300);
        BankAccount account2 = new BankAccount("Razvan", 200);

        TransactionThread tt1 = new TransactionThread("TT1", account1, account2, 160);

        tt1.start();
        tt1.join();

        System.out.println(account1);
        System.out.println(account2);

    }

   /*////////////////////////////////////////////////////////////
  //////////////////// Code Challenge 3 ////////////////////////
 ////////////////////////////////////////////////////////////*/

    public static void codeChallenge3() {

        Player player1 = new Player();
        Player player2 = new Player();

        player1.start();
        player2.start();

        try {
            player1.join();
            player2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        displayWinner(player1, player2);
    }

    static void displayWinner(Player player1, Player player2) {

        if (player1.result == player2.result) {
            System.out.println("Equality");
        } else if (((player1.result == -1) && (player2.result == 0)) ||
                ((player1.result == 1) && (player2.result == -1)) ||
                ((player1.result == 0) && (player2.result == 1))) {
            System.out.println("Player 1 wins");
        } else {
            System.out.println("Player 2 wins");
        }
    }

}



package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    
    challenge1();
    challenge2();
    challenge3();
  }

  private static void challenge1() {
    List<Thread> race = new ArrayList<>();

    for(int i = 0; i < 10; i++) {
      Thread rabbit = null;
      if (i % 2 == 0) {
        rabbit = new RabbitThread(i);
      } else {
        RabbitRunnable runnable = new RabbitRunnable(i);
        rabbit = new Thread(runnable);
      }
      race.add(rabbit);
      rabbit.start();
    }

    // wait for all
    for(int i = 0; i < 10; i++) {
      try {
        race.get(i).join();
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

  private static void challenge2() {

    BankAccount account1 = new BankAccount("first account", 1000);
    BankAccount account2 = new BankAccount("second account", 100);
    System.out.println("Before transaction: ");
    System.out.println(account1);
    System.out.println(account2);

    TransactionThread transaction1 = new TransactionThread("first transaction", account1, account2, 50);
    TransactionThread transaction2 = new TransactionThread("second transaction", account1, account2, 100);

    transaction1.start();
    transaction2.start();

    //wait
    try{
      transaction1.join();
      transaction2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("After: ");
    System.out.println(account1);
    System.out.println(account2);

  }
  private static void challenge3() {
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
    displayTheWinner(player1,player2);

  }

  private static void displayTheWinner(Player player1, Player player2) {
    String winner1 = player1.result;
    String winner2 = player2.result;

    if (winner1.equals(winner2)) {
      System.out.println("Equal");
    } else
        if (winner1.equals("paper") && winner2.equals("rock") || winner1.equals("rock") && winner2.equals("scissors") || winner1.equals("scissors") && winner2.equals("paper")) {
            System.out.println("Player 1 wins");
      } else {
              System.out.println("Plyaer 2 wins");
      }
  }


}

package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // Challenge 1
    doChallenge1();

    // Challenge 2
    printChallengeSeparator(2);
    doChallenge2();

    // Challenge 3
    printChallengeSeparator(3);
    doChallenge3();

    // HardCode Challenge 1
    printChallengeSeparator(4);
    doHardCOreChallenge1();
  }

  // Challenge 1 usage in main function
  private static void doChallenge1() {
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
    // sau
    // wait for all
    /*for(RabbitThread rabbitThread: race) {
      rabbitThread.join();
    }*/
  }

  // Challenge 2 usage in main function
  private static void doChallenge2() {
    BankAccount momAccount = new BankAccount("mom", 100_000);
    BankAccount myAccount = new BankAccount("me", 100);
    System.out.println("before:");
    System.out.println(momAccount);
    System.out.println(myAccount);

    TransactionThread t1 = new TransactionThread("T1", momAccount, myAccount, 10);
    TransactionThread t2 = new TransactionThread("T2", momAccount, myAccount, 100);

    //start transacting
    t1.start();
    t2.start();

    //wait for transfers to be completed
    try {
      t1.join();
      t2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("after:");
    System.out.println(momAccount);
    System.out.println(myAccount);
  }

  // Challenge 3 usage in main function
  public static void doChallenge3() {
    // spin off two 2 player threads
    Player player1 = new Player();
    Player player2 = new Player();

    player1.start();
    player2.start();

    //wait for then to finish choosing
    try {
      player1.join();
      player2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    // display the winner
    displayWinner(player1, player2);
  }

  static void displayWinner(Player p1, Player p2) {
    int result1 = p1.result; // 1 - rock, 0 - paper, -1 - scissors
    int result2 = p2.result;

    if (result1 == result2) {
      System.out.println("egalitate");
    } else if ( ( (result1 == -1) && (result2 == 0) ) ||
                ( (result1 == 1) && (result2 == -1) ) ||
                (  (result1 == 0) && (result2 == 1) ) ) {
      System.out.println("player 1 castiga");
    } else {
      System.out.println("player 2 castiga");
    }
  }

  // HardCore Challenge 1 usage in main function - Dinning Philosophers Challenge
  private static void doHardCOreChallenge1() {
    List<Chopstick> chopsticks = new ArrayList<>();
    List<Philosopher> philosophers = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      chopsticks.add(new Chopstick());
    }

    for (int i = 0; i < 5; i++) {
      philosophers.add(new Philosopher(i + 1, chopsticks.get((i + 1) % 5),  chopsticks.get(i)));
    }

    for (Philosopher philosopher : philosophers) {
      philosopher.start();
    }
  }

  // Method for printing separator between challenges
  static private void printChallengeSeparator(int challengeNumber) {
    System.out.println("======================== Challenge " + challengeNumber +
            " ==================================");
  }
}

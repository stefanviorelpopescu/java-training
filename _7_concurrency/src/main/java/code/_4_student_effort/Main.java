package code._4_student_effort;

public class Main {
  static void CodeChallenge1(){
    RabbitThread rt1 = new RabbitThread(2);
    RabbitThread rt2 = new RabbitThread(4);
    RabbitThread rt3 = new RabbitThread(6);
    RabbitThread rt4 = new RabbitThread(8);
    RabbitThread rt5 = new RabbitThread(10);
    RabbitRunnable rr1 = new RabbitRunnable(1);
    RabbitRunnable rr2 = new RabbitRunnable(3);
    RabbitRunnable rr3 = new RabbitRunnable(5);
    RabbitRunnable rr4 = new RabbitRunnable(7);
    RabbitRunnable rr5 = new RabbitRunnable(9);
    rt1.run();
    rr1.run();
    rt2.run();
    rr2.run();
    rt3.run();
    rr3.run();
    rt4.run();
    rr4.run();
    rt5.run();
    rr5.run();
  }
  static void CodeChallenge2(){
    BankAccount son = new BankAccount("Mihai", 1800);
    BankAccount mom = new BankAccount("Sonia", 3200);
    TransactionThread t  = new TransactionThread("mobila", son, mom, 1000);
    t.run();
    System.out.println(son.toString());
    System.out.println(mom.toString());
  }
  static void CodeChallenge3(){
    Player p1 = new Player();
    Player p2 = new Player();
    p1.run();
    p2.run();
    if(p1.s_ran.equals(p2.s_ran)){
      System.out.println("Draw");
    } else{
      if(p1.s_ran.equals("rock") && p2.s_ran.equals("paper")){
        System.out.println("Winner p2");
      }
      if(p1.s_ran.equals("rock") && p2.s_ran.equals("scrissors")){
        System.out.println("Winner p1");
      }
      if(p1.s_ran.equals("paper") && p2.s_ran.equals("rock")){
        System.out.println("Winner p1");
      }
      if(p1.s_ran.equals("paper") && p2.s_ran.equals("scrissors")){
        System.out.println("Winner p2");
      }
      if(p1.s_ran.equals("scrissors") && p2.s_ran.equals("rock")){
        System.out.println("Winner p2");
      }
      if(p1.s_ran.equals("scrissors") && p2.s_ran.equals("paper")){
        System.out.println("Winner p1");
      }
    }
  }
  static void HardCodeChallenge1(){
    final Philosopher[] philosophers = new Philosopher[5];
    Object[] forks = new Object[philosophers.length];

    for (int i = 0; i < forks.length; i++) {
      forks[i] = new Object();
    }

    for (int i = 0; i < philosophers.length; i++) {
      Object leftFork = forks[i];
      Object rightFork = forks[(i + 1) % forks.length];

      if (i == philosophers.length - 1) {
        philosophers[i] = new Philosopher(rightFork, leftFork);
      } else {
        philosophers[i] = new Philosopher(leftFork, rightFork);
      }

      Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
      t.start();
    }
  }
  public static void main(String[] args) {
    //CodeChallenge1();
    //CodeChallenge2();
    //CodeChallenge3();
    HardCodeChallenge1();
  }
}

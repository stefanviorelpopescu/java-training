package code._4_student_effort;

public class Philosopher extends Thread {
    private int nr;
    private Chopstick right;
    private Chopstick left;

    public Philosopher(int nr, Chopstick right, Chopstick left) {
        this.nr = nr;
        this.right = right;
        this.left = left;
    }

    @Override
    public void run() {
        // super.run();
        while (true) {
            if (right.lockChopstick()) {
                if (left.lockChopstick()) {
                    eat();
                    sleep();
                    left.unlockChopstick();
                }
                right.unlockChopstick();
            }
        }
    }

    private void sleep() {
        System.out.println("Philosopher #" + nr + " is starting to sleep");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void eat() {
        System.out.println("Philosopher #" + nr + " is eating");
    }
}

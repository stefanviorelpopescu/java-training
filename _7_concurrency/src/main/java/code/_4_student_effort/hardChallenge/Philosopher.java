package code._4_student_effort.hardChallenge;

public class Philosopher implements Runnable {
    // The forks on either side of this Philosopher
    private final Object lefty;
    private final Object righty;

    public Philosopher(Object leftChopstick, Object rightChopstick) {
        this.lefty = leftChopstick;
        this.righty = rightChopstick;
    }

    // Member variables, standard constructor
    private void doAction(String action) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + action);
        Thread.sleep(((int) (Math.random() * 10)));
    }

    @Override
    public void run() {
        try {
            while (true) {
                doAction(": Thinking");
                synchronized (lefty) {
                    doAction(": Picked up left fork");
                    synchronized (righty) {
                        // Eating
                        doAction(": Picked up right fork - eating");

                        doAction(": Put down right fork");
                    }

                    // Back to thinking
                    doAction(": Put down left fork. Back to thinking");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

    }
}

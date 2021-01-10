package code._4_student_effort;

public class RabbitRunnable implements Runnable {
    private int nr;

    RabbitRunnable(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit #" + this.nr + " is running");
    }
}

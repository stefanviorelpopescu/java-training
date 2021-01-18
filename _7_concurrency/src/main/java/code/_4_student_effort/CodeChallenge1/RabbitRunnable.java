package code._4_student_effort.CodeChallenge1;

public class RabbitRunnable implements Runnable {

    private int rabbitNumber;

    public RabbitRunnable(int rabbitNumber) {
        this.rabbitNumber = rabbitNumber;
    }

    @Override
    public void run() {
        System.out.println("Rabbit " + rabbitNumber + " is running");
    }
}
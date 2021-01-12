package code._4_student_effort.Challenge1;

public class RabbitThread extends Thread{

    private int rabbitNumber;

    public RabbitThread(int rabbitNumber) {
        this.rabbitNumber = rabbitNumber;
    }

    @Override
    public void run() {
        System.out.println("Rabbit #" + rabbitNumber + " is running");
    }
}

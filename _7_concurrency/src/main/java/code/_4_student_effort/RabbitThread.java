package code._4_student_effort;

public class RabbitThread extends Thread {
    private int nr;

     RabbitThread(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit #" + this.nr + "is running");
    }
}

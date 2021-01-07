package code._4_student_effort.challenge1;

public class RabbitThread extends Thread {
    private int nr;

    public RabbitThread(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.println("Rabbit " + nr + " is running");
    }
}

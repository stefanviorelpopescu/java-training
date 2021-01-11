package code._4_student_effort.rabbit_race;

public class RabbitThread extends Thread {

    private int nr;

    public RabbitThread(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.println("The rabbit number " + nr + " is running");
    }
}

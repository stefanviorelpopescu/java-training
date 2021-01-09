package code._4_student_effort;

public class RabbitRunnable implements Runnable{
    int nr;
    RabbitRunnable(int nr){
        this.nr = nr;
    }
    @Override
    public void run() {
        System.out.println("Rabbit " + nr + " is running");
    }
}

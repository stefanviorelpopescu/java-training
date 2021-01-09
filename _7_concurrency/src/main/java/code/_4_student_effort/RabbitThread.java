package code._4_student_effort;

public class RabbitThread extends Thread{
    int nr;
    RabbitThread(int nr){
        this.nr = nr;
    }
    public void run(){
        System.out.println("Rabbit " + nr + " is running");
    }
}

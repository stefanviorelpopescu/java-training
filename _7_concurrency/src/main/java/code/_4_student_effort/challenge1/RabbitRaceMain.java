package code._4_student_effort.challenge1;

public class RabbitRaceMain {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++) {
            Thread rabbit;
            if(i%2 == 0) {
                rabbit = new RabbitThread(i);

            } else {
                rabbit = new Thread(new RabbitRunnable(i));

            }
            rabbit.start();
        }
    }
}

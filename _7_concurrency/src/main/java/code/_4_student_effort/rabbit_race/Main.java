package code._4_student_effort.rabbit_race;

public class Main {

    public static void main(String[] args) {
        System.out.println("Race is starting ");

        for ( int i = 0; i < 10; i ++) {
            Thread rabbit = createRabbitThread(i);
            rabbit.start();
        }
    }

    private static Thread createRabbitThread(int i) {
        return (i % 2 == 0 ) ? new RabbitThread(i) : new Thread(new RabitRunnable(i));
    }
}

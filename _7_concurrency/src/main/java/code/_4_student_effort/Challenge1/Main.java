package code._4_student_effort.Challenge1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //firstStage();
        //secondStage();
        thirdStage();
    }

    // RabbitThread
    public static void firstStage() {
        for (int i = 1; i <= 100; i++) {
            new RabbitThread(i).start();
        }
    }

    // RabbitRunnable
    public static void secondStage() {
        for (int i = 1; i <= 100; i++) {
            new Thread(new RabbitRunnable(i)).start();
        }
    }

    // 10 rabbits - 5 RabbitThreads and 5 RabbitRunnable
    public static void thirdStage() {
        List<Thread> rabbits = new ArrayList<>();

        for (int i=1;i<=10;i++) {
            if (i%2==0) {
                rabbits.add(new RabbitThread(i));
            } else {
                rabbits.add(new Thread(new RabbitRunnable(i)));
            }
        }

        for (Thread currentThread : rabbits) {
            currentThread.start();
        }
    }
}

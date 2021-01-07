package code._4_student_effort.hardChallenge;

public class DiningPhilosophersMain {
    /**
     * So the five philosophers sit around the circular table with five forks (or chopsticks in this case)
     * Since one needs two chopsticks in order to eat, they must coordinate if they want to eat
     * During the downtime they think
     * **/

    public static void main(String[] args) throws Exception {
        int nrOfPhilosophers = 5; // must be odd

        Philosopher[] philosophers = new Philosopher[nrOfPhilosophers];
        Object[] chopsticks = new Object[nrOfPhilosophers];

        for (int i = 0; i < nrOfPhilosophers; i++) {
            chopsticks[i] = new Object();
        }

        for (int i = 0; i < nrOfPhilosophers; i++) {
            Object leftChopstick = chopsticks[i];
            Object rightChopstick = chopsticks[(i + 1) % chopsticks.length];

            if (i == nrOfPhilosophers - 1) {
                philosophers[i] = new Philosopher(rightChopstick, leftChopstick);
            } else {
                philosophers[i] = new Philosopher(leftChopstick, rightChopstick);
            }

            Thread t = new Thread(philosophers[i], "Philosopher " + (i + 1));
            t.start();
        }
    }
}

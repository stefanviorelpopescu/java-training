package code._4_student_effort.rabbit_race;

public class RabitRunnable implements Runnable {

    private int nr;

    public RabitRunnable(int nr) {
        this.nr = nr;
    }

    @Override
    public void run() {
        System.out.println("The rabbit number " + nr + " is running");
    }
}

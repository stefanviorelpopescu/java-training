package code._4_student_effort;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Chopstick {
    // interfata Lock cu implementarea ReentrantLock: in loc sa se faca synchronized pe lock intrinsec,
    // se cheama metoda lock() pe thread si la care se poate face unlock() cand se vrea
    private Lock lock = new ReentrantLock(true);

    public boolean lockChopstick() {
        lock.lock();
        return true;
    }

    public void unlockChopstick() {
        lock.unlock();
    }
}

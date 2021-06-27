package code._4_student_effort.Challenge4;

import java.util.Arrays;

public class Teacher implements ObservedSubject {
    private Observer[] observers = new Observer[0];
    @Override
    public void register(Observer obj) {
        int n = observers.length;
        observers = Arrays.copyOf(observers, n+1);
        observers[n] = obj;
    }

    @Override
    public void unregister(Observer obj) {
        int idxToRemove=-1;
        for (int i=0; i<observers.length; i++) {
            if (observers[i].equals(obj)) {
                idxToRemove = i;
                break;
            }
        }
        System.arraycopy(observers, idxToRemove + 1, observers, idxToRemove, observers.length - 1 - idxToRemove);

    }

    @Override
    public void notifyObservers(String message) {
        for (int i = 0; i < observers.length; i++) {
            observers[i].update(message);
        }
    }

    public void teach(String info) {
        for (int i=0; i<observers.length; i++) {
            observers[i].update(info);
        }
    }
}

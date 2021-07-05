package code._4_student_effort._4_challengeFour;

import java.util.ArrayList;

public class Teacher implements ObservedSubject {
    private final ArrayList<Observer> studentsObserving = new ArrayList<>();

    @Override
    public void register(Observer obj) {
        this.studentsObserving.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
//        studentsObserving.removeIf(observer -> observer.equals(obj));
    }

    @Override
    public void notifyObservers(String message) {
//        for (Observer observer : studentsObserving) {
//            observer.update(message);
//        }
    }

    public void teach(String javaTopic) {
        for (Observer student : studentsObserving) {
            student.update(javaTopic);
        }
    }
}

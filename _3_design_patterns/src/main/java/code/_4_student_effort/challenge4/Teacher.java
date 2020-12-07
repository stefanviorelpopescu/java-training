package code._4_student_effort.challenge4;

import java.util.Arrays;

public class Teacher implements ObservedSubject {
    private Observer[] students = new Observer[0];

    @Override
    public void register(Observer obj) {
        students = Arrays.copyOf(students, students.length + 1);
        students[students.length - 1] = obj;
    }

    @Override
    public void unregister(Observer obj) {
        for (int i = 0; i < students.length; ++i) {
            if (students[i].equals(obj)) {
                for (int k = i + 1; k < students.length; ++k) {
                    students[k - 1] = students[k];
                    i--;
                }
                break;
            }
        }
        students = Arrays.copyOf(students, students.length - 1);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer ob : students) {
            ob.update(message);
        }
    }

    public void teach(String s) {
        for(Observer ob : students) {
            ob.update(s);
        }
    }
}

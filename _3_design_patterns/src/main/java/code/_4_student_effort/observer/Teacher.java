package code._4_student_effort.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher implements ObservedObject {
    private List<Student> students;
    private String[] topics = new String[1];
    private int i = 0;

    public Teacher() {
        students = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        this.students.add((Student) obj);
    }

    @Override
    public void unregister(Observer obj) {
        this.students.remove((Student) obj);
    }

    public void teach(String topic) {
        topics[i] = topic;
        i++;
        topics = Arrays.copyOf(topics, topics.length + 1);
        notifyObservers(topic);
    }

    @Override
    public void notifyObservers(String message) {
        for(Student student:students){
            student.update(message);
        }
    }
}

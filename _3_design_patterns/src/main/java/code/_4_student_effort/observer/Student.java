package code._4_student_effort.observer;

import java.util.List;

public class Student implements Observer {
    private String name;
    private Teacher teacher;

    public Student(String name) {
        this.name = name;
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + this.name + " learned about " + message);
    }
}

package code._4_student_effort.observer;

public class Student implements Observer {
    String name;

    @Override
    public void update(String message) {
        System.out.println(name + " Message from teacher " + message);
    }
    public Student(String name){
        this.name=name;
    }
}
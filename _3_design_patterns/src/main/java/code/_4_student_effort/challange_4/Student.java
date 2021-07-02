package code._4_student_effort.challange_4;

public class Student implements Observer{

    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " " + message);
    }
}

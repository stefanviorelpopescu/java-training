package code._4_student_effort.Challenge4;

public class Student implements Observer{

    private String nume;

    public Student(String nume) {
        this.nume = nume;
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + nume + " learned about: " + message);
    }
}

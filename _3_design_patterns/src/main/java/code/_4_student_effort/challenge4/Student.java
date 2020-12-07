package code._4_student_effort.challenge4;

public class Student implements Observer{
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + this.name + " learned about " + message);
    }
}

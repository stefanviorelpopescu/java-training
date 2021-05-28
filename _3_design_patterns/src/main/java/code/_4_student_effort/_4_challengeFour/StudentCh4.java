package code._4_student_effort._4_challengeFour;

public class StudentCh4 implements Observer{
    private final String name;

    public StudentCh4(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " learned about " + message + ".");
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }
}

package code._4_student_effort;

public class StudentChallange4 implements Observer {

    private String name;
    public StudentChallange4(String name){
        this.name = name;
    }

    public void listenTo(Teacher teacher){
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + "Learned about" + message);
    }
}

package code._4_student_effort;

public class Studentv2 implements Observer {
    private final String name;

    public Studentv2(String name) {
        this.name = name;
    }
     public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " learned about " + message);
    }
}




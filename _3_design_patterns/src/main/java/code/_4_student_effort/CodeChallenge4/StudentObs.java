package code._4_student_effort.CodeChallenge4;

public class StudentObs implements Observer{

    private String name;

    public StudentObs(String name)  {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(message);
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}

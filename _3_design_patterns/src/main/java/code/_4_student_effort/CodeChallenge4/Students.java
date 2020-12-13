package code._4_student_effort.CodeChallenge4;

public class Students implements Observer {
    private String name;


    public Students(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void update(String message) {

        System.out.println("Student " + this.getName() + " learned about " + message);
    }

    public void listenTo(Teacher teacher){
        teacher.register(this);
    }
}
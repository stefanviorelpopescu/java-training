package code._4_student_effort;

// THIS CLASS IS USED IN TWO CHALLENGES
public class Student implements Observer {

    String name;
    //challenge PROXY
    int money;

    //challenge PROXY
    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public Student(String name) {
        this.name = name;
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + name + " learned about " + message);
    }

    //challenge PROXY
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}

package code._4_student_effort;

public class Student implements Observer{
    private String name;
    private int money;

    public Student(String name, int money){
        this.name = name;
        this.money = money;
    }

    public Student(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    @Override
    public void update(String message) {
        System.out.println("Student " + this.getName() + " learned about " + message);
    }

    public void listenTo(Teacher teacher){
        teacher.register(this);
    }
}

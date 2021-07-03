package code._4_student_effort;

public class Student implements Observer{
    private String name;
    private int money;

    public Student(String name,int money){
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    //Challenge 4
    public Student(String name){
        this.name = name;
    }

    @Override
    public void update(String message){
        System.out.println("Student "+ this.name + " learned about " + message);
    }

    public void listenTo(Teacher teacher){
        teacher.register(this);
    }
}

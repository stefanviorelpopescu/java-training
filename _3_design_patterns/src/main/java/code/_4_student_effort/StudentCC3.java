package code._4_student_effort;

public class StudentCC3 {
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    String name;
    int money;
    StudentCC3(String name, int money){
        this.name = name;
        this.money = money;
    }
}

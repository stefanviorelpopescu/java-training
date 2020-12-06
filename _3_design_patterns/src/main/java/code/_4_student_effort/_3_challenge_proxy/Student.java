package code._4_student_effort._3_challenge_proxy;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return this.name + " " + this.money +"$";
    }
}

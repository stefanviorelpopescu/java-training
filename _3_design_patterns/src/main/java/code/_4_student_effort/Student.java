package code._4_student_effort;

public class Student {
    private final String name;
    private final int money;

    public Student(String name, int money) {
        this.money = money;
        this.name = name;
    }

    public int getMoney() {
        return this.money;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}

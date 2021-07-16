package code._4_student_effort.Challenge3;

public class Student {
    private String name;
    private int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public boolean nameStartsWithP() {
        return name.startsWith("P");
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
}

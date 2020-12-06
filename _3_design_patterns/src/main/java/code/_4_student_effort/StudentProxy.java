package code._4_student_effort;

public class StudentProxy {
    private String name;
    private int money;

    public StudentProxy(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "StudentProxy{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}

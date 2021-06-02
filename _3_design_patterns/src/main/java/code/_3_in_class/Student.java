package code._3_in_class;

public class Student {
    private final String name;
    private final int money;

    public Student(String name, int money) {
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
        return name + " " + String.valueOf(money);
    }

}

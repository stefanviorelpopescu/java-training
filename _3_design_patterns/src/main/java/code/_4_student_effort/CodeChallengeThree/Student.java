package code._4_student_effort.CodeChallengeThree;

public class Student {
    private String name;
    private int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
    public String toString(){
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}

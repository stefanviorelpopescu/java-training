package code._4_student_effort;

public class Student {

    private String name;
    private int rentMoney;

    public Student(){}

    public Student(String name, int rentMoney) {
        this.name = name;
        this.rentMoney = rentMoney;
    }

    public String getName() {
        return name;
    }

    public int getRentMoney() {
        return rentMoney;
    }

    public String toString(){
        return  "{ name = " + name + " ,  money = " + rentMoney + " }";
    }
}

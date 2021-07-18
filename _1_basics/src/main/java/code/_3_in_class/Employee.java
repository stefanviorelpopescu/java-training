package code._3_in_class;

public class Employee {
    static int daysOff = 21;
    String name;
    public Employee(String name) {
        this.name = name;
    }
    public int getHolidayPayment(int amount) {
        int extra = 100;
        return daysOff * amount + extra;
    }
}

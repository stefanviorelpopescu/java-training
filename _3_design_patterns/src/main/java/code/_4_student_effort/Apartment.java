package code._4_student_effort;

public class Apartment {
String location;
int money;

    public Apartment(String location, int money) {
        this.location = location;
        this.money = money;
    }

    public String getLocation() {
        return location;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", money=" + money +
                '}';
    }
}

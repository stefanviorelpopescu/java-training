package code._4_student_effort.Challenge3;

public class Apartment {

    private String location;
    private int money;

    public Apartment(String location, int money) {
        this.location = location;
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + money +
                '}';
    }
}

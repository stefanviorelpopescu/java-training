package code._4_student_effort;

public class Apartment {
    private final String location;
    private final int monthlyRentCost;

    public Apartment(String location, int monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public int getMonthlyRentCost() {
        return this.monthlyRentCost;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }
}

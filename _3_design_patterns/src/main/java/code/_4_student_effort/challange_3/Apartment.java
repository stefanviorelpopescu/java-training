package code._4_student_effort.challange_3;

public class Apartment {
    private String location;
    private int monthyRentCost;

    public Apartment(String location, int monthyRentCost) {
        this.location = location;
        this.monthyRentCost = monthyRentCost;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthyRentCost=" + monthyRentCost +
                '}';
    }

    public int getMonthyRentCost() {
        return monthyRentCost;
    }
}

package code._4_student_effort;

public class Apartament {
    String location;
    int monthlyRentCost;

    Apartament(String location, int monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    @Override
    public String toString() {
        return "Apartament{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }
}

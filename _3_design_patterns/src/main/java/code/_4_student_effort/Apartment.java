package code._4_student_effort;

public class Apartment {
    String location;
    int monthlyRentCost;

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }

    Apartment(String location, int monthlyRentCost){
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }
}

package code._4_student_effort._3_challenge_proxy;

public class Apartment {
    String location;
    int monthlyRentCost;
    boolean isRented;

    public Apartment(String location, int monthlyRentCost) {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
        isRented = false;
    }

    @Override
    public String toString() {
        return "apartment in " + this.location + " for " + this.monthlyRentCost + "$" ;
    }
}

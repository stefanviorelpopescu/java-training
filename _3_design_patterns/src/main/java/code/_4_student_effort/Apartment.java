package code._4_student_effort;

public class Apartment {
    private String location;
    private int monthlyRentCost;

    public Apartment(String location,int monthlyRentCost){
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    public String getLocation() {
        return location;
    }
}

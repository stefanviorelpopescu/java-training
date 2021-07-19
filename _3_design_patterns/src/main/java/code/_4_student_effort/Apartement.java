package code._4_student_effort;

public class Apartement {
    private String location;
    private int monthlyRentCost;

    public Apartement(String location, int monthlyRentCost){
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public String getLocation() {
        return location;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    @Override
    public String toString() {
        return "Apartement{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }

}

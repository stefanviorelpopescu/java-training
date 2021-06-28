package code._4_student_effort.CodeChallengeThree;

public class Apartment {
    private String location;
    private int monthlyRentCost;

    public Apartment(String location, int rentPerMonth){
        this.location=location;
        this.monthlyRentCost=rentPerMonth;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRentPerMonth() {
        return monthlyRentCost;
    }

    public void setRentPerMonth(int monthlyRentCost) {
        this.monthlyRentCost = monthlyRentCost;
    }
    public String toString()
    {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }

}

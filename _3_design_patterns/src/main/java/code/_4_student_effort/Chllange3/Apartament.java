package code._4_student_effort.Chllange3;

public class Apartament {

    private String location;
    private int monthlyRentCost;

    public Apartament(String location, int monthlyRentCost)
    {
        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
    }

    public String getLocation()
    {
        return location;
    }

    public int getMonthlyRentCost()
    {
        return monthlyRentCost;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }
}

package code._4_student_effort.CodeChallenge3;

public class Apartment {

    private String location;
    private int monthlyRentCost;
    private boolean isRented;


    public Apartment(String location, int monthlyRentCost) {

        this.location = location;
        this.monthlyRentCost = monthlyRentCost;
        this.isRented = false;
    }

    public int getMonthlyRentCost() {
        return monthlyRentCost;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean rented) {
        isRented = rented;
    }

    public void setMonthlyRentCost(int monthlyRentCost) {
        this.monthlyRentCost = monthlyRentCost;
    }


    @Override
    public String toString() {
        return "Apartment{" +
                "location='" + location + '\'' +
                ", monthlyRentCost=" + monthlyRentCost +
                '}';
    }

}

package code._4_student_effort.CodeChallenge3;

public class Apartament {
    String location;
    int monthlyCost;

    public Apartament(String location, int monthlyCost) {
        this.location = location;
        this.monthlyCost = monthlyCost;
    }

    @Override
    public String toString() {
        return "Apartament{" +
                "location='" + location + '\'' +
                ", monthlyCost=" + monthlyCost +
                '}';
    }
}

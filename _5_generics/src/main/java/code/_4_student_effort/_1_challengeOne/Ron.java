package code._4_student_effort._1_challengeOne;

public class Ron extends Currency {

    public Ron() {}

    public Ron(double sum) {
        super(sum);
    }

    public double ron (double sum) {
        return super.getSum();
    }

    @Override
    public String toString() {
        return "Ron{" +
                "sum=" + sum +
                '}';
    }
}

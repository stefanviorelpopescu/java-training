package code._4_student_effort._1_challengeOne;

public class Usd extends Currency {

    public Usd() {}

    public Usd(double sum) {
        super(sum);
    }

    public double dollars (double sum) {
        return super.getSum();
    }

    @Override
    public String toString() {
        return "Usd{" +
                "sum=" + sum +
                '}';
    }
}

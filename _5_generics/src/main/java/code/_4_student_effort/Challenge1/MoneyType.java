package code._4_student_effort.Challenge1;

public abstract class MoneyType {

    private double sum;

    public MoneyType(double sum) {
        this.sum = sum;
    }

    public MoneyType() {

    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
}

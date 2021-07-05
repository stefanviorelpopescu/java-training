package code._4_student_effort._1_challengeOne;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    static Map<Class<? extends Currency>, Double> rates = new HashMap<>();
    double sum;

    public Currency() {}

    public Currency(double sum) {
        this.sum = sum;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public static Map<Class<? extends Currency>, Double> getRates() {
        return rates;
    }
}

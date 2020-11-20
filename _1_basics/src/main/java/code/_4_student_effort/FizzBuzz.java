package code._4_student_effort;
import code._2_challenge._1_fizzbuzz.NumberWordCorrelation; // import used class

public class FizzBuzz {
    static public String fizzBuzz3(int i) {     //create new function, make it static
                                            // to access it without instances
        String s = "";

        NumberWordCorrelation[] correlations = {
                new NumberWordCorrelation(3, "Fizz"),
                new NumberWordCorrelation(5, "Buzz"),
                new NumberWordCorrelation(7, "Rizz"),
                new NumberWordCorrelation(11, "Jazz"),//modified as requested
        };
        boolean isDivisible = false;
        for (NumberWordCorrelation correlation : correlations) {
            if (i % correlation.getNumber() == 0) {
                isDivisible = true;
                s += correlation.getWord();
            }
        }
        if (!isDivisible) {
            s = String.valueOf(i);
        }

        return s;
    }
}

package code._4_student_effort;

public class FirstCodeChallenge {

    /**
     * Receives an input number and processes it, returning it
     * based on the fizzbuzz rule.
     * @param input a number to be printed in fizzbuzz format
     * @return a string with either the number of fizz/buzz
     */
    public static String fizzBuzz1(Integer input) {
        String s = "";

        if (input % 5 == 0)
            s += "Buzz";
        if (input % 3 == 0)
            s += "Fizz";

        if (s.isEmpty())
            return input.toString();
        else
            return s;
    }

    /**
     * Receives an input number and processes it, returning it
     * based on the fizzbuzz stage 2 rule.
     * @param input a number to be printed in fizzbuzz format
     * @return a string with either the number of fizz/buzz
     */
    public static String fizzBuzz2(Integer input) {
        String s = "";

        if (input % 5 == 0)
            s += "Buzz";
        if (input % 3 == 0)
            s += "Fizz";
        if (input % 7 == 0)
            s += "Rizz";
        if (input % 11 == 0)
            s += "Jazz";

        if (s.isEmpty())
            return input.toString();
        else
            return s;
    }
}

package code._4_student_effort;

public class SecondCodeChallenge {

    public static String compute1 (Integer input) {
        String s = "";
        boolean isDivisible = false;

        if (input % 3 == 0) {
            s += "Foo";
            isDivisible = true;
        }
        if (input % 5 == 0) {
            s += "Bar";
            isDivisible = true;
        }
        if (input % 7 == 0) {
            s += "Qix";
            isDivisible = true;
        }

        // Analyze the digits of the number
        int aux = input;
        char[] digits = String.valueOf(input).toCharArray(); // array of digits
        for (char digit : digits) {
            if (digit == '3')
                s += "Foo";
            if (digit == '5')
                s += "Bar";
            if (digit == '7')
                s += "Qix";
        }

        if (!isDivisible)
            return input.toString();
        else
            return s;
    }

    public static String compute2 (Integer input) {
        String s = "";
        boolean isDivisible = false;

        if (input % 3 == 0) {
            s += "Foo";
            isDivisible = true;
        }
        if (input % 5 == 0) {
            s += "Bar";
            isDivisible = true;
        }
        if (input % 7 == 0) {
            s += "Qix";
            isDivisible = true;
        }

        // Analyze the digits of the number
        int aux = input;
        String endValue = ""; //rebuilding input with * instead of 0's
        char[] digits = String.valueOf(input).toCharArray(); // array of digits
        for (char digit : digits) {
            if (digit == '0') {
                s += "*";
                endValue += "*";
                continue;
            }
            if (digit == '3')
                s += "Foo";
            if (digit == '5')
                s += "Bar";
            if (digit == '7')
                s += "Qix";

            endValue += digit;
        }

        if (!isDivisible)
            return endValue.toString();
        else
            return s;
    }
}

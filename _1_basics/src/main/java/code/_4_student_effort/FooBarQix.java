package code._4_student_effort;

public class FooBarQix {

    public static void main(String[] args) {
        // Code Challenge 2
        for (int i = 1; i <= 100; i++) {
            //String s = compute(i);
            String s = compute2(i);
            System.out.println(s);
        }
    }
    public static String compute(int i) {
        // returneaza un string in functie de numarul din input
        String response = "";
        if (i % 3 == 0) {
            response += "Foo";
        }
        if (i % 5 == 0) {
            response += "Bar";
        }
        if (i % 7 == 0) {
            response += "Qix";
        }

        char[] digits = String.valueOf(i).toCharArray();
        for (char digit : digits) {

            if (digit == '3') {
                response += "Foo";
            }
            if (digit == '5') {
                response += "Bar";
            }
            if (digit == '7') {
                response += "Qix";
            }

        }

        if (response.isEmpty()) {
            response = String.valueOf(i);
        }

        //System.out.println(response);
        return response;
    }

    public static String compute2(int i) {
        String s = "";

        boolean isDivisible = false;
        if (i % 3 == 0) {
            s += "Foo";
            isDivisible = true;
        }
        if (i % 5 == 0) {
            s += "Bar";
            isDivisible = true;
        }
        if (i % 7 == 0) {
            s += "Qix";
            isDivisible = true;
        }
        // convert i into String
        // convert String into array of chars
        char[] digits = String.valueOf(i).toCharArray();
        // it's compulsory to convert into array so that the iteration is ok
        // for-each loop to every character in the String digits
        for (char digit : digits) {

            if (digit == '3') {
                s += "Foo";
            } else if (digit == '5') {
                s += "Bar";
            } else if (digit == '7') {
                s += "Qix";
            } else if (digit == '0') {
                s += "*";
            } else if (!isDivisible) {
                s += digit;
            }
        }
        return s;
    }

}
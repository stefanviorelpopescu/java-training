package code._4_student_effort;

public class FooBarQix {
    public static void main(String[] args) {
        System.out.println(compute(1));
        System.out.println(compute(2));
        System.out.println(compute(3));
        System.out.println(compute(4));
        System.out.println(compute(5));
        System.out.println(compute(6));
        System.out.println(compute(7));
        System.out.println(compute(8));
        System.out.println(compute(9));
        System.out.println(compute(10));
        System.out.println(compute(13));
        System.out.println(compute(15));
        System.out.println(compute(21));
        System.out.println(compute(33));
        System.out.println(compute(51));
        System.out.println(compute(53));
        System.out.println(compute2(101));
        System.out.println(compute2(303));
        System.out.println(compute2(105));
        System.out.println(compute2(10101));
    }

    public static String compute(int number) {
        StringBuilder result = new StringBuilder();
        if (number % 3 == 0) {
            result.append("Foo");
        }

        if (number % 5 == 0) {
            result.append("Bar");
        }

        if (number % 7 == 0) {
            result.append("Qix");
        }

        String numberToString = String.valueOf(number);
        for (int i = 0; i < numberToString.length(); i++) {
            if (numberToString.charAt(i) == '3') {
                result.append("Foo");
            } else if (numberToString.charAt(i) == '5') {
                result.append("Bar");
            } else if (numberToString.charAt(i) == '7') {
                result.append("Qix");
            }
        }

        if (result.length() == 0) {
            result.append(numberToString);
        }

        return new String(result);
    }

    public static String compute2(int number) {
        boolean divided = false;
        StringBuilder result = new StringBuilder();
        if (number % 3 == 0) {
            result.append("Foo");
            divided = true;
        }

        if (number % 5 == 0) {
            result.append("Bar");
            divided = true;
        }

        if (number % 7 == 0) {
            result.append("Qix");
            divided = true;
        }

        String numberToString = String.valueOf(number);
        for (int i = 0; i < numberToString.length(); i++) {
            if (numberToString.charAt(i) == '3') {
                result.append("Foo");
            } else if (numberToString.charAt(i) == '5') {
                result.append("Bar");
            } else if (numberToString.charAt(i) == '7') {
                result.append("Qix");
            } else if (numberToString.charAt(i) == '0') {
                result.append("*");
            } else if (!divided) {
                result.append(numberToString.charAt(i));
            }
        }

        return new String(result);
    }
}
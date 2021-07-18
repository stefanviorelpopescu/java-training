package code._4_student_effort;

public class Challenge2 {
    static String compute(int number) {
        String s = "";
        if (number % 3 == 0) {
            s = "Foo";
        }
        if (number % 5 == 0) {
            s += "Bar";
        }
        if (number % 7 == 0) {
            s += "Qix";
        }
        int copy = number;
        int reverse = 0;
        while (number != 0) {
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        while (reverse != 0) {
            if (reverse % 10 == 3) {
                s += "Foo";
            }
            if (reverse % 10 == 5) {
                s += "Bar";
            }
            if (reverse % 10 == 7) {
                s += "Qix";
            }
            reverse = reverse / 10;
        }
        if (s == "") {
            return String.valueOf(copy);
        }
        else {
            return s;
        }
    }
    static String compute2(int number) {
        String s = "";
        if (number % 3 == 0) {
            s = "Foo";
        }
        if (number % 5 == 0) {
            s += "Bar";
        }
        if (number % 7 == 0) {
            s += "Qix";
        }
        int reverse = 0;
        String reverseStar = "";
        while (number != 0) {
            if (number % 10 == 0) {
                if (s != "") {
                    s += "*";
                }
                reverseStar += "*";
            } else {
                reverseStar += number % 10;
            }
            reverse = reverse * 10 + number % 10;
            number = number / 10;
        }
        while (reverse != 0) {
            if (reverse % 10 == 3) {
                s += "Foo";
            }
            if (reverse % 10 == 5) {
                s += "Bar";
            }
            if (reverse % 10 == 7) {
                s += "Qix";
            }
            reverse = reverse / 10;
        }
        if (s != "") {
            return s;
        } else {
            String star = "";
            for (int i = reverseStar.length() - 1; i >= 0; i--) {
                star += reverseStar.charAt(i);
            }
            return star;
        }
    }
}

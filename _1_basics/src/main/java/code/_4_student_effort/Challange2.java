package code._4_student_effort;

public class Challange2 {
    public String compute(int number) {
        String s = "";
        if (number % 3 == 0)
            s += "Foo";
        else if (number % 5 == 0)
            s += "Bar";
        else if (number % 7 == 0)
            s += "Qiz";
        char[] digits = String.valueOf(number).toCharArray();
        for (char digit : digits) {
            if (digit == '3') s += "Foo";
            if (digit == '5') s += "Bar";
            if (digit == '7') s += "Qix";
        }
        if (s.isEmpty()) {
            s = String.valueOf(number);
        }
        return s;
    }


    public String compute2(int number) {
        String s = "";
        boolean div = false;
        if (number % 3 == 0) {
            s += "Foo";
            div = true;
        } else if (number % 5 == 0) {
            s += "Bar";
            div = true;
        } else if (number % 7 == 0) {
            s += "Qiz";
            div = true;
        }
        char[] digits = String.valueOf(number).toCharArray();
        for (char digit : digits) {
            if (digit == '3') s += "Foo";
            else if (digit == '5') s += "Bar";
            else if (digit == '7') s += "Qix";
            else if (digit == '0') s += "*";
            else if (div == false) s += digit;
        }
        return s;
    }

}

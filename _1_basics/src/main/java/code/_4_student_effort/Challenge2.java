package code._4_student_effort;

public class Challenge2 {
    public static String compute(int i){
        String s = "";
        if(i%3 == 0) s += "Foo";
        if(i%5 == 0) s += "Bar";
        if(i%7 == 0) s += "Qix";

        char[] digits = String.valueOf(i).toCharArray();
        for (char digit : digits) {

            if (digit == '3') s += "Foo";
            if (digit == '5') s += "Bar";
            if (digit == '7') s += "Qix";

        }

        if (s.isEmpty()) {
            s = String.valueOf(i);
        }
        return s;

    }

    public static String compute2(int i) {
        String s = "";
        boolean ok = false;
        if(i%3 == 0) {
            s += "Foo";
            ok = true;
        }
        if(i%5 == 0){
            s += "Bar";
            ok = true;
        }
        if(i%7 == 0) {
            s += "Qix";
            ok = true;
        }

        char[] digits = String.valueOf(i).toCharArray();
        for (char digit : digits) {

            if (digit == '3') s += "Foo";
            else if (digit == '5') s += "Bar";
            else if (digit == '7') s += "Qix";
            else if (digit == '0') s += "*";
            else if (ok == false) s += digit;
        }

        return s;
    }
}

package code._4_student_effort;

public class Challenge2 {

    public static String compute(int number) {
        String str = "";
        if (number % 3 == 0) {
            if (number % 5 == 0)
                str += "Foo";
            else if (number % 7 == 0)
                str += "FooBar";
            else
                str += "FooQix";
        } else if (number % 5 == 0) {
            if (number % 7 == 0)
                str += "BarQix";
            else
                str += "Bar";
        } else if (number % 7 == 0) {
            str += "Qix";
        }

        while (number > 0) {
            int res = number % 10;
            if (res == 3)
                str += "Foo";
            else if (res == 5)
                str += "Bar";
            else if (res == 7)
                str += "Qix";
            number = number / 10;
        }


        return str;
    }

    public static String compute2(int number) {
        String str = "";
        if (number % 3 == 0) {
            if (number % 5 == 0)
                str += "Foo";
            else if (number % 7 == 0)
                str += "FooBar";
            else
                str += "FooQix";
        } else if (number % 5 == 0) {
            if (number % 7 == 0)
                str += "BarQix";
            else
                str += "Bar";
        } else if (number % 7 == 0) {
            str += "Qix";
        }

        while (number > 0) {
            int res = number % 10;
            if (res == 3)
                str += "Foo";
            else if (res == 5)
                str += "Bar";
            else if (res == 7)
                str += "Qix";
            else if(res==0)
                str+="*";
            number = number / 10;
        }

    return str;
    }
}

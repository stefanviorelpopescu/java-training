package code._4_student_effort;

public class FooBarQixHW {
    public String compute(int i) {
        String string ="";

        if (i % 3 == 0)
            string += "Foo";
        if (i % 5 == 0)
            string += "Bar";
        if (i % 7 == 0)
            string += "Qix";

        char[] digits = String.valueOf(i).toCharArray();

        for (char digit : digits) {

            if (digit == '3')
                string += "Foo";
            if (digit == '5')
                    string += "Bar";
            if (digit == '7')
                string += "Qix";

        }

        if (string.isEmpty())
        {
            string = String.valueOf(i);
        }
        return string;
    }

    public String compute2(int i) {
        String string ="";

        if (i % 3 == 0)
            string += "Foo";
        if (i % 5 == 0)
            string += "Bar";
        if (i % 7 == 0)
            string += "Qix";

        char[] digits = String.valueOf(i).toCharArray();

        for (char digit : digits) {

            if (digit == '3')
                string += "Foo";
            if (digit == '5')
                string += "Bar";
            if (digit == '7')
                string += "Qix";
            if (digit == '0')
                string += "*";

        }

        if (string.isEmpty())
        {
            string = String.valueOf(i);
        }
        return string;
    }
}

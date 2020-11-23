package code._4_student_effort;


public class FooBarQix {
    static String compute(int number) {
        String stringOutput = "";
        boolean Divisible = false;

        if (number % 3 == 0 )
        {
            stringOutput += "Foo";
            Divisible = true;
        }
        if (number % 5 == 0 )
        {
            stringOutput += "Bar";
            Divisible = true;
        }
        if (number % 7 == 0 )
        {
            stringOutput += "Qix";
            Divisible = true;
        }

        char[] digits = String.valueOf(number).toCharArray();

        for (char digit : digits)
        {
            if (digit == '3')
            {
                stringOutput += "Foo";
                Divisible = true;
            }
            else if (digit == '5')
            {
                stringOutput += "Bar";
                Divisible = true;
            }
            else if (digit == '7')
            {
                stringOutput += "Qix";
                Divisible = true;
            }

        }

        if (!Divisible) stringOutput += String.valueOf(number);

        return stringOutput;

    }


    static String compute2(int number) {
        String stringOutput = "";
        boolean Divisible = false;

        if (number % 3 == 0 )
        {
            stringOutput += "Foo";
            Divisible = true;
        }
        if (number % 5 == 0 )
        {
            stringOutput += "Bar";
            Divisible = true;
        }
        if (number % 7 == 0 )
        {
            stringOutput += "Qix";
            Divisible = true;
        }

        char[] digits = String.valueOf(number).toCharArray();

        for (char digit : digits)
        {
            if (digit == '3')
            {
                stringOutput += "Foo";
                Divisible = true;
            }
            else if (digit == '5')
            {
                stringOutput += "Bar";
                Divisible = true;
            }
            else if (digit == '7')
            {
                stringOutput += "Qix";
                Divisible = true;
            }
            else if (digit == '0')
            {
                stringOutput += "*";
                Divisible = true;
            }

        }

        if (!Divisible) stringOutput += String.valueOf(number);

        return stringOutput;

    }


    public static void main(String[] args) {
    int number = 3576;
    System.out.println(compute(number));

    int number2 = 10763;
        System.out.println(compute2(number2));
    }
}

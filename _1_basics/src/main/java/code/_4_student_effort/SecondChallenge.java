package code._4_student_effort;

public class SecondChallenge {

    public void showInformationsAboutChallenge() {

        System.out.println("If the number is divisible by 3, write \"Foo\" instead of the number");
        System.out.println("If the number is divisible by 5, add \"Bar\"");
        System.out.println("If the number is divisible by 7, add \"Qix\"");
        System.out.println("For each digit 3,5,7, add \"Foo\", \"Bar\",\"Qix\" in the digits order");
    }

    public void runSimple(int number) {

        String toShow = "";

        if (divisibleBy3(number)) {
            toShow += "Foo";
        }
        if (divisibleBy5(number)) {
            toShow += "Bar";
        }
        if (divisibleBy7(number)) {
            toShow += "Qix";
        }

        int temp = number;
        while (temp > 0) {
            if (temp%10 == 3) {
                toShow += "Foo";
            } else if (temp%10 == 5) {
                toShow += "Bar";
            } else if (temp%10 == 7) {
                toShow += "Qix";
            }

            temp/=10;
        }

        System.out.println(number + " => " + toShow);

    }

    public void runComplex(int number) {

        String toShow = "";

        if (divisibleBy3(number)) {
            toShow += "Foo";
        }
        if (divisibleBy5(number)) {
            toShow += "Bar";
        }
        if (divisibleBy7(number)) {
            toShow += "Qix";
        }

        int temp = number;
        int count = 0;
        while (temp > 0) {
            if (temp%10 == 0) {
                toShow += "*";
            }
            else if (temp%10 == 3) {
                toShow += "Foo";
                count++;
            } else if (temp%10 == 5) {
                toShow += "Bar";
                count++;
            } else if (temp%10 == 7) {
                toShow += "Qix";
                count++;
            }

            temp/=10;
        }

        if (count == 0) {
            toShow = "";
            temp = number;
            while (temp>0) {
                if (temp%10 == 0) {
                    toShow += "*";
                } else {
                    toShow += temp%10;
                }

                temp/=10;
            }
        }

        System.out.println(number + " => " + toShow);

    }

    public boolean divisibleBy3(int number) {
        return number % 3 == 0;
    }

    public boolean divisibleBy5(int number) {
        return number % 5 == 0;
    }

    public boolean divisibleBy7(int number) {
        return number % 7 == 0;
    }


}

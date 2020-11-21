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
        int count =0;

        if (divisibleBy3(number)) {
            toShow += "Foo";
            count++;
        }
        if (divisibleBy5(number)) {
            toShow += "Bar";
            count++;
        }
        if (divisibleBy7(number)) {
            toShow += "Qix";
            count++;
        }

        if (count != 0) {
            toShow += eachDigitWithDivisors(number);
        } else {
            toShow += eachDigitWithoutDivisors(number);
        }
        System.out.println(number + " => " + toShow);

    }

    public String eachDigitWithDivisors(int number) {

        String toReturn = "";
        int nod = (int) Math.pow(10,numbersOfDigits(number))/10;

        do {
            int toCheck = number/nod;
            nod /= 10;

            if (toCheck%10 == 0) {
                toReturn += "*";
            } else if (toCheck%10 == 3) {
                toReturn += "Foo";
            } else if (toCheck%10 == 5) {
                toReturn += "Bar";
            } else if (toCheck%10 == 7) {
                toReturn += "Qix";
            }

        } while (nod != 0);

        return toReturn;
    }

    public String eachDigitWithoutDivisors(int number) {

        String toReturn = "";

        while (number>0) {
            if (number%10 == 0) {
                toReturn += "*";
            } else {
                toReturn += number%10;
            }

            number/=10;
        }

        return toReturn;

    }

    public int numbersOfDigits(int number) {

        int count=0;
        while (number>0) {
            count++;
            number/=10;
        }

        return count;
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

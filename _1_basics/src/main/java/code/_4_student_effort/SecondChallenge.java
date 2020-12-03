package code._4_student_effort;

public class SecondChallenge {

    public void showInformationsAboutChallenge() {

        System.out.println("If the number is divisible by 3, write \"Foo\" instead of the number");
        System.out.println("If the number is divisible by 5, add \"Bar\"");
        System.out.println("If the number is divisible by 7, add \"Qix\"");
        System.out.println("For each digit 3,5,7, add \"Foo\", \"Bar\",\"Qix\" in the digits order");
    }

    public void run(int number) {

        StringBuilder toShow = new StringBuilder();

        // see if the number is divisible by 3
        if (divisibleBy3(number)) {
            toShow.append("Foo");
        }

        // see if the number is divisible by 5
        if (divisibleBy5(number)) {
            toShow.append("Bar");
        }

        // see if the number is divisible by 7
        if (divisibleBy7(number)) {
            toShow.append("Qix");
        }

        // see if the number contains digits
        toShow.append(eachDigit(number));

        // if the previous stringBuilder contains only asterix, we call a second method to show digit with asterix
        if (containsOnlyAsterix(toShow) == true) {
            toShow.setLength(0);
            toShow.append(eachDigit2(number));
        }

        // if nothing is fiting, we show the number instead
        if (toShow.length() == 0) {
            toShow.append(number);
        }

        System.out.println(number + " => " + toShow);
        toShow.setLength(0);

    }

    public StringBuilder eachDigit(int number) {

        StringBuilder toReturn = new StringBuilder();

        int nod = (int) Math.pow(10,numbersOfDigits(number))/10;

        do {
            int toCheck = number / nod;
            nod /= 10;

            if (toCheck % 10 == 0) {
                toReturn.append("*");
            } else if (divisibleBy3(toCheck%10)) {
                toReturn.append("Foo");
            } else if (divisibleBy5(toCheck%10)) {
                toReturn.append("Bar");
            } else if (divisibleBy7(toCheck%10)) {
                toReturn.append("Qix");
            }

        } while (nod != 0);

        return toReturn;
    }

    public StringBuilder eachDigit2(int number) {

        StringBuilder toReturn = new StringBuilder();

        int nod = (int) Math.pow(10,numbersOfDigits(number))/10;

        do {
            int toCheck = number / nod;
            nod /= 10;

            if (toCheck % 10 == 0) {
                toReturn.append("*");
            } else {
                toReturn.append(toCheck%10);
            }

        } while (nod != 0);

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

    public boolean containsOnlyAsterix(StringBuilder stringBuilder) {

        for (int i=0;i<stringBuilder.length();i++) {
            if (stringBuilder.charAt(i) != '*') {
                return false;
            }
        }

        return true;
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

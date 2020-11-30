package code._4_student_effort;

public class FirstChallenge {

    public void showInformationsAboutChallenge() {

        System.out.println("First challenge: FizzBuzz");
        System.out.println("Write a program that prints the numbers from 1 to 100");
        System.out.println("But for multiples of 3 print \"Fizz\" instead of the number");
        System.out.println("And for the multiples of 5 print \"Buzz\"");
        System.out.println("For numbers which are multiples of both 3 and 5 print \"FizzBuzz\"");
    }

    public void run() {

        String toShow;

        int number=200;
        for (int i =1 ;i<=number;i++) {

            // reinit the String to show;
            toShow="";

            // see if the number is multiple of 3
            if (multipleOf3(i)) {
                toShow += "Fizz";
            }

            // see if the number is multiple of 5
            if (multipleOf5(i)) {
                toShow += "Buzz";
            }

            // see if the number is multiple of 7
            if (multipleOf7(i)) {
                toShow += "Rizz";
            }

            // see if the number is multiple of 11
            if (multipleOf11(i)) {
                toShow += "Jazz";
            }

            // see if the number is multiple of 3,5,7 or 11, if not show the number
            if (toShow.isBlank()) {
                toShow += i;
            }

            System.out.println(i + ": " + toShow);
        }
    }

    public boolean multipleOf3 (int number) {
        return number%3 == 0;
    }

    public boolean multipleOf5 (int number) {
        return number%5 == 0;
    }

    public boolean multipleOf7 (int number) {
        return number%7 == 0;
    }

    public boolean multipleOf11 (int number) {
        return number%11 == 0;
    }

}

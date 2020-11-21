package code._4_student_effort;

public class FirstChallenge {

    public void showInformationsAboutChallenge() {

        System.out.println("First challenge: FizzBuzz");
        System.out.println("Write a program that prints the numbers from 1 to 100");
        System.out.println("But for multiples of 3 print \"Fizz\" instead of the number");
        System.out.println("And for the multiples of 5 print \"Buzz\"");
        System.out.println("For numbers which are multiples of both 3 and 5 print \"FizzBuzz\"");
    }

    // fara 7 si 11
    public void runSimple() {

        int number=100;

        for (int i=1;i<number;i++) {
            if (i%3== 0 && i%5==0) {
                System.out.print("FizzBuzz, ");
            } else if (i%3==0) {
                System.out.print("Fizz, ");
            } else if (i%5==0) {
                System.out.print("Buzz, ");
            } else {
                System.out.print(i + ", ");
            }
        }

        if (number%3== 0 && number%5==0) {
            System.out.print("FizzBuzz.");
        } else if (number%3==0) {
            System.out.print("Fizz.");
        } else if (number%5==0) {
            System.out.print("Buzz.");
        } else {
            System.out.print(number + ".");
        }
    }

    public void runComplex() {

        int number=100;

        for (int i=1;i<number;i++) {
            if (i%3== 0 && i%5==0) {
                System.out.print("FizzBuzz, ");
            } else if (i%3==0) {
                System.out.print("Fizz, ");
            } else if (i%5==0) {
                System.out.print("Buzz, ");
            } else if (i%7==0) {
                System.out.println("Rizz, ");
            } else if (i%11==0) {
                System.out.println("Jazz, ");
            } else {
                System.out.print(i + ", ");
            }
        }

        if (number%3== 0 && number%5==0) {
            System.out.print("FizzBuzz.");
        } else if (number%3==0) {
            System.out.print("Fizz.");
        } else if (number%5==0) {
            System.out.print("Buzz.");
        } else if (number%7==0) {
            System.out.println("Rizz.");
        } else if (number%11==0) {
            System.out.println("Jazz.");
        } else {
            System.out.print(number + ".");
        }
    }


}

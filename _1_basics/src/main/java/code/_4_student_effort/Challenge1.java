package code._4_student_effort;

public class Challenge1 {
    public static void fizzbuzz1(int n) {
        int i;
        for (i = 1; i < n; i++) {
            if (i % 15 == 0) {
                System.out.print("FizzBuzz" + "," + " ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz" + "," + " ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz" + "," + " ");
            } else
                System.out.print(i + "," + " ");

        }
        if (i % 15 == 0) {
            System.out.print("FizzBuzz");
        } else if (i % 3 == 0) {
            System.out.print("Fizz");
        } else if (i % 5 == 0) {
            System.out.print("Buzz");
        } else
            System.out.print(i);
    }

    public static void fizzbuzz2(int n) {
        int i;
        for (i = 1; i < n; i++) {
            if (i % (3 * 5 * 7 * 11) == 0)
                System.out.print("FizzBuzzRizzJazz" + "," + " ");
            else
                if (i % (3 * 5 * 7) == 0)
                    System.out.print("FizzBuzzRizz" + "," + " ");
                else if (i % (3 * 5 * 11) == 0)
                    System.out.print("FizzBuzzJazz" + "," + " ");
                else if (i % (3 * 7 * 11) == 0)
                    System.out.print("FizzRizzJazz" + "," + " ");
                else if (i % (5 * 7 * 11) == 0)
                    System.out.print("BuzzRizzJazz" + "," + " ");
                else if (i % (3 * 5) == 0)
                    System.out.print("FizzBuzz" + "," + " ");
                else if (i % (3 * 7) == 0)
                    System.out.print("FizzRizz" + "," + " ");
                else if (i % (3 * 11) == 0)
                    System.out.print("FizzJazz" + "," + " ");
                else if (i % (5 * 7) == 0)
                    System.out.print("BuzzRizz" + "," + " ");
                else if (i % (5 * 11) == 0)
                    System.out.print("BuzzJazz" + "," + " ");
                else if (i % 3 == 0)
                    System.out.print("Fizz" + "," + " ");
                else if (i % 5 == 0)
                    System.out.print("Buzz" + "," + " ");
                else if (i % 7 == 0)
                    System.out.print("Rizz" + "," + " ");
                else if (i % 11 == 0)
                    System.out.print("Jazz" + "," + " ");
                else
                    System.out.print(i + "," + " ");

        }
        if (i % (3 * 5 * 7 * 11) == 0)
            System.out.print("FizzBuzzRizzJazz");
        else
        if (i % (3 * 5 * 7) == 0)
            System.out.print("FizzBuzzRizz");
        else if (i % (3 * 5 * 11) == 0)
            System.out.print("FizzBuzzJazz");
        else if (i % (3 * 7 * 11) == 0)
            System.out.print("FizzRizzJazz");
        else if (i % (5 * 7 * 11) == 0)
            System.out.print("BuzzRizzJazz");
        else if (i % (3 * 5) == 0)
            System.out.print("FizzBuzz");
        else if (i % (3 * 7) == 0)
            System.out.print("FizzRizz");
        else if (i % (3 * 11) == 0)
            System.out.print("FizzJazz");
        else if (i % (5 * 7) == 0)
            System.out.print("BuzzRizz");
        else if (i % (5 * 11) == 0)
            System.out.print("BuzzJazz");
        else if (i % 3 == 0)
            System.out.print("Fizz");
        else if (i % 5 == 0)
            System.out.print("Buzz");
        else if (i % 7 == 0)
            System.out.print("Rizz");
        else if (i % 11 == 0)
            System.out.print("Jazz");
        else
            System.out.print(i );
    }
}




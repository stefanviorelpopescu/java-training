package code._4_student_effort;

public class Challenge1 {
    private static void MultipleFB(int number) {
        if (number % 3 == 0) {
            System.out.print("Fizz");
        }
        if (number % 5 == 0) {
            System.out.print("Buzz");
        }
        if (number % 3 != 0 && number % 5 != 0) {
            System.out.print(number);
        }
    }
    private static void MultipleRJ(int number) {
        if (number % 7 == 0) {
            System.out.print("Rizz");
        }
        if (number % 11 == 0) {
            System.out.print("Jazz");
        }
        if (number % 7 != 0 && number % 11 != 0) {
            System.out.print(number);
        }
    }
    static void FizzBuzz() {
        for (int i = 1; i <= 100; i++) {
            MultipleFB(i);
            System.out.print(i == 100 ? "" : ", ");
        }
    }
    static void RizzJazz() {
        for (int i = 1; i <= 100; i++) {
            MultipleRJ(i);
            System.out.print(i == 100 ? "" : ", ");
        }
    }
}

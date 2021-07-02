package code._4_student_effort;

public class Fizzbuzz {
    private static void Fizzbuzz() {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println("Fizzbuzz");

                } else if (i % 5 == 0) {
                    System.out.println("Buzz");

                } else if (i % 3 == 0) {
                    System.out.println("Fizz");

                }
            } else if ((i % 7 == 0) || (i % 11 == 0)) {
                if (i % 7 == 0) {
                    System.out.println("Rizz");
                } else if (i % 11 == 0) {
                    System.out.println("Jazz");
                }
            } else
                System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Fizzbuzz();
    }
}

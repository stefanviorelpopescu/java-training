package code._4_student_effort;

public class Challenge1 {
    static void FizzBuzz() {
        System.out.print("#############  Start Challenge #1   ############# \n");
        for(int num = 1 ; num <= 10; ++num) {
            if(num % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (num % 3 == 0) {
                System.out.println("Fizz");
            } else if (num % 5 == 0) {
                System.out.println("Buzz");
            } else if (num % 77 == 0) {
                System.out.println("RizzJazz");
            } else if (num % 7 == 0) {
                System.out.println("Rizz");
            } else if (num % 11 == 0) {
                System.out.println("Jazz");
            } else {
                System.out.println(num);
            }
        }
        System.out.print("#############  End Challenge #1   ############# \n");
    }
}

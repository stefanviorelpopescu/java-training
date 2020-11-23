package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int number = 1 ; number <= 100 ; number++)
        {
            boolean Divisible = false;
            if (number % 3 == 0 )
            {
                System.out.print("Fizz");
                Divisible = true;
            }
            if ( number % 5 == 0)
            {
                System.out.print("Buzz");
                Divisible = true;
            }
            if (number % 7 == 0)
            {
                System.out.print("Rizz");
                Divisible = true;
            }
            if (number % 11 == 0)
            {
                System.out.print("Jazz");
                Divisible = true;
            }
            if (!Divisible)
            {
                System.out.print(number);
            }
            System.out.print(" ");
        }
    }
}

package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args)
    {
        int i;
        for (i = 1; i <= 100; i++)
        {
            if (i % 3 == 0)
             System.out.println("Fizz");


            else
                {
                if (i % 5 == 0)
                System.out.println("Buzz");

                }

                    if (i % 15 == 0)
                    System.out.println("FizzBuzz");


                    if (i % 7 == 0)
                     System.out.println("Rizz");


                    if ( i % 11 == 0)
                    System.out.println("Jazz");


                    else System.out.println(i);

        }
    }
}




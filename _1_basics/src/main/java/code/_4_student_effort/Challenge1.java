package code._4_student_effort;

public class  Challenge1 {
    public static void main(String[] args){
        for(int number = 1; number <= 100; number++){
            if(number % 3 == 0)
                System.out.println("Fizz");
            else if(number % 5 == 0)
                System.out.println("Buzz");
            else if(number % 7 == 0)
                System.out.println("Rizz");
            else if(number % 11 == 0)
                System.out.println("Jazz");
            else System.out.println(number);
        }
    }

}

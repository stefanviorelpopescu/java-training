package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args){

        int i;
        boolean divide;

        for(i = 1 ; i<= 100 ; i++) {
            divide = true;
            if (i % 3 == 0) {
                System.out.print("Fizz");
                divide = false;
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
                divide = false;
            }
            if (i % 7 == 0) {
                System.out.print("Rizz");
                divide = false;
            }
            if (i % 11 == 0) {
                System.out.print("Jazz");
                divide = false;
            }
            if(divide){
                System.out.print(i);
            }
            System.out.println(" ");
        }

    }
}

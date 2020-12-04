package code._4_student_effort;

public class FizzBuzzHW {
    public FizzBuzzHW() {
        for (int i = 1; i <= 100; i++) {
            System.out.print(divisibleCheck(i)+",");
        }
    }

    private String  divisibleCheck(int i) {
        boolean isDivisible = false;
        String string="";

        if( i % 3 == 0 ){
            string += "Fizz";
            isDivisible = true;
        }
        if( i % 5 == 0 ){
            string += "Buzz";
            isDivisible = true;
        }
        if ( i % 7 == 0 ) {
            string += "Rizz";
            isDivisible = true;
        }
        if ( i % 11 == 0 ) {
            string += "Jazz";
            isDivisible = true;
        }
        if ( isDivisible )
            return string;
        return (string+=i);
    }
}

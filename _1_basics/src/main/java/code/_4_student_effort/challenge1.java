package code._4_student_effort;

public class challenge1 {
    public static void main(String[] args) {
        System.out.println("Challenge 1");

        for (int i = 1; i <= 100; i++) {
            String s = "";
            int match = 0;

            // I interpreted the challenge text that the multiples had a priority order, so
            // despite the fact that 21 is a multiple of 3 I should only print "Rizz" and not concatenate
            // same with 11 and, 3 and 5 being of least priority

            if (i % 7 == 0) {
                s += "Rizz";
                match = 1;
            } else if (i % 11 == 0) {
                s += "Jazz";
                match = 1;
            } else {
                if (i % 3 == 0) {
                    s += "Fizz";
                    match = 1;
                }
                if (i % 5 == 0) {
                    s += "Buzz";
                    match = 1;
                }
            }


            if (match == 0) {
                System.out.print(i + ", ");
            } else {
                System.out.print(s + ", ");
            }

        }
    }
}

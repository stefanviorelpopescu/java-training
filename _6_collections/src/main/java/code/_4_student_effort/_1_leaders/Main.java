package code._4_student_effort._1_leaders;

import java.util.List;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "----Code Challenge 1----" + ANSI_RESET );

        List<Integer> numbers = List.of(4, 37, 15, 29, 20, 9, 14, 28, 5, 10, 16);

        System.out.print(ANSI_RED + "List of leaders: " + ANSI_RESET );
        for (int i = 0; i < numbers.size(); i++) {
            boolean check = true;
            for (int j = i+1; j < numbers.size(); j++ )
            {
                if (numbers.get(i) < numbers.get(j)) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.print(numbers.get(i) + " ");
            }
        }
    }
}
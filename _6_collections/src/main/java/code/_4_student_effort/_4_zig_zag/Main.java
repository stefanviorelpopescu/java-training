package code._4_student_effort._4_zig_zag;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "----Code Challenge 4----" + ANSI_RESET );

        List<Integer> originalNumbers = List.of(4, 37, 42, 29, 20, 9, 14, 28, 5, 10, 16);
        List<Integer> zigZagNumbers = new ArrayList<>(originalNumbers);

        boolean greater = true;
        for (int i = 0; i < zigZagNumbers.size() - 1; i ++) {

                if (!greater) {
                    if (zigZagNumbers.get(i) < zigZagNumbers.get(i+1)) {
                        Collections.swap(zigZagNumbers, i, i+1);
                    }
                    greater = true;
                }
                else {
                    if (zigZagNumbers.get(i) > zigZagNumbers.get(i+1)) {
                        Collections.swap(zigZagNumbers, i, i+1);
                    }
                    greater = false;
                }
            }


        System.out.print(ANSI_RED + "Original Numbers: " + ANSI_RESET );
        System.out.println(originalNumbers);
        System.out.print(ANSI_RED + "Zig Zag Numbers: " + ANSI_RESET );
        System.out.println(zigZagNumbers);
    }
}

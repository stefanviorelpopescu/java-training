package code._4_student_effort.CC4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZigZag {

    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(4, 3, 7, 8, 6, 2, 1));
        Collections.sort(input);
        if (input.size() > 2) {
            for (int i = 2; i < input.size(); i += 2) {
                Collections.swap(input, i, i - 1);
            }
        }
        input.forEach(System.out::print);
    }
}





package code._4_student_effort.challange1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Leaders {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 5, 9, 2, 4, 8, 7, 6);

        findLeaders(arr);
    }

    private static void findLeaders(List<Integer> arr){
        Collections.reverse(arr);
        int maxNumber = 0;
        for (Integer cursor : arr) {
            if(cursor > maxNumber){
                System.out.println(cursor);
                maxNumber = cursor;
            }
        }
    }
}

package code._4_student_effort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Leaders {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 5, 9, 2, 4, 8, 7, 6); //9,8,7,6 are leaders
        findLeaders(arr);
    }

    private static void findLeaders(List<Integer> arr) {
        Collections.reverse(arr);
        int max = 0;
        for(Integer cursor : arr){
            if(cursor>max){
                System.out.println(cursor);
                max=cursor;
            }
        }
    }

}

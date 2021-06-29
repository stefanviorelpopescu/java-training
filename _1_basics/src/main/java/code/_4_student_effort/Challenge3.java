package code._4_student_effort;

import java.util.Arrays;

public class Challenge3 {

    public static void run(){
        int[]arr={3,2,-3,-2,5,0,-5,5,-5};
        int sum=0;
        int count=0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==sum)
                    count++;
            }
        } //it shows all possible pairs, not completely correct


        System.out.println(count);

    }
}

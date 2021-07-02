package code._4_student_effort;

import java.util.ArrayList;

public class pairOfTwo {
    public static int run(ArrayList<Integer> N){
        int noPairs = 0;
        Integer I = 0;
        Integer i = 0;
        while (I <  N.size()){
            i = N.get(I);
            if (N.indexOf(-(i)) != -1 && N.indexOf(-(i)) != I){
                noPairs++;
                N.remove(N.indexOf(-(i)));
                N.remove(i);
            }
            else
                I++;            
        }
        return noPairs;
    }
}

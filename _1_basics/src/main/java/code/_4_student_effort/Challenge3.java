package code._4_student_effort;

import java.util.Arrays;

public class Challenge3 {
    public static void pairof2(int[] n) {
        int cnt = 0;
        int i, j;
        for (i = 0; i < n.length; i++) {
            for (j = 0; j < n.length; j++) {
                if (n[i] == -n[j]) {
                    cnt++;

                }
            }
        }
            //problema e cand dam de zero pe traseu

            int zero_cnt = 0;
            for (i = 0; i < n.length; i++) {
                if (n[i] == 0){
                    zero_cnt++;
                }
            }

            System.out.println("Numarul de perechi duble este =" + ((cnt - zero_cnt) / 4));


    }
}

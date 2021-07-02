package code._4_student_effort;

public class Challenge4 {
    public static void pairof3(int[]n){
        int cnt=0;
        int i,j,k;
        for(i=0;i< n.length;i++){
            for(j=0;j<n.length;j++){
                for(k=0;k<n.length;k++) {
                    if (n[i] +n[j]==n[k]||n[j]+n[k]==n[i]||n[i]+n[k]==n[j])
                        cnt++;
                }
            }
        }
        int zero_cnt = 0;
        for (i = 0; i < n.length; i++) {
            if (n[i] == 0){
                zero_cnt++;
            }
        }

        System.out.println("Numarul de perechi triple este="+(cnt-zero_cnt)/8);
        //aceiasi problema, cand dam de zero pe traseu
    }

}

package code._4_student_effort.challange4;

public class PairOf3 {
    public static int[] scoateDinArray(int[] v, int nr) {
        int[] res = new int[v.length - 1];
        for (int i = 0; i < v.length; i++) {
            if (v[i] == nr) {
                for (int m = 0; m < i; m++) {
                    res[m] = v[m];
                }
                for (int m = i + 1; m < v.length; m++) {
                    int k = m - 1;
                    res[k] = v[m];
                }
            }
        }
        return res;
    }

    public static int perechi(int[] v) {
        int perechi = 0;

        for (int i = 0; i < v.length; i++) {
            for (int j = 1; j < v.length; j++) {
                for (int l = 2; l < v.length; l++){
                    if ((v[i] + v[j]+ v[l] )== 0 && (i!=j) && (i!=l) && (j!=l)) {
                        perechi++;
                        int[] rez1 = scoateDinArray(v, v[i]);
                        int[] rez2 = scoateDinArray(rez1, v[j]);
                        int[] rez3 = scoateDinArray(rez2, v[l]);
                        v = rez3;
                        i--;
                        break;
                    }
                }

            }
        }

        return perechi;
    }

    public static void main(String[] args) {

        int[] p1 = new int[]{-1,-1,-1,2};
        int[] p2 = new int[]{1,2,-4,0,0};
        System.out.println(perechi(p1));
        System.out.println(perechi(p2));

    }
}

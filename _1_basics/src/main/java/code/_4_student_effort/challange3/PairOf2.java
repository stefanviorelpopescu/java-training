package code._4_student_effort.challange3;

public class PairOf2 {
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
                if (v[i] + v[j] == 0 && i != j) {
                    perechi++;
                    int[] rez1 = scoateDinArray(v, v[i]);
                    int[] rez2 = scoateDinArray(rez1, v[j]);
                    v = rez2;
                    i--;
                    break;
                }
            }
        }

        return perechi;
    }

    public static void main(String[] args) {

        int[] p1 = new int[]{3, 2, -3, -2, 3, 0};
        int[] p2 = new int[]{5, 9, -5, 7, -5};
        int[] p3 = new int[]{1, 1, 0, -1, -1};
        System.out.println(perechi(p1));
        System.out.println(perechi(p2));
        System.out.println(perechi(p3));
    }
}

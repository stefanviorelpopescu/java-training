package code._4_student_effort;

public class Challenge3 {
    public static int run(int a[]){
        int k=0;
        for(int i=0; i<a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] != 0 && a[i] + a[j] == 0) {
                    k++;
                    a[j] = 0;
                    break;
                }
            }
        }
        return k;
    }
}

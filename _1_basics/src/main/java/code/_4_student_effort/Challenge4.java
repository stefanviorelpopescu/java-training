package code._4_student_effort;

public class Challenge4 {
    public static int run(int a[]){
        int s=0;
        for(int i=0; i<a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                for (int k = j + 1; k < a.length; k++) {
                    if (a[i] != 0 && a[j] != 0 && a[k] != 0 && a[i] + a[j] + a[k] == 0) {
                        s++;
                        a[j] = 0;
                        a[k] = 0;
                        break;
                    }
                }
            }
        }
        return s;
    }
}

package code._4_student_effort.challenge2;

public class main {
    public static void main(String[] args) {
        triangle(10);
    }

    private static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            int sum = 1;
            for (int j = 1; j <= i; j++ ){
                System.out.print(sum + " ");
                sum = sum * (i - j) / j;
            }
            System.out.println();
        }
    }
}

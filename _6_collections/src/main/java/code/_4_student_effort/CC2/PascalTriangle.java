package code._4_student_effort.CC2;

public class PascalTriangle {
    public static void main(String[] args) {
        int n=10;
                createPascalTriangle(n);
    }

    private static void createPascalTriangle(int n) {
        for(int row = 1; row <= n; row++) {
            int point = 1;

            for(int j=1; j<=row; j++) {
                System.out.print(point + " ");
                point = point * (row - j) / j;
            }

            System.out.println();
        }
    }
}

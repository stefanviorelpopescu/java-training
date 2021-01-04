package code._4_student_effort.CC6;

public class MatrixSpiral {
    static void matrixSpiralPrint(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;


        while (k < m && l < n) {

            for (i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;

            for (i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;

            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }

            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }

    public static void main(String[] args)
    {
        int R = 4;
        int C = 4;
        int a[][] = { { 1, 2, 3, 4},
                      { 12, 13, 14, 5},
                      { 11, 16, 15, 6 },
                      { 10, 9, 8, 7}};

        matrixSpiralPrint(R, C, a);
    }
}

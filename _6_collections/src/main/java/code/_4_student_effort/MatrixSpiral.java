package code._4_student_effort;

public class MatrixSpiral {

    private static void spiralPrint(int m, int n, int[][] a) {

        int k = 0, l = 0;
        /*
        k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        */

        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (int i = l; i < n; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;

            // Print the last column from the remaining columns
            for (int i = k; i < m; ++i) {
                System.out.print(a[i][n - 1] + " ");
            }
            n--;

            // Print the last row from the remaining rows */
            if (k < m) {
                for (int i = n - 1; i >= l; --i) {
                    System.out.print(a[m - 1][i] + " ");
                }
                m--;
            }

            // Print the first column from the remaining columns
            if (l < n) {
                for (int i = m - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
                }
                l++;
            }
        }
    }

    public static void main(String[] args) {

        int noOfLines = 4; // in our case noOfLines== noOfColumns
        int noOfColumns = 4;
        int matrix[][] = { {1,2,3,4}, {12,13,14,5}, {11,16,15,6}, {10,9,8,7} };

        spiralPrint(noOfLines,noOfColumns,matrix);

    }


}

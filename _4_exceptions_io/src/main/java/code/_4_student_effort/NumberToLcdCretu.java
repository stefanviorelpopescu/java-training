package code._4_student_effort;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class NumberToLcdCretu {
    protected static void draw_number(int numbertodraw,String[][] layout,int m, int n)  {

        switch (numbertodraw) {
            case 1:
                firstrightverticallines(layout,m,n);
                secondrightverticallines(layout,m,n);
                break;
            case 2:
                firsthorizontalline(layout,n);
                firstrightverticallines(layout,m,n);
                middlehorizontalline(layout,m,n);
                secondleftverticallines(layout,m);
                lasthorizontalline(layout,m,n);
                break;
            case 3:
                firsthorizontalline(layout,n);
                firstrightverticallines(layout,m,n);
                middlehorizontalline(layout,m,n);
                secondrightverticallines(layout,m,n);
                lasthorizontalline(layout,m,n);
                break;
            case 4:
                firstleftverticallines(layout,m);
                middlehorizontalline(layout,m,n);
                firstrightverticallines(layout,m,n);
                secondrightverticallines(layout,m,n);
                break;
            case 5:
                firsthorizontalline(layout,n);
                firstleftverticallines(layout,m);
                middlehorizontalline(layout,m,n);
                secondrightverticallines(layout,m,n);
                lasthorizontalline(layout,m,n);
                break;
            case 6:
                firsthorizontalline(layout,n);
                firstleftverticallines(layout,m);
                middlehorizontalline(layout,m,n);
                secondleftverticallines(layout,m);
                secondrightverticallines(layout,m,n);
                lasthorizontalline(layout,m,n);
                break;
            case 7:
                firsthorizontalline(layout,n);
                firstrightverticallines(layout,m,n);
                secondrightverticallines(layout,m,n);
                break;
            case 8:
                firsthorizontalline(layout,n);
                firstleftverticallines(layout,m);
                middlehorizontalline(layout,m,n);
                firstrightverticallines(layout,m,n);
                secondleftverticallines(layout,m);
                secondrightverticallines(layout,m,n);
                lasthorizontalline(layout,m,n);
                break;
            case 9:
                firsthorizontalline(layout,n);
                firstleftverticallines(layout,m);
                middlehorizontalline(layout,m,n);
                firstrightverticallines(layout,m,n);
                secondrightverticallines(layout,m,n);
                lasthorizontalline(layout,m,n);
                break;

        }


    }
    protected static void initialise(String [][]t, int m, int n)
    {
        for(int i=0;i<m;i++)
            for(int j=0;j<n;j++)
                t[i][j]=" ";
    }

    private static void firsthorizontalline(String[][] layout, int n) {
        int len=n/2;
        for(int i=1;i<=len+1;i++)
            layout[0][i]="_";
    }
    private static void middlehorizontalline(String[][] layout, int m,int n) {
        int middle_vert=m/2;
        for(int i=1;i<=n-2;i++)
            layout[middle_vert][i]="_";
    }
    private static void lasthorizontalline(String[][] layout, int m,int n) {
        int len=n/2;
        for(int i=1;i<=len+1;i++)
            layout[m-1][i]="_";
    }
    private static void firstrightverticallines(String[][] layout,int m, int n)
    {
        int len=m/2;
        for(int i=1;i<len+1;i++)
            layout[i][n-1]="|";
    }
    private static void secondrightverticallines(String[][] layout, int m, int n) {
        int len=m/2;
        for(int i=len+1;i<m;i++)
            layout[i][n-1]="|";
    }
    private static void firstleftverticallines(String[][] layout,int m)
    {
        int len=m/2;
        for(int i=1;i<len+1;i++)
            layout[i][0]="|";
    }
    private static void secondleftverticallines(String[][] layout, int m) {
        int len=m/2;
        for(int i=len+1;i<m;i++)
            layout[i][0]="|";
    }
    private static void dispayMatrixLine(BufferedWriter writer, String[][] matrix, int line, int linesize) throws IOException {
        for(int i=0;i<linesize;i++)
        {
//            System.out.print((matrix[line][i]));
            writer.write(matrix[line][i]);
        }
//
        writer.write(" ");
        //System.out.print(" ");

    }

    protected static void writeInFile(List<String[][]> format_number, int m, int n) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("_4_exceptions_io\\_test_files\\out\\out.txt"))) {
            for (int i = 0; i < m; i++) {
                for (String[][] number_show : format_number) {
                    dispayMatrixLine(writer, number_show, i, n);
                }


                //System.out.println();
                writer.write("\n");

            }
        }
    }
}

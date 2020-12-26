package code._4_student_effort.pascal_triangle;


import java.util.*;

public class triangle {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("How many rows of pascal triangle do you want? (minimum 2 cuz its a triangle duhhh");
        int rows = scanner.nextInt();
        scanner.nextLine();
        int coeficient = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    coeficient = 1;
                else
                    coeficient = coeficient * (i - j + 1) / j;
                System.out.print(coeficient + " ");
            }
            System.out.println();
        }
    }
}

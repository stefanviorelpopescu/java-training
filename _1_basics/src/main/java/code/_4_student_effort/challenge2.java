package code._4_student_effort;

import java.util.Scanner;

public class challenge2 {

    // pretty similar with challenge 1, nothing in particular needing mention

    private static String compute(int num) {
        String s = "";
        int match = 0;
        char[] cifre = String.valueOf(num).toCharArray();

        if (num % 3 == 0) {
            s += "Foo";
            match = 1;
        }
        if (num % 5 == 0) {
            s += "Bar";
            match = 1;
        }
        if (num % 7 == 0) {
            s += "Qix";
            match = 1;
        }

        for(char cifra: cifre) {
            if (cifra == '3') {
                s += "Foo";
                match = 1;
            }
            else if (cifra == '5') {
                s += "Bar";
                match = 1;
            }
            else if (cifra == '7') {
                s += "Qix";
                match = 1;
            }
        }

        if (match == 0) {
            return String.valueOf(num);
        } else {
            return s;
        }
    }

    private static String compute2(int num) {
        String s = "";
        int match = 0;
        char[] cifre = String.valueOf(num).toCharArray();

        if (num % 3 == 0) {
            s += "Foo";
            match = 1;
        }
        if (num % 5 == 0) {
            s += "Bar";
            match = 1;
        }
        if (num % 7 == 0) {
            s += "Qix";
            match = 1;
        }

        for(char cifra: cifre) {
            if (cifra == '3')
                s += "Foo";
            else if (cifra == '5')
                s += "Bar";
            else if (cifra == '7')
                s += "Qix";
            else if(cifra == '0')
                s += "*";
            else if(match == 0)
                s += cifra;
        }

        return s;
    }

    public static void main(String[] args) {
        System.out.println("Challenge 2");
        System.out.print("Type a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.print("Stage 1: ");
        System.out.println(compute(n));

        System.out.print("Stage 2: ");
        System.out.println(compute2(n));
    }
}

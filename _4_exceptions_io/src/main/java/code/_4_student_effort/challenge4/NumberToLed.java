package code._4_student_effort.challenge4;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class NumberToLed {

    public static void main(String[] args) {
        try {
            String input_file = "_4_exceptions_io\\_test_files\\in\\input_number.txt";
            String out_file = "_4_exceptions_io\\_test_files\\out\\output_number.txt";

            char[] numbers;

            try (Scanner in = new Scanner(new BufferedReader(new FileReader(input_file)))) {

                String row = in.next();

                numbers = row.toCharArray();
            }

            try {
                try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(out_file))) {
                    // row 1
                    for (Character number : numbers) {
                        if (!(number.equals('1') || number.equals('4'))) {
                            bufferedWriter.write(" _ ");
                        } else {
                            bufferedWriter.write("   ");
                        }
                        bufferedWriter.write(" ");
                    }
                    bufferedWriter.write("\n");

                    // row 2
                    for (Character number : numbers) {
                        if (number.equals('1') || number.equals('7')) {
                            bufferedWriter.write("  |");
                        }
                        if (number.equals('2') || number.equals('3')) {
                            bufferedWriter.write(" _|");
                        }
                        if (number.equals('4') || number.equals('8') || number.equals('9')) {
                            bufferedWriter.write("|_|");
                        }
                        if (number.equals('0')) {
                            bufferedWriter.write("| |");
                        }
                        if (number.equals('5') || number.equals('6')) {
                            bufferedWriter.write("|_ ");
                        }
                        bufferedWriter.write(" ");
                    }
                    bufferedWriter.write("\n");

                    // row 3
                    for (Character number : numbers) {
                        if (number.equals('1') || number.equals('7')) {
                            bufferedWriter.write("  |");
                        }
                        if (number.equals('3') || number.equals('5') || number.equals('9')) {
                            bufferedWriter.write(" _|");
                        }
                        if (number.equals('4')) {
                            bufferedWriter.write("|  ");
                        }
                        if (number.equals('0') || number.equals('6') || number.equals('8')) {
                            bufferedWriter.write("|_|");
                        }
                        if (number.equals('2')) {
                            bufferedWriter.write("|_ ");
                        }
                        bufferedWriter.write(" ");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
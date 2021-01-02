package code._4_student_effort.challenge4;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static final String INPUT_FILE = "_4_exceptions_io\\_test_files\\in\\input_number.txt";
    private static final String OUTPUT_FILE = "_4_exceptions_io\\_test_files\\out\\output_number.txt";

    public static void main(String[] args) {
        String[] number = readList(INPUT_FILE);
        for (String num : number) {
            writeInFile(getNumberRepresentation(num), num.length());
        }
    }

    private static void writeInFile(int[][][] chars, int size) {
        try {
            FileWriter myWriter = new FileWriter(OUTPUT_FILE);
            for (int j = 0; j < 3; ++j) {
                for (int i = 0; i < size; ++i) {
                    for (int k = 0; k < 3; ++k) {
                        if (chars[i][j][k] == 1)
                            if (k == 1) {
                                myWriter.write("_");
                            } else {
                                myWriter.write("|");
                        } else {
                            myWriter.write(" ");
                        }
                    }
                    myWriter.write(" ");
                }
                myWriter.write("\n");
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // preluat din rezolvare
    private static int[][][] getNumberRepresentation(String number) {
        int numberOfChars = number.length();
        int[][][] chars = new int[numberOfChars][3][3];
        int[][] one = {{0, 0, 0}, {0, 0, 1}, {0, 0, 1}};
        int[][] two = {{0, 1, 0}, {0, 1, 1}, {1, 1, 0}};
        int[][] three = {{0, 1, 0}, {0, 1, 1}, {0, 1, 1}};
        int[][] four = {{0, 0, 0}, {1, 1, 1}, {0, 0, 1}};
        int[][] five = {{0, 1, 0}, {1, 1, 0}, {0, 1, 1}};
        int[][] six = {{0, 1, 0}, {1, 1, 0}, {1, 1, 1}};
        int[][] seven = {{0, 1, 0}, {0, 0, 1}, {0, 0, 1}};
        int[][] eight = {{0, 1, 0}, {1, 1, 1}, {1, 1, 1}};
        int[][] nine = {{0, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        int[][] zero = {{0, 1, 0}, {1, 0, 1}, {1, 1, 1}};

        for (int i = 0; i < numberOfChars; i++) {
            if (number.charAt(i) == '1') chars[i] = one;
            else if (number.charAt(i) == '2') chars[i] = two;
            else if (number.charAt(i) == '3') chars[i] = three;
            else if (number.charAt(i) == '4') chars[i] = four;
            else if (number.charAt(i) == '5') chars[i] = five;
            else if (number.charAt(i) == '6') chars[i] = six;
            else if (number.charAt(i) == '7') chars[i] = seven;
            else if (number.charAt(i) == '8') chars[i] = eight;
            else if (number.charAt(i) == '9') chars[i] = nine;
            else if (number.charAt(i) == '0') chars[i] = zero;
            else chars[i] = four;
        }
        return chars;
    }

    public static String[] readList(String filename) {
        String[] words = new String[0];
        int wordCount = 0;
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(filename)))) {
            while (s.hasNext()) {
                String word = s.next();
                words = Arrays.copyOf(words, words.length + 1);
                words[wordCount++] = word;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return words;
    }
}

package code._4_student_effort;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class NumberToLcd {
    private static final String inputFile = "_4_exceptions_io\\_test_files\\in\\input_number.txt";
    private static final String outputFile = "_4_exceptions_io\\_test_files\\out\\output_number.txt";
    private static final int width = 3;
    private static final int height = 5;

    public static void main(String[] args) throws IOException {
        List<String> numberFromFile = readFile();
        writeInFile(numberRepresentation(String.valueOf(numberFromFile.get(0))), String.valueOf(numberFromFile.get(0)).length());
    }

    public static List<String> readFile() throws IOException {
        String line;
        List<String> lines = new ArrayList<>();
        BufferedReader inputFileNumberReader = new BufferedReader(new FileReader(inputFile));
        while ((line = inputFileNumberReader.readLine()) != null) {
            lines.add(line);
        }
        inputFileNumberReader.close();
        return lines;
    }

    public static void writeInFile(int[][][] charactersNumbersArray, int numberOfCharacters) throws IOException {
        BufferedWriter writeLcdNumber = new BufferedWriter(new FileWriter(outputFile));
        try {
            // If the height is not odd the number is not represented in readable manner
            if(height%2 != 0) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < numberOfCharacters; j++) {
                        for (int k = 0; k < 3; k++) {
                            if (charactersNumbersArray[j][i][k] == 1) {
                                if (k == 1) {
                                    for (int m = 0; m < width; m++) {
                                        writeLcdNumber.write("_");
                                    }
                                } else {
                                    writeLcdNumber.write("|");
                                }
                            } else {
                                writeLcdNumber.write(" ");
                            }
                        }
                        writeLcdNumber.write(" ");
                    }
                    writeLcdNumber.write("\n");
                    if (i < 2) {
                        for (int p = 0; p < (height / 2 - 1); p++) {
                            for (int j = 0; j < numberOfCharacters; j++) {
                                if (charactersNumbersArray[j][i + 1][0] == 1) {
                                    writeLcdNumber.write("|");
                                } else {
                                    writeLcdNumber.write(" ");
                                }
                                for (int m = 0; m < width; m++) {
                                    writeLcdNumber.write(" ");
                                }
                                if (charactersNumbersArray[j][i + 1][2] == 1) {
                                    writeLcdNumber.write("|");
                                } else {
                                    writeLcdNumber.write(" ");
                                }
                                writeLcdNumber.write(" ");
                            }
                            writeLcdNumber.write("\n");
                        }

                    }
                }
                writeLcdNumber.close();
            } else {
                throw new IllegalArgumentException("Height must be odd!");
            }
        } catch (IOException e){
            writeLcdNumber.close();
            e.printStackTrace();
        }
    }

    public static int[][][] numberRepresentation(String number) {
        int numberOfCharacters = number.length();
        int[][][] charactersNumbersArray = new int[numberOfCharacters][3][3];
        //  _      _   _        _   _   _   _   _   _
        // | | |   _|  _|  |_| |_  |_    | |_| |_| |_
        // |_| |  |_   _|    |  _| |_|   | |_|  _| |_
        // Considering that the representation of a number is a 3x3 matrix
        int[][] zero = {{0, 1, 0},
                {1, 0, 1},
                {1, 1, 1}};
        int[][] one = {{0, 0, 0},
                {0, 0, 1},
                {0, 0, 1}};
        int[][] two = {{0, 1, 0},
                {0, 1, 1},
                {1, 1, 0}};
        int[][] three = {{0, 1, 0},
                {0, 1, 1},
                {0, 1, 1}};
        int[][] four = {{0, 0, 0},
                {1, 1, 1},
                {0, 0, 1}};
        int[][] five = {{0, 1, 0},
                {1, 1, 0},
                {0, 1, 1}};
        int[][] six = {{0, 1, 0},
                {1, 1, 0},
                {1, 1, 1}};
        int[][] seven = {{0, 1, 0},
                {0, 0, 1},
                {0, 0, 1}};
        int[][] eight = {{0, 1, 0},
                {1, 1, 1},
                {1, 1, 1}};
        int[][] nine = {{0, 1, 0},
                {1, 1, 1},
                {0, 1, 1}};
        int[][] error = {{0, 1, 0},
                {1, 1, 0},
                {1, 1, 0}};
        for (int i = 0; i < numberOfCharacters; i++) {

            if (number.charAt(i) == '0') {
                charactersNumbersArray[i] = zero;
            } else if (number.charAt(i) == '1') {
                charactersNumbersArray[i] = one;
            } else if (number.charAt(i) == '2') {
                charactersNumbersArray[i] = two;
            } else if (number.charAt(i) == '3') {
                charactersNumbersArray[i] = three;
            } else if (number.charAt(i) == '4') {
                charactersNumbersArray[i] = four;
            } else if (number.charAt(i) == '5') {
                charactersNumbersArray[i] = five;
            } else if (number.charAt(i) == '6') {
                charactersNumbersArray[i] = six;
            } else if (number.charAt(i) == '7') {
                charactersNumbersArray[i] = seven;
            } else if (number.charAt(i) == '8') {
                charactersNumbersArray[i] = eight;
            } else if (number.charAt(i) == '9') {
                charactersNumbersArray[i] = nine;
            } else {
                charactersNumbersArray[i] = error;
            }
        }
        return charactersNumbersArray;
    }
}

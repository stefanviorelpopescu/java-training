package code._4_student_effort.challenge4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class NumberToLed {

    public static void main(String[] args) {
        try {
            String input_file = "_4_exceptions_io\\_test_files\\in\\input_number.txt";
            String out_file = "_4_exceptions_io\\_test_files\\out\\output_number.txt";

            Scanner in = null;
            try {
                in = new Scanner(new BufferedReader(new FileReader(input_file)));

                String number = in.next();
                char[] indiv_numbers = number.toCharArray();

                int width = Integer.parseInt(String.valueOf(indiv_numbers[0]));
                int height = Integer.parseInt(String.valueOf(indiv_numbers[1]));

                int numberToBeDrawn;
                
            } finally {
                if (in != null)
                    in.close();
            }
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

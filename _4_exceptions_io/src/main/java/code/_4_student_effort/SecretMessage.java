package code._4_student_effort;

import java.io.*;
import java.util.Scanner;

public class SecretMessage {
    protected static void discover() throws IOException {
        String message = " ";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("_4_exceptions_io\\_test_files\\out\\message.txt"));
             Scanner scanner = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\message.txt")))) {
            scanner.useDelimiter(" ");
            while (scanner.hasNext()) {
                char[] letters_array = scanner.next().toCharArray();
                for (char letter : letters_array) {
                    if (Character.isUpperCase(letter)) {
                        if (letter == 'X') {
                            message += " ";
                        } else {
                            message += letter;
                        }
                    }
                }
            }
            writer.write(message);
        }
    }
}








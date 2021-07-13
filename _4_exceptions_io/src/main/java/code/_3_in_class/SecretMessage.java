package code._3_in_class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class SecretMessage {
    //_4_exceptions_io
    private static final String MESSAGE_FILE = "_test_files\\in\\message.txt";

    public static void main(String[] args) {
        try {
            System.out.println(getSecretMessage(readWords(MESSAGE_FILE)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String getSecretMessage(String words) {
        String secretMessage = "";
        char[] letters = words.toCharArray();
            for (char letter : letters) {
                if (Character.isUpperCase(letter)) {
                    if (letter == 'X') {
                        secretMessage += " ";
                    } else {
                        secretMessage += letter;
                    }
                }
            }
        return secretMessage;
    }


    private static String readWords(String fileName) throws FileNotFoundException {
        String words = "";
        Scanner s = null;
        int wordCount = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            s.useLocale(Locale.US);
            while (s.hasNext()) {
                words += s.next();
            }
        } finally {
            if (s != null)
                s.close();
        }

        return words;
    }
}

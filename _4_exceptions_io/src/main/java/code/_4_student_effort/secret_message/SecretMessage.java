package code._4_student_effort.secret_message;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SecretMessage {

    static String secretMessage="";

    public static void main(String[] args) throws IOException {

        String line;

        BufferedReader bufferedReader = new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\message.txt"));

        while ((line = bufferedReader.readLine()) != null) {
            String[] words = line.split(" ");
            for (String word : words)
                checkCapitalLetter(word);
        }
        System.out.println(secretMessage);
    }

    private static void checkCapitalLetter(String word) {
        char ch;
        for (int i = 0; i < word.length(); i++) {
            ch = word.charAt(i);
            if (Character.isUpperCase(ch)) {
                if (ch == 'X')
                    secretMessage += " ";
                else secretMessage += ch;
            }
        }

    }
}

package code._4_student_effort._2_challengeTwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        String url = "https://raw.githubusercontent.com/miualinionut/java-training/master/_4_exceptions_io/_test_files/in/message.txt";
        System.out.println(read(url));

    }

    public static String read (String url) throws IOException {
        URL url1 = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(url1.openStream()));
        StringBuilder message = new StringBuilder();
        String line;
        char[] allLetters;
        while ((line = in.readLine()) != null) {
            allLetters = line.toCharArray();
            for (char letter : allLetters) {
                if (Character.isUpperCase(letter)) {
                    message.append(letter);
                }
                if (letter == 'X') {
                    message.append(" ");
                }
            }
        }
        in.close();
        return message.toString();
    }
}

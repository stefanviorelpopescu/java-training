package code._4_student_effort._2_secretmessage;

import java.io.FileReader;
import java.io.IOException;

public class Main {
    //Declaration for text output color//
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {
        System.out.println(ANSI_RED + "---- Code Challenge 2 ----" + ANSI_RESET);

        try {
            String secretMessage = read("C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\message.txt");
            System.out.println(secretMessage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private static String read(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);

        StringBuilder upperCharacters = new StringBuilder();
        int c = reader.read();
        while (c != -1) {
            char character = (char) c;
            if (isUpper(c)) {
                if (character == 'X') {
                    character = ' ';
                }
                upperCharacters.append(character);
            }
            c = reader.read();
        }
        reader.close();
        return upperCharacters.toString();
    }

    private static boolean isUpper(int c){
        return ((c >= 65) && (c <= 90));
    }

}

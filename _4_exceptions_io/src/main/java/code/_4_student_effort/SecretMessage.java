package code._4_student_effort;

import java.io.FileReader;
import java.io.IOException;

public class SecretMessage {

    public static void main(String[] args) {

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

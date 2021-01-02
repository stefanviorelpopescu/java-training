package code._4_student_effort.challenge2;

import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static boolean isUpper(int c) {
        return (c >= 65 && c <= 90);
    }

    private static String readCharacters(String filePath) throws IOException {
        FileReader reader = new FileReader(filePath);
        StringBuilder message = new StringBuilder();

        int c = reader.read();
        while (c != -1) {
            char character = (char) c;
            if (isUpper(c)) {
                if (character =='X') {
                    message.append(' ');
                } else {
                    message.append(character);
                }
            }
            c = reader.read();
        }
        reader.close();

        return message.toString();
    }

    public static void main(String[] args) throws IOException {
        try{
            String res = readCharacters("_4_exceptions_io\\_test_files\\in\\message.txt");
            System.out.println(res);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}

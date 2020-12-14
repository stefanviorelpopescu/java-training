package code._4_student_effort.challenge2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class SecretMessage {
    public static void main(String[] args) {
        try {
            int len = 0;
            Scanner in = null;

            String[] full_text = new String[10000];
            String secret_message = "";

            try {
                String fileName = "_4_exceptions_io\\_test_files\\in\\message.txt";
                in = new Scanner(new BufferedReader(new FileReader(fileName)));

                while (in.hasNext()) {
                    full_text[len] = in.next();
                    char[] letters = full_text[len].toCharArray();
                    for(char letter: letters) {
                        if(letter == 'X'){
                            secret_message += " ";
                        } else if(Character.isUpperCase(letter)) {
                            secret_message += letter;
                        }
                    }
                    len++;
                }

                System.out.println(secret_message);
            } finally {
                if(in != null)
                    in.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

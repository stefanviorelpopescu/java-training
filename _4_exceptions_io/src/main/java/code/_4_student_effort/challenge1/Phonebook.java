package code._4_student_effort.challenge1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {
        try {
            String[] names = new String[10000];


            int len = 0;
            int found = 0;
            Scanner in = null;

            try {
                String fileName = "_4_exceptions_io\\_test_files\\in\\phonebook.txt";
                in = new Scanner(new BufferedReader(new FileReader(fileName)));



                while (in.hasNext()) {
                    names[len] = in.next();
                    len++;
                }
            } finally {
                if(in != null)
                    in.close();
            }
            for (int i = 0; i < len; i = i + 2) {
                if (names[i].equals("Abbey") || names[i].equals("Abdul")) {
                    System.out.println(names[i + 1]);
                    found++;
                    if (found == 2)
                        break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    static Map<String, String> phonebook = new HashMap<>();

    public static void main(String[] args) {
        loadPhonebook();


        System.out.println(findPhoneNumber("Abbey"));
        System.out.println(findPhoneNumber("Abdul"));
        System.out.println(findPhoneNumber("Marcel"));
        System.out.println(findPhoneNumber("Kieran"));
    }

    public static void loadPhonebook() {
        try (Scanner s = new Scanner(new BufferedReader(new FileReader("C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\phonebook.txt")))) {

            while (s.hasNextLine()) {
                String line = s.nextLine();
                String[] lineTokens = line.split(" ");
                phonebook.put(lineTokens[0], lineTokens[1]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String findPhoneNumber(String name) {
        if (phonebook.containsKey(name)) {
            return name + " " + phonebook.get(name);
        } else {
            return name + " was not found in the phonebook.";
        }

    }
}


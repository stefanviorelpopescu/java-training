package code._4_student_effort.phonebook;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private static Map<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) throws IOException {


        BufferedReader phonebookReader = new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\phonebook.txt"));
        String row;

        while ((row = phonebookReader.readLine()) != null) {
            phoneBook.put(row.split(" ")[0], row.split(" ")[1]);
        }

        findNumberByName("Abbey");
        findNumberByName("Abdul");
        findNumberByName("Catalin");

    }

    private static void findNumberByName(String name) {
        System.out.println(phoneBook.containsKey(name) ? (name + " " + phoneBook.get(name)) : (name + " is not in phonebook"));
    }

}

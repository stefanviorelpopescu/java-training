package code._4_student_effort.firstchallenge;

import java.awt.desktop.OpenFilesHandler;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Phonebook {

    ArrayList<String> phoneNumbers;
    ArrayList<String> names;

    public Phonebook() {
        phoneNumbers = new ArrayList<>();
        names = new ArrayList<>();
        readPhoneNumbers("phonebook.txt");
    }

    public static void main(String[] args) {
        new Phonebook().testNames();
    }

    public void testNames() {
        String name1 = "Abbey";
        String name2 = "Abdul";
        System.out.println(searchByName(name1));
        System.out.println(searchByName(name2));
    }

    public String searchByName(String name) {
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).equals(name))
                return phoneNumbers.get(i);
        }
        return null;
    }

    public void readPhoneNumbers(String fileName) {
        Scanner scanner;
        try {
            scanner = new Scanner(new FileReader(fileName));
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (scanner.hasNextLine()) {
            String auxLine = scanner.nextLine();
            String[] auxArrWords = auxLine.split(" ");
            names.add(auxArrWords[0]);
            phoneNumbers.add(auxArrWords[1]);
        }
    }
}

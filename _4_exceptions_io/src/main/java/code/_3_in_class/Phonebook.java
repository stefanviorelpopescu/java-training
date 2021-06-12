package code._3_in_class;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Locale;
import java.util.Scanner;

public class Phonebook {
    private static int MAX = 10_000;
    public static void main(String[] args) {
        try {
            String[] wordsInPhoneBook = readPhoneBook("_test_files\\in\\phonebook.txt");
            System.out.println(searchPhoneNumberByName("Abbey", wordsInPhoneBook));
            System.out.println(searchPhoneNumberByName("Abdul", wordsInPhoneBook));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String searchPhoneNumberByName(String name, String[] wordsInPhoneBook) {
        for (int i = 0; i < wordsInPhoneBook.length; i += 2) {
            if (wordsInPhoneBook[i].equals(name)) {
                return wordsInPhoneBook[i + 1];
            }
        }
        return "The number was not found";
    }

    private static String[] readPhoneBook(String fileName) throws FileNotFoundException {
        String[] words = new String[MAX];
        Scanner s = null;
        int wordCount = 0;
        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            s.useLocale(Locale.US);
            while (s.hasNext() && wordCount < MAX) {
                words[wordCount++] = s.next();
            }
        } finally {
            if (s != null)
                s.close();
        }

        String[] appropriateLengthWordsArray = new String[wordCount];
        System.arraycopy(words, 0, appropriateLengthWordsArray, 0, wordCount);
        return appropriateLengthWordsArray;
    }
}

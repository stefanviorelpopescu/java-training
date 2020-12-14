package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {
  private static int MAX_NUMBER = 1_000;

  public static void main(String[] args) {
    //TODO put your code changes in here
    challenge1();
    challenge2();
  }

  private static void challenge2() {
    try {
      String[] text = read("_test_files\\\\in\\\\message.txt");
      System.out.println(secretMessage(text));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  private static String[] read(String fileName) throws FileNotFoundException {
    String[] words = new String[0];
    Scanner s = null;
    int wordCount = 0;
    try {
      s = new Scanner(new BufferedReader(new FileReader(fileName)));
      s.useLocale(Locale.US);
      while (s.hasNext()) {
        words = Arrays.copyOf(words, words.length + 1);
        words[wordCount++] = s.next();
      }
    } finally {
      if (s != null) s.close();
    }

    String[] appropriateLengthWordsArray = new String[wordCount];
    System.arraycopy(words, 0, appropriateLengthWordsArray, 0, wordCount);
    return appropriateLengthWordsArray;
  }

  private static String secretMessage(String[] text) {
    String message = "";

    for (int i = 0; i < text.length; i++) {
      String word = text[i];
      char[] letters = word.toCharArray();
      for (char letter : letters) {
        if (Character.isUpperCase(letter)) {
          if (letter == 'X') {
            message += " ";
          } else {
            message += letter;
          }
        }
      }
    }
    return message;
  }

  private static void challenge1() {
      try {
        String abdul = "Abdul";
        String abbey = "Abbey";

        String[] phoneBook = readPhoneBook("_test_files\\in\\phonebook.txt");
        System.out.println(searchPhoneNumberByName(abbey, phoneBook));
        System.out.println(searchPhoneNumberByName(abdul, phoneBook));
      } catch (FileNotFoundException e) {
        e.printStackTrace();
      }

  }

  private static String searchPhoneNumberByName(String name, String[] wordsInPhoneBook) {
    for (int i = 0; i < MAX_NUMBER; i++) {
      if (wordsInPhoneBook[i].equals(name)) {
        return wordsInPhoneBook[i + 1];
      }
    }
    return "The number was not found";
  }

  private static String[] readPhoneBook(String fileName) throws FileNotFoundException {
    String[] words = new String[MAX_NUMBER];
    Scanner s = null;
    int wordCount = 0;
    try {
      s = new Scanner(new BufferedReader(new FileReader(fileName)));
      s.useLocale(Locale.US);
      while (s.hasNext() && wordCount < MAX_NUMBER) {
        words[wordCount++] = s.next();
      }
    } finally {
      if (s != null) s.close();
    }

    String[] appropriateLengthWordsArray = new String[wordCount];
    System.arraycopy(words, 0, appropriateLengthWordsArray, 0, wordCount);
    return appropriateLengthWordsArray;
  }
}

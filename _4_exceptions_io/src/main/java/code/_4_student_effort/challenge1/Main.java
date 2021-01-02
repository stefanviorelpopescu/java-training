package code._4_student_effort.challenge1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class Main {
  private static HashMap<String, String> phoneBook = new HashMap<>();

  public static void main(String[] args) {
    challenge1();
  }

  private static void challenge1() {
    loadPhoneBook();
    System.out.println(findPhoneNumber("Abbey"));
    System.out.println(findPhoneNumber("Abdul"));
    System.out.println(findPhoneNumber("Abdulah"));
  }

  private static String findPhoneNumber(String name) {
    String phoneNumber = phoneBook.get(name);
    return name + " : " + Objects.requireNonNullElse(phoneNumber, "not found");
  }

  private static void loadPhoneBook() {
    try(Scanner s = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\phonebook.txt")))) {
      s.useDelimiter("\n");
      while (s.hasNext()) {
        String line = s.next();
        String[] lineTokens = line.split(" ");
        phoneBook.put(lineTokens[0], lineTokens[1]);
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}

package code._4_student_effort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    //challenge1();
    //challenge2();
    challenge3();
  }

  public static void challenge1() {
    Map<String, String> phoneBook = new HashMap<>();
    BufferedReader file;
    String[] phone;

    try {
      file = new BufferedReader(new FileReader("_test_files\\in\\phonebook.txt"));
      String line;

      while ((line = file.readLine())!= null) {
        phone = line.split(" ");
        phoneBook.put(phone[0],phone[1]);
      }

      System.out.println(phoneBook.get("Abbey"));
      System.out.println(phoneBook.get("Abdul"));

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void challenge2() {
    FileReader file;
    StringBuilder toShow = new StringBuilder();

    try {
      int c;
      file = new FileReader("_test_files\\in\\message.txt");

      while ( (c=file.read()) != -1 ) {
        if (c >= 65 && c <= 90) {
          if (c == 88) {    // X = 88
            toShow.append(" ");
          } else {
            toShow.append(Character.toChars(c));
          }
        }
      }

    } catch (Exception e) {
      e.printStackTrace();
    }

    System.out.println(toShow);
  }

  public static void challenge3() {

    BufferedReader fileRead;
    BufferedWriter fileWrite;
    String anagram = "listen";

    try {
      fileRead = new BufferedReader(new FileReader("_test_files\\in\\big_list.txt"));
      fileWrite = new BufferedWriter(new FileWriter("_test_files\\in\\output.txt"));
      String line;
      boolean ok;

      while ( (line=fileRead.readLine()) != null) {
        if (line.length() == anagram.length()) {
          ok=true;
          for (int i=0;i<anagram.length();i++) {
            if (line.indexOf(anagram.charAt(i)) == -1) {
              ok = false;
              break;
            }
          }
          if (ok) {
            System.out.println(line);
            fileWrite.write(line + "\n");
          }
        }
      }

      fileRead.close();
      fileWrite.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }
}

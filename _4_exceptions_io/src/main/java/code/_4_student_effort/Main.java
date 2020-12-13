package code._4_student_effort;

import java.io.*;
import java.util.*;

public class Main {

  static Map<String, String> phoneBook = new HashMap<>();
  static Map<String, Integer> words = new HashMap<String, Integer>();
  static Map<String, Integer> topWords = new HashMap<>();


  public static void main(String[] args) {
    //TODO put your code changes in here
    challenge1();
    challenge2();
    challenge3();
    //challenge4();
    challenge5();
  }

  private static void challenge1() {
    loadPhonebook();
    System.out.println(findPhoneNumber("Abbey"));
    System.out.println(findPhoneNumber("Abdul"));
    System.out.println(findPhoneNumber("Abdulah"));
  }

  private static String findPhoneNumber(String name) {
    String phoneNumber = phoneBook.get(name);
    return name + " " + Objects.requireNonNullElse(phoneNumber, "not found");
  }

  private static void loadPhonebook() {

    try (Scanner s = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\phonebook.txt")))) {
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

  static void challenge2() {
    try {
      String upperString = readCharacters("_4_exceptions_io\\_test_files\\in\\message.txt");
      String newUpperString = upperString.replace('X', ' ');
      System.out.println(newUpperString);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private static String readCharacters(String filePath) throws IOException {
    FileReader reader = new FileReader(filePath);

    StringBuilder upperCharacters = new StringBuilder();
    int c = reader.read();
    while (c != -1) {
      char character = (char) c;
      if (isUpper(c)) {
        upperCharacters.append(character);
      }
      c = reader.read();
    }
    reader.close();
    return upperCharacters.toString();
  }

  private static boolean isUpper(int c) {
    return (c >= 65 && c <= 90);
  }

static void challenge3() {

  BufferedReader file;
  BufferedReader fileRead;
  String anagram = "listen";

  try {
    file = new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\big_list.txt"));
    fileRead = new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\big_list.txt"));
    String line;
    boolean ok;

    while ((line = file.readLine()) != null) {
      while ((line = fileRead.readLine()) != null) {
        if (line.length() == anagram.length()) {
          ok = true;
          for (int i = 0; i < anagram.length(); i++) {
            if (line.indexOf(anagram.charAt(i)) == -1) {
              ok = false;
              break;
            }
          }
            if (ok) {
              System.out.println(line);
            }
          }
        }

        fileRead.close();

      }
      }catch(IOException e){
           e.printStackTrace();
      }
  }

    private static void challenge5() {
    try {
      countEachWord("_4_exceptions_io\\_test_files\\in\\a.txt", words);
      System.out.println(words);
    }catch(FileNotFoundException e) {
    e.printStackTrace();
  }

}

  private static void countEachWord(String fileName, Map<String,Integer> words) throws FileNotFoundException{
    Scanner file = new Scanner(new File(fileName));
    while(file.hasNext()){
      String word = file.next();
      Integer count = words.get(word);
      if(count!=null){
        count++;
      }else
      {
        count = 1;
      }
      words.put(word,count);
    }

      file.close();
  }




}
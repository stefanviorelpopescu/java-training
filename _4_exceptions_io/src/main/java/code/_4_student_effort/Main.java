package code._4_student_effort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    //challenge1();
    //challenge2();
    challenge3();
    //challenge4();
      // challenge5();
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

  private static boolean sameChars(String firstString, String secondString) {
      char[] first = firstString.toCharArray();
      char[] second = secondString.toCharArray();

      Arrays.sort(first);
      Arrays.sort(second);

      return Arrays.equals(first,second);
  }

  public static void challenge3() {

    BufferedReader fileRead;
    BufferedWriter fileWrite;
    String anagram = "llisten";

    try {
      fileRead = new BufferedReader(new FileReader("_test_files\\in\\big_list.txt"));
      fileWrite = new BufferedWriter(new FileWriter("_test_files\\in\\output.txt"));
      String line;

      while ( (line=fileRead.readLine()) != null) {
        if (line.length() == anagram.length()) {
          if (sameChars(line, anagram)) {
              System.out.println(line);
          }
        }
      }

      fileRead.close();
      fileWrite.close();

    } catch (Exception e) {
      e.printStackTrace();
    }

  }

  public static void challenge4() {


  }

  public static Map<String, Integer> sortMapByValue(Map<String, Integer> unsortedMap) {

      // 1. Convert map to List of Map
      List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortedMap.entrySet());

      // 2. Sort list with Collections.sort()
      list.sort(new Comparator<Map.Entry<String, Integer>>() {
          @Override
          public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
              return (o2.getValue()).compareTo(o1.getValue());
          }
      });

      // 3. Loop the sort list and put it into a new insertion order Map
      Map<String, Integer> sortedMap = new LinkedHashMap<>();
      for (Map.Entry<String, Integer> entry : list) {
          sortedMap.put(entry.getKey(), entry.getValue());
      }

      return sortedMap;

  }

  public static void challenge5() {

      BufferedReader file;
      String[] stringArray;
      HashMap<String, Integer> map = new HashMap<>();
      int count;

      try {
          file = new BufferedReader(new FileReader("_test_files\\in\\a.txt"));
          String line;

          while ( (line=file.readLine()) != null) {
              // transform all uper charaters into lower characters
              line = line.toLowerCase();


              // split the line into a String array
              stringArray = line.split(" ");
              // go through the array
              for (String i : stringArray) {
                  // remove punctuation
                  i = i.replaceAll("[^a-zA-Z]", "");
                  // check if already exists in map and increment value
                  if (map.containsKey(i)) {
                      count = map.get(i);
                      map.replace(i, ++count);
                  } else {  // put into map
                      map.put(i, 1);
                  }
              }
          }

          count=0;
          Map<String, Integer> sortedMap = sortMapByValue(map);
          for (String word: sortedMap.keySet()) {
              if (count != 10) {
                  int value = map.get(word);
                  System.out.println(word + " appears: " + value);
                  count++;
              } else {
                  break;
              }
          }


      } catch (Exception e) {
          e.printStackTrace();
      }

  }
}

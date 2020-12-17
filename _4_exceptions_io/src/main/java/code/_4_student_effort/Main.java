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

      BufferedReader fileInput;

      try {
          fileInput = new BufferedReader(new FileReader("_test_files\\in\\input_number.txt"));

          String line = fileInput.readLine();
          int numberOfChars = line.length();

          int[][][] chars = new int[numberOfChars][3][3];

          int[][] one = {{0, 0, 0}, {0, 0, 1}, {0, 0, 1}};
          int[][] two = {{0, 1, 0}, {0, 1, 1}, {1, 1, 0}};
          int[][] three = {{0, 1, 0}, {0, 1, 1}, {0, 1, 1}};
          int[][] four = {{0, 0, 0}, {1, 1, 1}, {0, 0, 1}};
          int[][] five = {{0, 1, 0}, {1, 1, 0}, {0, 1, 1}};
          int[][] six = {{0, 1, 0}, {1, 1, 0}, {1, 1, 1}};
          int[][] seven = {{0, 1, 0}, {0, 0, 1}, {0, 0, 1}};
          int[][] eight = {{0, 1, 0}, {1, 1, 1}, {1, 1, 1}};
          int[][] nine = {{0, 1, 0}, {1, 1, 1}, {0, 1, 1}};
          int[][] zero = {{0, 1, 0}, {1, 0, 1}, {1, 1, 1}};

          for (int i = 0; i < numberOfChars; i++) {
              if (line.charAt(i) == '1') chars[i] = one;
              else if (line.charAt(i) == '2') chars[i] = two;
              else if (line.charAt(i) == '3') chars[i] = three;
              else if (line.charAt(i) == '4') chars[i] = four;
              else if (line.charAt(i) == '5') chars[i] = five;
              else if (line.charAt(i) == '6') chars[i] = six;
              else if (line.charAt(i) == '7') chars[i] = seven;
              else if (line.charAt(i) == '8') chars[i] = eight;
              else if (line.charAt(i) == '9') chars[i] = nine;
              else if (line.charAt(i) == '0') chars[i] = zero;
              else chars[i] = four;
          }

          for (int j = 0; j < 3; j++) {
              for (int i = 0; i < numberOfChars; i++) {
                  for (int k = 0; k < 3; k++) {
                      if (chars[i][j][k] == 1) {
                          if (k == 1) System.out.print("_");
                          else System.out.print("|");
                      } else System.out.print(" ");
                  }
                  System.out.print(" ");
              }
              System.out.print("\n");

          }
      }catch (Exception e) {
          e.printStackTrace();
      }
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

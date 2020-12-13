package code._4_student_effort;

import java.io.*;
import java.util.*;

public class Main {
  // Data structure used in challenge 1
  static Map<String, String> phoneBook = new HashMap<>();

  public static void main(String[] args) {
    // Challenge 1
    doChallenge1();

    // Challenge 2
    printChallengeSeparator(2);
    doChallenge2();

    // Challenge 3
    printChallengeSeparator(3);
    doChallenge3();

    // TODO Challenge 4

    // Challenge 5
    printChallengeSeparator(5);
    doChallenge5();
  }

  // Challenge 1 usage in main function
  public static void doChallenge1() {
    loadPhonebook();

    System.out.println(findPhoneNumber("Abbey"));
    System.out.println(findPhoneNumber("Abdul"));
    System.out.println(findPhoneNumber("Abdulah"));
  }

  public static String findPhoneNumber(String name) {
    String phoneNumber = phoneBook.get(name);

//    if (phoneNumber == null) {
//      return "not found";
//    } else {
//      return phoneNumber;
//    }
    return name + " " + Objects.requireNonNullElse(phoneNumber, "not found");
  }

  public static void loadPhonebook() {
    try(Scanner s = new Scanner(new BufferedReader(new FileReader("_test_files\\in\\phonebook.txt")))) {
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

  // Challenge 2 usage in main function
  public static void doChallenge2() {
    try {
      String secretMessage = readCharacters("_test_files\\in\\message.txt");
      System.out.println(secretMessage);
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
        if (character == 'X') character = ' ';
        upperCharacters.append(character);
      }
      c = reader.read();
    }
    reader.close();
    return upperCharacters.toString();
  }

  private static boolean isUpper(int c) {
    return ((c >= 65) && (c <= 90));
  }

  // Challenge 3 usage in main function
  public static void doChallenge3() {
    //List<String> anagrams = findAnagrams("listen", "_test_files\\in\\small_list.txt");
    List<String> anagrams = findAnagrams("listen", "_test_files\\in\\big_list.txt");

    try {
      writeWords(anagrams, "_test_files\\out\\output.txt");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static List<String> readWords(String pathFile) {
    List <String> words = new ArrayList<>();

    try(Scanner s = new Scanner(new BufferedReader(new FileReader(pathFile)))) {
      //s.useDelimiter("\n"); // Default delimiter is \n
      while (s.hasNextLine()) {
        String line = s.nextLine().toLowerCase();
        // It can be used \p{Punct}, which is one of !"#$%&'()*+,-./:;<=>?@[\]^_`{|}~, along
        // with \s which is a whitespace [ \t\n\x0B\f\r]:
        // "let's. your!".split("[\\s\\p{Punct}]+"); > ["let", "s", "your"]
        String[] lineWords = line.split("[\\s\\p{Punct}]+");
        //words.addAll(new ArrayList<String>(Arrays.asList(lineWords)));
        // Fixed
        for (int i = 0; i < lineWords.length; i++) {
          if (!lineWords[i].isEmpty()) words.add(lineWords[i]); //if (lineWords[i].length() != 0)
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return words;
  }

  static public Map<Character, Integer> createCharacterCounterMap(String word) {
    Map<Character, Integer> characterCounterMap = new HashMap<>();

    for(int i = 0; i < word.length(); i++) {
      char character = (char) word.charAt(i);
      if (!characterCounterMap.containsKey(character)) {
        characterCounterMap.put(character, 1);
      } else {
        characterCounterMap.put(character, characterCounterMap.get(character)+1);
      }
    }

    return characterCounterMap;
  }

  static public List<String> findAnagrams(String word, String filePath) {
    List<String> words = readWords(filePath);
    Map<Character, Integer> wordCharacterCounters = createCharacterCounterMap(word);

    List<String> anagrams = new ArrayList<>();

    // [Debug]
    //System.out.println("word: ");
    //printMap(wordCharacterCounters);

    for (int i = 0; i < words.size(); i++) {
      Map<Character, Integer> anagramCharCounters = createCharacterCounterMap(words.get(i));

      if (checkCharacterCounters(wordCharacterCounters, anagramCharCounters)) {
          anagrams.add(words.get(i));
      }
    }
    return anagrams;
  }

  static public boolean checkCharacterCounters(Map<Character, Integer> word, Map<Character, Integer> anagram) {
    if (word.size() != anagram.size()) return false;

    for (Map.Entry mapElement : word.entrySet()) {
      if (mapElement.getValue() != anagram.get(mapElement.getKey())) {
          return false;
      }
    }
    // [Debug]
    //System.out.println("anagram: ");
    //printMap(anagram);

    return true;
  }

  static public void writeWords(List<String> words, String filePath) throws IOException {
    BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));;

    try {
      for (int i = 0; i < words.size(); i++) {
        writer.write(words.get(i));
        writer.newLine(); // write("\r\n"); // write new line
      }
      System.out.println(filePath + " file has been written successfully!");
    } finally {
      if (writer != null) writer.close();
    }
  }

  static public <K, V > void printMap(Map<K, V> map) {
    for (K key: map.keySet()) {
      String keyMap = key.toString();
      String value = map.get(keyMap).toString();
      System.out.println(key + " " + value);
    }
  }

  // Challenge 5 usage in main function
  static public void doChallenge5() {
    Map<String, Integer> wordsCounters = createWordsCounts("_test_files\\in\\a.txt");
    //printMap(wordsCounters);
    printTopWordCounts(wordsCounters, 10);
  }

  static public Map<String, Integer> createWordsCounts(String filePath) {
    List<String> words = readWords(filePath);

    Map<String, Integer> wordsCounts = new HashMap<>();
    for (int i = 0; i < words.size(); i++) {
      if (!wordsCounts.containsKey(words.get(i))) {
        wordsCounts.put(words.get(i), 1);
      } else {
        wordsCounts.put(words.get(i), wordsCounts.get(words.get(i)) + 1);
      }
    }
    return wordsCounts;
  }

  static public void printTopWordCounts(Map<String, Integer> map, int num) {
    // Create a list from elements of the Map
    List<Map.Entry<String, Integer> > list = new LinkedList<Map.Entry<String, Integer> >(map.entrySet());

    // Sort the list
    Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return (o2.getValue()).compareTo(o1.getValue());
      }
    });

    for (int i = 0; i < num; i++) { //for (Map.Entry<String, Integer> element : list) {
      System.out.println(list.get(i).getKey() + " - " + list.get(i).getValue());
    }
  }

  // Method for printing separator between challenges
  static public void printChallengeSeparator(int challengeNumber) {
    System.out.println("======================== Challenge " + challengeNumber +
            " ==================================");
  }
}

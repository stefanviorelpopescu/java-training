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

  public static void challenge3() {

    List<String> anagrams = findAnagrams("listen", "_4_exceptions_io\\_test_files\\in\\big_list.txt");
    try {
      writeWords(anagrams, "_4_exceptions_io\\_test_files\\out\\output.txt");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static List<String> readWords(String pathFile) {
    List <String> words = new ArrayList<>();

    try(Scanner s = new Scanner(new BufferedReader(new FileReader(pathFile)))) {
      while (s.hasNextLine()) {
        String line = s.nextLine().toLowerCase();
        String[] lineWords = line.split("[\\s\\p{Punct}]+");
        for (int i = 0; i < lineWords.length; i++) {
          if (!lineWords[i].isEmpty()){
            words.add(lineWords[i]);
          }
        }
      }
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
    return words;
  }

  static public Map<Character, Integer> Counter(String word) {
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
    Map<Character, Integer> wordCharacterCounters = Counter(word);

    List<String> anagrams = new ArrayList<>();

    for (int i = 0; i < words.size(); i++) {
      Map<Character, Integer> anagramCharCounters = Counter(words.get(i));

      if (checkCharacterCounter(wordCharacterCounters, anagramCharCounters)) {
        anagrams.add(words.get(i));
      }
    }
    return anagrams;
  }

  static public boolean checkCharacterCounter(Map<Character, Integer> word, Map<Character, Integer> anagram) {
    if (word.size() != anagram.size()){
      return false;
    }

    for (Map.Entry mapElement : word.entrySet()) {
      if (mapElement.getValue() != anagram.get(mapElement.getKey())) {
        return false;
      }
    }

    return true;
  }

  static public void writeWords(List<String> words, String filePath) throws IOException {

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
      for (int i = 0; i < words.size(); i++) {
        writer.write(words.get(i));
        writer.newLine();
      }
      System.out.println(filePath + " file has been written successfully!");
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
package code._4_student_effort.challenge3;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String SMALL_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\small_list.txt";
    private static final String BIG_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\big_list.txt";
    private static final String OUTPUT_FILE = "_4_exceptions_io\\_test_files\\out\\anagram.txt";

    private static List<String> anagramWords;

    public static void main(String[] args) {
        anagramWords = new ArrayList<String>();
        permute("listen", 0, 5);

        String[] list = readList(SMALL_LIST_FILE);
        List<String> foundAnagrams = new ArrayList<String>();

        for (int i = 0; i < anagramWords.size(); ++i) {
            if (isAnagramInList(anagramWords.get(i), list)) {
                foundAnagrams.add(anagramWords.get(i));
            }
        }
        for (int i = 0; i < foundAnagrams.size(); ++i) {
            System.out.println(foundAnagrams.get(i));
        }

        writeInFile(OUTPUT_FILE, foundAnagrams);
    }

    public static boolean isAnagramInList(String word, String[] list) {
        for (int i = 0; i < list.length; ++i) {
            if (list[i].equals(word)) {
                return true;
            }
        }
        return false;
    }

    // preluat din rezolvare
    private static void permute(String str, int left, int right) {
        if (left == right) {
            anagramWords.add(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }

    private static String swap(String initialString, int i, int j) {
        char temp;
        char[] charArray = initialString.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    private static void writeInFile(String filename, List<String> words) {
        try {
            FileWriter myWriter = new FileWriter(filename);
            for (int i = 0; i < words.size(); i++) {
                myWriter.write(words.get(i));
                myWriter.write("\n");
            }
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String[] readList(String filename) {
        String[] words = new String[0];
        int wordCount = 0;
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(filename)))) {
            while (s.hasNext()) {
                String word = s.next();
                words = Arrays.copyOf(words, words.length + 1);
                words[wordCount++] = word;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return words;
    }

    // am inteles gresit enuntul prima oara, nu mai trebuie, dar o las aici
    public static boolean isAnagram(String word, String check) {
        char[] wordArr = word.toCharArray();
        char[] checkArr = check.toCharArray();
        // doar litere mici
        int[] letters = new int[26];

        if (wordArr.length != checkArr.length) {
            return false;
        } else {
            for (int i = 0; i < wordArr.length; ++i) {
                letters[wordArr[i] - 97]++;
                letters[checkArr[i] - 97]--;
            }
            for (int i = 0; i < 26; ++i) {
                if (letters[i] != 0) {
                    return false;
                }
            }
            return true;
        }
    }
}

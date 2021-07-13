package code._3_in_class;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Anagram {

    private static final String SMALL_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\small_list.txt";
    private static final String BIG_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\big_list.txt";
    private static final String OUTPUT_FILE = "_4_exceptions_io\\_test_files\\out\\anagram.txt";


    public static void main(String[] args) {
        String anagramWord = "listen";
        int n = anagramWord.length();

        String[] words = new String[0];
        String[] file = new String[0];
        try {
            file = readListOfWords(SMALL_LIST_FILE);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int countOfWords = 0;
        int[] v = new int[30];
        char[] letters = anagramWord.toCharArray();
        for (int i = 0; i < n; i++)
            v[letters[i] - 'a']++;

        for(int i = 0 ; i < file.length; i++) {
            words = Arrays.copyOf(words, words.length + 1);
            words[countOfWords++] = searchWord(anagramWord, file[i], v);

        }
        writeInFile(words);
    }

    private static String[] readListOfWords(String fileName) throws FileNotFoundException {
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

    private static String searchWord(String name, String word, int[] v) {

        if (name.length() != word.length())
            return "";

        int[] f = new int[30];
        char[] letters = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLowerCase(letters[i]))
            f[letters[i]- 'a']++;
        }
        System.out.println(word + " " + name);
        for (int i = 0; i < 29; i++) {
            System.out.println(f[i] + " " + v[i]);
            if (f[i] != v[i])
                return "";
        }

        return word;
    }

    private static void writeInFile(String[] words) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(OUTPUT_FILE));
            copy(words, bufferedWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void copy(String[] words, Writer writer) throws IOException {
        try {
            for (int i = 0; i < words.length; i++) {
                writer.write(words[i]);
            }
        } finally {
            if (writer != null) writer.close();
        }
    }

}

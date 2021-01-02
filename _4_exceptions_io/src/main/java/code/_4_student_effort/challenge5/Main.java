package code._4_student_effort.challenge5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words = readList("_4_exceptions_io\\_test_files\\in\\a.txt");
        Word[] uniqueWords = isUnique(words);

        sortWordApperances(uniqueWords);

        for (int i = 0; i < 10; ++i) {
            System.out.println(uniqueWords[i].getWord() + " - " + uniqueWords[i].getOccurrence());
        }
    }

    public static Word[] isUnique(String[] words) {
        Word[] uniqueWords = new Word[0];
        for (int i = 0; i < words.length; ++i) {
            int position = whereIsIn(uniqueWords, words[i]);
            if (position == -1) {
                uniqueWords = Arrays.copyOf(uniqueWords, uniqueWords.length + 1);
                uniqueWords[uniqueWords.length - 1] = new Word(words[i]);
            } else {
                uniqueWords[position].increaseOccurence();
            }
        }

        return uniqueWords;
    }

    public static int whereIsIn(Word[] uniqueWords, String word) {
        for (int i = 0; i < uniqueWords.length; ++i) {
            if (uniqueWords[i].getWord().equals(word)) {
                return i;
            }
        }
        return -1;
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

    private static void sortWordApperances(Word[] uniqueWords) {
        Arrays.sort(uniqueWords, new Comparator<Word>() {
            @Override
            public int compare(Word o1, Word o2) {
                return o2.getOccurrence().compareTo(o1.getOccurrence());
            }
        });
    }
}

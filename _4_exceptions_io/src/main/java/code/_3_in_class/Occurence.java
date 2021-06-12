package code._3_in_class;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Locale;
import java.util.Scanner;

public class Occurence {

    public static void main(String[] args) throws FileNotFoundException {
        String[] words = readWords();
        WordOccurence[] uniqueWords = countAppearances(words);

        sortWordApperances(uniqueWords);
        displayFirst10(uniqueWords);
    }

    private static String[] readWords() throws FileNotFoundException {
        String[] words = new String[0];
        try (Scanner s = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\a.txt")))) {
            s.useLocale(Locale.US);
            while (s.hasNext()) {
                words = Arrays.copyOf(words, words.length + 1);
                words[words.length - 1] = s.next();
            }
        }
        return words;
    }

    private static WordOccurence[] countAppearances(String[] words) {
        WordOccurence[] uniqueWords = new WordOccurence[0];
        for (String word : words ) {
            WordOccurence wordOccurrence = existsInUniqueList(uniqueWords, word);
            if (wordOccurrence != null) {
                wordOccurrence.increaseOccurence();
            } else {
                uniqueWords = Arrays.copyOf(uniqueWords, uniqueWords.length + 1);
                uniqueWords[uniqueWords.length - 1] = new WordOccurence(word);
            }
        }
        return uniqueWords;
    }

    private static WordOccurence existsInUniqueList(WordOccurence[] uniqueWords, String word) {
        for (WordOccurence wordOccurrence : uniqueWords) {
            if (wordOccurrence.getWord().equals(word)) {
                return wordOccurrence;
            }
        }
        return null;
    }

    private static void sortWordApperances(WordOccurence[] uniqueWords) {
        Arrays.sort(uniqueWords, new Comparator<WordOccurence>() {
            @Override
            public int compare(WordOccurence o1, WordOccurence o2) {
                return o2.getOccurence().compareTo(o1.getOccurence());
            }
        });
    }

    private static void displayFirst10(WordOccurence[] uniqueWords) {
        for (int i = 0; i < 10; i++) {
            System.out.println(uniqueWords[i].getWord() + " - " + uniqueWords[i].getOccurence());
        }
    }

}

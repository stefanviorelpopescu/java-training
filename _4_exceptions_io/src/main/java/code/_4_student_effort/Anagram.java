package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    protected static void anagram_method() {
        String small_list = "_4_exceptions_io\\_test_files\\in\\small_list.txt";
        String big_list = "_4_exceptions_io\\_test_files\\in\\big_list.txt";
        char[] anagram = "listen".toCharArray();
        int anagram_size = anagram.length;
        Arrays.sort(anagram);
        Scanner scanner = null;
        try {
            scanner = new Scanner(new BufferedReader(new FileReader(small_list)));

            while (scanner.hasNext()) {
                String word_read = scanner.next();
                if (!scanner.hasNext())
                    operateOnSingleLine(word_read.toCharArray(), anagram);// if the file contain just a single line with
                // words without delimiter
                if (anagram.length != word_read.length())
                    continue;
                char[] temp = word_read.toCharArray();
                Arrays.sort(temp);
                boolean ok = true;
                for (int i = 0; i < anagram.length; i++) {
                    if (anagram[i] != temp[i]) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    System.out.println(word_read);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) scanner.close();
        }

    }

    private static void operateOnSingleLine(char[] line_string, char[] anagram) {//in this case anagram.length is 6
        for (int i = 0; i < line_string.length; i += anagram.length) {
            char[] temp = Arrays.copyOfRange(line_string, i, i + 6);
            String anagram_word = new String(temp);
            Arrays.sort(temp);
            boolean ok = true;
            for (int j = 0; j < anagram.length; j++) {
                if (anagram[j] != temp[j]) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                System.out.println(anagram_word);
            }
        }

    }
}
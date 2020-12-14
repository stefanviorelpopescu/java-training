package code._4_student_effort.challenge3;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) throws IOException {
        try {
            String small_list = "_4_exceptions_io\\_test_files\\in\\small_list.txt";
            String big_list = "_4_exceptions_io\\_test_files\\in\\big_list.txt";
            String output_list = "_4_exceptions_io\\_test_files\\out\\anagram.txt";


            String[] anagramWords = new String[0];
            int anagrams = 0;

            Scanner in = null;

            String word = "listen";
            int len = word.length();


            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String sorted_word = new String(letters);

            try {
                in = new Scanner(new BufferedReader(new FileReader(big_list)));
                while (in.hasNext()) {
                    String list_word = in.next();
                    char[] lw_letters = list_word.toCharArray();

                    Arrays.sort(lw_letters);

                    String sorted_lw = new String(lw_letters);

                    if (sorted_word.equals(sorted_lw)) {
                        anagramWords = Arrays.copyOf(anagramWords, anagramWords.length + 1);
                        anagramWords[anagrams++] = list_word;
                    }
                }


            } finally {
                if (in != null)
                    in.close();
            }

            System.out.println(anagrams);
            for (int i = 0; i < anagrams; i++) {
                System.out.println(anagramWords[i]);
            }

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output_list));
            try {
                for(int i = 0; i < anagrams; i++) {
                    bufferedWriter.write(anagramWords[i]);
                }
            } finally {
                if (bufferedWriter != null) bufferedWriter.close();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
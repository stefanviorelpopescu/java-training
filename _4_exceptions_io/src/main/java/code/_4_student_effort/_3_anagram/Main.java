package code._4_student_effort._3_anagram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    //Declaration for text output color//
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "---- Code Challenge 3 ----" + ANSI_RESET);

        String mainWord = "listen";
        checkForAnagrams(mainWord);

    }


    public static void checkForAnagrams(String mainWord){
        char[] tempMain = mainWord.toCharArray();
        Arrays.sort(tempMain);

        try(Scanner s = new Scanner(new BufferedReader(new FileReader("C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\big_list.txt")))) {

            while (s.hasNextLine()) {
                String word = s.nextLine();
                word = word.trim();
                char[] tempWord = word.toCharArray();


                if (tempMain.length == word.length()) {
                    Arrays.sort(tempWord);

                    if (Arrays.equals(tempMain, tempWord) && (!word.equals(mainWord))) {
                        System.out.println(word);
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

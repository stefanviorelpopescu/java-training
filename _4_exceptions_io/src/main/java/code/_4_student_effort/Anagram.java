package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

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

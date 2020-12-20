package code._4_student_effort.code_challenge_3;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class AnagramMain {

    private static final String SMALL_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\small_list.txt";
    private static final String BIG_LIST_FILE = "_4_exceptions_io\\_test_files\\in\\big_list.txt";
    private static final String OUTPUT_FILE = "_4_exceptions_io\\_test_files\\out\\anagram.txt";


    public static void main(String[] args){

        String word ="listen";

        Scanner s = null;

        try{
            s = new Scanner(new BufferedReader(new FileReader(BIG_LIST_FILE)));
            while(s.hasNext()){
                String potentiallyAnagram = s.next();
                potentiallyAnagram = potentiallyAnagram.trim();
                if(areAnagrams(word,potentiallyAnagram)){
                    System.out.println(potentiallyAnagram);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static boolean areAnagrams(String word1, String word2){

        if(word1.length()!=word2.length()){
            return false;
        }
        else {
            char[] word1Char = word1.toCharArray();
            char[] word2Char = word2.toCharArray();

            Arrays.sort(word1Char);
            Arrays.sort(word2Char);

            for (int i = 0; i < word1Char.length; i++)
                if (word1Char[i] != word2Char[i])
                    return false;
        }


        return true;
    }

}

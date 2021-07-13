package code._4_student_effort.CodeChallengeTwo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class SecretMessage {
    private static final String FILE_NAME="_4_exceptions_io\\_test_files\\in\\message.txt";
    public static void main(String[] args){
        ArrayList<String> findCapitalLetters=new ArrayList<>();
        try {

           findCapitalLetters= (readFile(FILE_NAME));
           decode(findCapitalLetters);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void decode(ArrayList<String> findCapitalLetters){
        String secretMessage="";
        for(String word:findCapitalLetters){
            char[] wordToLetter=word.toCharArray();
            for(char letter:wordToLetter)
                if(Character.isUpperCase(letter))
                    if(letter=='X')
                        secretMessage+=" ";
                        else
                    secretMessage+=letter;

    }System.out.println(secretMessage);}

    public static ArrayList<String> readFile(String fileName) throws FileNotFoundException {
        ArrayList<String> words=new ArrayList<>();
        Scanner s=null;

        try {
            s = new Scanner(new BufferedReader(new FileReader(fileName)));
            s.useLocale(Locale.US);
            while (s.hasNext()) {
                words.add(s.next());
            }
        } finally {
            if (s != null) s.close();
        }
        ArrayList<String> newWords=new ArrayList<>(words);
        return newWords;
    }
}

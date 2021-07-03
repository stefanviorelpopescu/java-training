package code._4_student_effort;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Anagram {
    static String firstFile = "_4_exceptions_io\\_test_files\\in\\small_list.txt";
    static String secondFile = "_4_exceptions_io\\_test_files\\in\\big_list.txt";
    static String outputFile = "_4_exceptions_io\\_test_files\\out\\anagram.txt";
    static List<String> anagramWords = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        String anagramWord = "listen";
        // Generate all possible combinations of words
        anagramGeneration(anagramWord,0,anagramWord.length()-1);
        System.out.println("Number of generated words from initial string : " + anagramWords.size());
        // Small dictionary
        List<String> sameLengthWordsSmallList = readSmallFile(anagramWord.length());
        System.out.println("Size of small dictionary list : " + sameLengthWordsSmallList.size());
        // Search of words in the small dictionary list
        List<String> smallListFoundedWords = searchWords(sameLengthWordsSmallList,anagramWords);
        Collections.sort(smallListFoundedWords);
        System.out.println("Number of words founded : " + smallListFoundedWords.size());
        System.out.println("Words that were founded : " + smallListFoundedWords);
        writeInFile(smallListFoundedWords);
        // Big dictionary
        List<String> sameLengthWordsBigList = readBigFile(anagramWord.length());
        System.out.println("Size of big dictionary list : " + sameLengthWordsBigList.size());
        // Search of words in the big dictionary list
        List<String> bigListFoundedWords = searchWords(sameLengthWordsBigList,anagramWords);
        Collections.sort(bigListFoundedWords);
        System.out.println("Number of words founded : " + bigListFoundedWords.size());
        System.out.println("Words that were founded : " + bigListFoundedWords);
        writeInFile(bigListFoundedWords);
    }
    public static List<String> readSmallFile(int wordLength) throws FileNotFoundException {
        List<String> wordsFound = new ArrayList<>();
        String word;
        Scanner firstDictionary = new Scanner(new File(firstFile));
        while (firstDictionary.hasNext()) {
            word = firstDictionary.next();
            if(word.length() == wordLength){
                wordsFound.add(word);
            }
        }
        return wordsFound;
    }
    public static List<String> readBigFile(int wordLength) throws IOException {
        String line;
        List<String> wordsFound = new ArrayList<>();
        BufferedReader secondDictionary = new BufferedReader(new FileReader(secondFile));
        while((line=secondDictionary.readLine())!=null){
            if(line.length() == wordLength){
                wordsFound.add(line);
            }
        }
        secondDictionary.close();
        return wordsFound;
    }

    public static void anagramGeneration(String word, int firstIndex , int lastIndex){
        if(firstIndex == lastIndex){
            anagramWords.add(word);
        }else{
            for (int i = firstIndex; i <= lastIndex; i++){
                word = swapCharacters(word,firstIndex,i);
                anagramGeneration(word,firstIndex+1,lastIndex);
                word = swapCharacters(word,firstIndex,i);
            }
        }
    }

    public static String swapCharacters(String word,int presentPosition,int futurePosition){
        char temporary;
        char[] wordArray = word.toCharArray();
        temporary = wordArray[presentPosition];
        wordArray[presentPosition] = wordArray[futurePosition];
        wordArray[futurePosition] = temporary;
        return String.valueOf(wordArray);
    }

    public static List<String> searchWords(List<String> dictionary,List<String> generatedWords){
        List<String> foundedWords = new ArrayList<>();
        for (String generatedWord : generatedWords) {
            for (String dictionaryWord : dictionary) {
                if (generatedWord.equals(dictionaryWord)) {
                    foundedWords.add(dictionaryWord);
                }
            }
        }
        return foundedWords;
    }

    public static void writeInFile(List<String> outputWords) throws IOException {
        BufferedWriter anagramWriter  = new BufferedWriter(new FileWriter(outputFile));
        for (String word : outputWords){
            anagramWriter.write(word);
            anagramWriter.write("\n");
        }
        anagramWriter.close();
    }
}

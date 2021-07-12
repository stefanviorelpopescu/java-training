//package code._4_student_effort.CodeChallengeThree;
//
//import java.util.ArrayList;
//
//public class Anagram {
//    private static final String BIG_LIST="_4_exceptions_io\\_test_files\\in\\big_list.txt";
//    private static final String SMALL_LIST="_4_exceptions_io\\_test_files\\in\\small_list.txt";
//    private static final String OUTPUT_TXT="_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\CodeChallengeThree\\output.txt";
//
//    private static ArrayList<String> anagrams;
//
//    public static void main(String[] args)
//    {
//    anagrams=new ArrayList<>();
//    String anagramWord="listen";
//    int nrOfLetters=anagramWord.length();
//    tryAnagram(anagramWord);
//    ArrayList<String> overallWords=new ArrayList<>();
//    for(String word:anagrams){
//        try {
//    overallWords.add(searchForWord(word,readListOfWords(SMALL_LIST)));
//        }
//    }
//    }
//
//    private static String searchForWord(String word,ArrayList<String> words) {
//    }
//
//    private static void tryAnagram(String anagramWord) {
//    }
//
//}

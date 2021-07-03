package code._4_student_effort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Occurrence {
    static String filePath = "_4_exceptions_io\\_test_files\\in\\a.txt";

    public static void main(String[] args) throws FileNotFoundException {
        List<String> wordsFromFile = readWords();
        //System.out.println(wordsFromFile);
        LinkedHashMap<String ,Integer> frequencyMap = new LinkedHashMap<>();
        frequencyOfWords(wordsFromFile).entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEachOrdered(x -> frequencyMap.put(x.getKey(), x.getValue()));
        frequencyMap.entrySet().stream().limit(10).forEach(System.out::println);
    }

    public static List<String> readWords() throws FileNotFoundException {
        List<String> words = new ArrayList<>();
        String word;
        Scanner occurrenceFile = new Scanner(new File(filePath));
        while (occurrenceFile.hasNext()) {
            word = occurrenceFile.next();
            words.add(word.toLowerCase().replaceAll("\\p{Punct}",""));
        }
        return words;
    }

    public static Map<String, Integer> frequencyOfWords(List<String> wordsList){
        Map<String,Integer> frequencyMap = new HashMap<>();
        for (String word : wordsList){
            Integer count = frequencyMap.get(word);
            frequencyMap.put(word,(count == null) ? 1 : count+1);
        }
        return frequencyMap;
    }

}

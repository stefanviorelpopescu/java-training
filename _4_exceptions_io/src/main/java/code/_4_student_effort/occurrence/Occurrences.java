package code._4_student_effort.occurrence;

import java.io.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Occurrences {

    private static final String INPUT_FILE = "_4_exceptions_io\\_test_files\\in\\a.txt";
    private static PrintWriter printWriter;
    private static Map<String, Integer> wordsMap = new HashMap<>();


    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE));
        while((line = bufferedReader.readLine()) !=null) {
            String[] words = line.split(" ");

            for ( String word : words ) {
                if(word.equals(""))
                    continue;
                word = word.toLowerCase();
                if(wordsMap.containsKey(word))
                    wordsMap.computeIfPresent(word, (k,v) -> v+1);
                else
                    wordsMap.put(word,1);
            }
        }
        List<String> keys = wordsMap.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).limit(10).map(Map.Entry::getKey).collect(Collectors.toList());

        for(String key : keys) {
            System.out.println( wordsMap.get(key) + " - " + key);
        }
    }


}

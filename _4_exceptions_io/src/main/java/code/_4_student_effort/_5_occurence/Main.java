package code._4_student_effort._5_occurence;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;


public class Main {
    static LinkedHashMap<String, Integer> wordAppearance = new LinkedHashMap<>();

    public static void main(String[] args) {
        loadText();

        LinkedHashMap<String, Integer> resultMap = sortMap(wordAppearance);

        displayTopTen(resultMap);
    }


    public static void loadText(){
        try(Scanner s = new Scanner(new BufferedReader(new FileReader("C:\\development\\workspace\\java-training\\_4_exceptions_io\\_test_files\\in\\a.txt")))) {
        s.useLocale(Locale.ENGLISH);

            while (s.hasNext()) {
                String word = s.next();

                if (!wordAppearance.containsKey(word)) {
                    wordAppearance.put(word, 1);
                }
                else {
                    wordAppearance.put(word, wordAppearance.get(word) +1);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static LinkedHashMap<String,Integer> sortMap(LinkedHashMap<String,Integer> wordAppearance){
        List<Map.Entry<String, Integer>> wordList = new LinkedList<>(wordAppearance.entrySet());

        Comparator<Map.Entry<String, Integer>> cmp = Map.Entry.comparingByValue();
        wordList.sort(cmp.reversed());

        LinkedHashMap<String,Integer> resultMap = new LinkedHashMap<>();

        for(Map.Entry<String,Integer> entry : wordList) {
            resultMap.put(entry.getKey(), entry.getValue());
        }

        return resultMap;
    }

    public static void displayTopTen(LinkedHashMap<String, Integer> resultMap) {
        int topCount = 0;
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
            topCount++;
            if (topCount > 9 ) {
                break;
            }
        }
    }

}


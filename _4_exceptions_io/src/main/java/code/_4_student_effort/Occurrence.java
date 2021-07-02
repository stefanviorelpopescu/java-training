package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Occurrence {
    private HashMap<String, Integer> wordOccurence = new HashMap<String,Integer>();

    public void readFile(){
        try{
            Scanner s = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\a.txt")));
            String word;
            while(s.hasNext()){
                word = s.next();
                if(wordOccurence.containsKey(word)){
                    wordOccurence.replace(word,wordOccurence.get(word) + 1);
                }
                else{
                    wordOccurence.put(word, 1);
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void sortByValue(boolean order){
        List<Map.Entry<String,Integer>> list = new LinkedList<>(wordOccurence.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>(){

            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                if(order){
                    return o1.getValue().compareTo(o2.getValue());
                }
                else {
                    return o2.getValue().compareTo(o1.getValue());
                }
            }
        });
        Map<String,Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for(Map.Entry<String,Integer> entry : list){
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        for(int i=0 ; i < 9; i++){
            System.out.println(list.get(i).getKey() + " " + list.get(i).getValue());
        }
    }
}


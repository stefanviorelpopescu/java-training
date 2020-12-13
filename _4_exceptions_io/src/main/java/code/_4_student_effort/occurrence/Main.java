package code._4_student_effort.occurrence;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args){
        Path path = Paths.get("_4_exceptions_io/src/main/resources/words.txt");
        try {
            List<String> lines = Files.readAllLines(path);
            HashMap<String, Integer> map = new HashMap<>();

            for (String str : lines){
                String[] words = str.split("\\W+");
                for (int i=0; i<words.length;i++){
                    if(!map.containsKey(words [i])){
                        if(!words[i].equals("")) {
                            map.put(words[i], 1);
                        }
                    }else{
                        map.put(words [i], map.get(words [i]) +1);
                    }
                }
            }

            PriorityQueue<String> pq = new PriorityQueue<>((x, y) -> map.get(y).compareTo(map.get(x)));
            pq.addAll(map.keySet());
            int j = 0;
            while(!pq.isEmpty() && j < 10){
                String word= pq.poll();
                System.out.println("top " + (j+1) + " " + word + " - " + map.get(word));
                j ++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}

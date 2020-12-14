package code._4_student_effort.challenge5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Occurrence {

    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());            }
        });

        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            temp.put(entry.getKey(), entry.getValue());
        }
        return temp;
    }

    public static void main(String[] args) {
        try {
            String fileName = "_4_exceptions_io\\_test_files\\in\\a.txt";

            Scanner in = null;

            HashMap<String, Integer> occurrenceMap = new HashMap<>();

            try {
                in = new Scanner(new BufferedReader(new FileReader(fileName)));


                while(in.hasNext()) {
                    String word  = in.next().toLowerCase();

                    occurrenceMap.merge(word, 1, Integer::sum);
                }
            } finally {
                if (in != null)
                    in.close();
            }

            occurrenceMap = sortByValue(occurrenceMap);

            int counter = 0;
            for (Map.Entry<String, Integer> pair : occurrenceMap.entrySet()) {
                if(counter == 10)
                    break;
                counter++;
                System.out.println(pair.getKey() + " - " + pair.getValue());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}

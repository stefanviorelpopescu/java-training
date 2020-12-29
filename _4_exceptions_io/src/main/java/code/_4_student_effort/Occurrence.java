package code._4_student_effort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Occurrence {
protected static void occurrendce_words()
{
    HashMap<String,Integer> map_words = new HashMap<>();
    try {
        Scanner scanner = new Scanner(new BufferedReader(new FileReader("_4_exceptions_io\\_test_files\\in\\a.txt")));
        while(scanner.hasNext()) {
            String s = scanner.next();
            if (!map_words.containsKey(s)) {
                map_words.put(s, 1);
            } else {
                map_words.put(s, map_words.get(s) + 1);
            }
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    HashMap<String, Integer> sorted_map = sortByValue(map_words);

    int stop=0;
    for (Map.Entry<String, Integer> e : sorted_map.entrySet()) {
        if (++stop > 10)
            break;
        System.out.println(e.getKey() + " " + e.getValue());
    }

}
    // function to sort hashmap by values
    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer> > list =
                new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue()); //reverse sort
            }
        });

        // put data from sorted list to hashmap
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
}

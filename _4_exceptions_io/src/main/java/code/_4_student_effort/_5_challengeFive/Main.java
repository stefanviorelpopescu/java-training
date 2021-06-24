package code._4_student_effort._5_challengeFive;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your text: ");

        String in = scanner.nextLine();
        String[] words = in.split(" ");
        ArrayList<String> wordsList = new ArrayList<>();
        Collections.addAll(wordsList, words);
        HashSet<String> uniqueWords = new HashSet<>(wordsList);
        HashMap<String, Integer> countWords = new HashMap<>();
        for (String s : uniqueWords) {
            int count = 0;
            for (String s2 : wordsList) {
                if (s.equals(s2)) {
                    count += 1;
                    countWords.put(s, count);
                }
            }
        }

        ValueComparator bvc = new ValueComparator(countWords);
        TreeMap<String, Integer> sortedCountWords = new TreeMap<>(bvc);
        sortedCountWords.putAll(countWords);
        Map<String, Integer> limitedMap = sortedCountWords.entrySet().stream()
                .limit(10)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        for (String s : limitedMap.keySet()) {
            System.out.println("word: " + s + " / count: " + countWords.get(s));
        }
    }
}

class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;
    public ValueComparator (Map<String, Integer> base) {
        this.base = base;
    }

    public int compare (String a, String b) {
        if (base.get(a) >= base.get(b)) {
            return -1;
        } else {
            return 1;
        }
    }
}

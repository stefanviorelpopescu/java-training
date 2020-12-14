package code._4_student_effort.thirdchallenge;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        Map<String, Boolean> dict = anagram.moveWordsInMap("small_list.txt");
        int a = 0;
        String listen = "listen";
        anagram.makeAnagram(listen.toCharArray(), a);
    }

    public Map<String, Boolean> moveWordsInMap(String filename) {
        Map<String, Boolean> map = new HashMap<>();
        Scanner scanner;
        try {
            scanner = new Scanner(new FileReader(filename));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        while (scanner.hasNext()) {
            String auxStr = scanner.next();
            map.put(auxStr, true);

        }
        scanner.close();
        return map;
    }

    void makeAnagram(char[] a, int i) {
        //System.out.println("MakeAnagram i=" + i); //for debug
        if (i == a.length-1) {
            System.out.println(a);
        }
        else {
            for (int j=i; j< a.length; j++) {
                //swap a[i] with a[j]
                char c = a[i];
                a[i] = a[j];
                a[j] = c;
                makeAnagram(a, i+1);
                //swap back
                c = a[i];
                a[i] = a[j];
                a[j] = c;
            }
        }
    }
}

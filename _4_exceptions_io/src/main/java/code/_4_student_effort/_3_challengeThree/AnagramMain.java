package code._4_student_effort._3_challengeThree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramMain {
    public static void main(String[] args) throws IOException {
        String url = "https://raw.githubusercontent.com/dwyl/english-words/master/words_alpha.txt";
        String word = "listen";

        URL url1 = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(url1.openStream()));
        List<String> anagrams = new ArrayList<>();
        String result;
        String line;
        while ((line = in.readLine()) != null) {
            char[] lineChars = line.toCharArray();
            char[] wordChars = word.toCharArray();
            AnagramMain arrComp = new AnagramMain();
            if (arrComp.compareArrays(lineChars, wordChars)) {
                result = line;
                anagrams.add(result);
            }
        }
        for (String s : anagrams) {
            System.out.println(s);
        }
        in.close();

    }

    public boolean compareArrays(char[] arr1, char[] arr2) {
        if(arr1==null || arr2==null){
            return false;
        }
        if(arr1.length!=arr2.length){
            return false;
        }

        char[] sortedArr1 = sortArray(arr1);
        char[] sortedArr2 = sortArray(arr2);

        for(int i = 0; i < sortedArr1.length; i++) {
            if (sortedArr1[i] != sortedArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public void swapElements (char[] arr, int pos) {
        char temp = arr[pos];
        arr[pos] = arr[pos+1];
        arr[pos+1] = temp;
    }

    public char[] sortArray (char[] arr) {
        for (int k = 0; k < arr.length; k++){
            for (int i = 0; i < arr.length-1; i++){
                if (arr[i] > arr[i+1]) {
                    swapElements(arr, i);
                }
            }
        }
        return arr;
    }
}

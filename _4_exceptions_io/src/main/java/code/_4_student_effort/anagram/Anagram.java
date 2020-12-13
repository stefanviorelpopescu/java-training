package code._4_student_effort.anagram;

import java.io.*;

public class Anagram {
    static final String INPUT_FILE = "_4_exceptions_io\\_test_files\\in\\small_input.txt";
    static final String OUTPUT_FILE = "_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\anagram\\output_anagram.txt";
    static PrintWriter printWriter;

    static {
        try {
            printWriter = new PrintWriter(OUTPUT_FILE);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        String line;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE));
        while(( line = bufferedReader.readLine()) != null){
            String[] words = line.split(" ");
           for (int i = 0; i< words.length; i++) {
                permutation(words[i]);
            }
        }
        printWriter.close();
    }

    public static void permutation(String str) {
        permutation("", str);
    }

    public static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) printWriter.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }

    }
}

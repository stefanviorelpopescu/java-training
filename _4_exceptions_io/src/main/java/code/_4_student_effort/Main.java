package code._4_student_effort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Challenge 1:");
        codeChallenge1();

        System.out.println("\nChallenge 2:");
        codeChallenge2();

        System.out.println("\nChallenge 3:");
        codeChallenge3();

        System.out.println("\nChallenge 5:");
        codeChallenge5();
    }

    /*////////////////////////////////////////////////////////////
    //////////////////// Code Challenge 1 ////////////////////////
    ////////////////////////////////////////////////////////////*/
    public static void codeChallenge1() {

        BufferedReader reader;

        Map<String, String> phoneBook = new HashMap<>();

        try {

            reader = new BufferedReader(new FileReader("C:\\development\\workspace\\java-training" +
                    "\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\phonebook.txt"));

            String line = reader.readLine();
            while (line != null) {
                String[] details = line.split(" ");
                phoneBook.put(details[1], details[0]);
                line = reader.readLine();
            }

            for (String number : phoneBook.keySet()) {
                if (phoneBook.get(number).equals("Abbey") || phoneBook.get(number).equals("Abdul")) {
                    System.out.println(number);
                }
            }

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  /*////////////////////////////////////////////////////////////
  //////////////////// Code Challenge 2 ////////////////////////
  ////////////////////////////////////////////////////////////*/

    public static void codeChallenge2() {

        BufferedReader reader;

        List<String> words;

        char[] message;

        int index;

        try {

            words = new ArrayList<>();

            message = new char[1000];

            index = 0;

            reader = new BufferedReader(new FileReader("C:\\development\\workspace\\java-training" +
                    "\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\message.txt"));

            String line = reader.readLine();

            while (line != null) {
                String[] splittedWords = line.split("\\|\\||\\?|!|'|\\+|-|\\*|/|%| |\\.");
                words.addAll(Arrays.asList(splittedWords));
                line = reader.readLine();
            }

            for (String word : words) {
                for (int i = 0; i < word.length(); i++) {
                    if (Character.isUpperCase(word.charAt(i))) {
                        message[index++] = word.charAt(i);
                    }
                }
            }

            int j = 0;

            while (j < index) {
                if (message[j] != 'X') {
                    System.out.print(message[j]);
                } else {
                    System.out.print(" ");
                }

                j++;
            }

            System.out.println();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

  /*////////////////////////////////////////////////////////////
  //////////////////// Code Challenge 3 ////////////////////////
  ////////////////////////////////////////////////////////////*/

    static void printPermutations(String string, String answer) {

        if (string.length() == 0) {
            System.out.print(answer + " ");
            return;
        }

        for (int i = 0; i < string.length(); i++) {
            char ch = string.charAt(i);
            String ros = string.substring(0, i) + string.substring(i + 1);
            printPermutations(ros, answer + ch);
        }

    }

    public static void codeChallenge3() {

        String toAnagram = "listen";

        printPermutations(toAnagram, "");

        System.out.println();
    }

    /*////////////////////////////////////////////////////////////
   //////////////////// Code Challenge 5 ////////////////////////
  ////////////////////////////////////////////////////////////*/

    public static void codeChallenge5() {

        Map<String, Integer> occurrence;

        try {
            occurrence = new TreeMap<>();

            System.out.println("Introduce the file name:");

            Scanner scanner = new Scanner(System.in);

            File file = new File("C:\\development\\workspace\\java-training" +
                    "\\_4_exceptions_io\\src\\main\\java\\code\\_4_student_effort\\" + scanner.nextLine());

            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] words = line.split("\\|\\||\\?|!|'|\\+|-|\\*|/|%| |\\.");

                for (String word : words) {
                    if (!occurrence.containsKey(word)) {
                        occurrence.put(word.toLowerCase(), 1);
                    } else {
                        occurrence.put(word.toLowerCase(), occurrence.get(word.toLowerCase()) + 1);
                    }
                }
            }

            List<Map.Entry<String, Integer>> list = new LinkedList<>(occurrence.entrySet());

            list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

            for (int i = 0; i < 10; i++) {
                System.out.println(list.get(i).getKey() + " - " + list.get(i).getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

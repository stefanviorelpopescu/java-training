package code._4_student_effort.challenge3;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void ex1() {
        List<String> words = Arrays.asList(
                "sierra", "tango", "romeo", "echo", "alpha", "mike");

        StringBuilder sb = new StringBuilder();

        words.forEach(s -> sb.append(s.charAt(0)));

        System.out.println(sb);
    }

    private static void ex2() {
        List<String> words = new ArrayList<>(Arrays.asList(
                "sierra", "tango", "romeo", "echo", "alpha", "mike"));

        words.removeIf(s -> s.length() % 2 == 1);
        words.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    private static void ex3() {
        List<String> words = Arrays.asList(
                "sierra", "tango", "romeo", "echo", "alpha", "mike");

        words.replaceAll(String::toUpperCase);
        words.forEach(s -> System.out.print(s + " "));
        System.out.println();
    }

    public static void ex4() {
        Map<String, String> myMap = new HashMap<>();
        myMap.put("a", "1");
        myMap.put("b", "2");

        StringBuilder sb = new StringBuilder();

        myMap.entrySet().stream().map(entry -> entry.getKey() + entry.getValue()).map(sb::append).collect(Collectors.toList());

        System.out.println(sb);
    }

    private static void ex5() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        new Thread(() -> System.out.print(numbers)).start();
    }

    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
        ex5();
    }
}

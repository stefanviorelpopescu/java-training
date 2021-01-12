package code._4_student_effort.Challenge3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        exercise5();
    }

    public static void exercise1() {
        List<String> list = new ArrayList<>(Arrays.asList("Salut", "ma", "Numesc", "virgula", "alfabet"));
        StringBuilder result = new StringBuilder();

        list.stream()
                .map(s -> s.subSequence(0,1))
                .forEach(firstLetter -> result.append(firstLetter).append(" "));

        System.out.println(result);
    }

    public static void exercise2() {
        List<String> list = new ArrayList<>(Arrays.asList("haha", "Salut", "ma", "Numesc", "joke", "virgula", "alfabet", "gigi"));

        list.removeIf(word -> word.length() % 2 == 1);

        list.forEach(System.out::println);
    }

    public static void exercise3() {
        List<String> list = new ArrayList<>(Arrays.asList("haha", "Salut", "ma", "Numesc", "joke", "virgula", "alfabet", "gigi"));

        list.replaceAll(String::toUpperCase);

        list.forEach(System.out::println);
    }

    public static void exercise4() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);

        StringBuilder result = new StringBuilder();
        map.forEach((key,value) -> result.append(key).append(value));

        System.out.println(result);
    }

    public static void exercise5() {
        List<String> list = new ArrayList<>(Arrays.asList("haha", "Salut", "ma", "Numesc", "joke", "virgula", "alfabet", "gigi"));

        new Thread(() -> list.forEach(System.out::println)).start();
    }
}

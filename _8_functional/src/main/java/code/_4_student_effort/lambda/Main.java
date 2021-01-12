package code._4_student_effort.lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //ex1:

        List<String> stringList = new ArrayList<>(Arrays.asList("Catalin", "Stoicescu", "Google"));

        StringBuilder stringBuilder = new StringBuilder();

        stringList.forEach( s -> stringBuilder.append(s.charAt(0)));

        System.out.println(stringBuilder);


        //ex2:

        stringList.removeIf(s -> s.length() % 2 == 1 );

        stringList.forEach(System.out::println);

        //ex3:
        stringList.stream().map( s -> s.toUpperCase()).forEach(System.out::println);

        //ex4:

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        StringBuilder stringBuilder1 = new StringBuilder();

        map.forEach( (s,v) -> stringBuilder1.append(s+v));

        System.out.println(stringBuilder1);


        //ex5
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 9));
        Thread thread = new Thread(() -> integerList.forEach(System.out::print));
        thread.start();
    }
}

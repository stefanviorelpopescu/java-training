package code._4_student_effort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    ex1();
    ex2();
    ex3();
    ex4();
    ex5();
  }

  private static void ex5() {

    List<Integer> numbers = Arrays.asList(1,3,5,7,9);

    new Thread(() -> System.out.println(numbers)).start();

  }


  public static void ex4() {
    Map<String, String> myMap = new HashMap<>();
    myMap.put("a", "1");
    myMap.put("b", "2");
    myMap.put("c", "3");

    StringBuilder sb = new StringBuilder();

    myMap.forEach((key, value) -> sb.append(key).append(value));
    System.out.println(sb);


  }

  public static void ex3() {
    List<String> words = Arrays.asList("hippo", "elephant", "lion", "parrot");

    System.out.println(words.stream()
            .map(String::toUpperCase)
            .collect(Collectors.toUnmodifiableList()));
  }

  public static void ex2() {
    List<String> words = Arrays.asList("hippo", "elephant", "lion", "parrot");

    System.out.println(words.stream()
            .filter(s -> s.length() % 2 == 1)
            .collect(Collectors.toList()));

  }

  public static void ex1() {

    List<String> words = Arrays.asList("hippo", "elephant", "lion", "parrot");

    StringBuilder sb = new StringBuilder();

    words.forEach(s -> sb.append(s.charAt(0)));

    System.out.println(words.stream()
            .map(s -> s.substring(0, 1))
            .reduce("", (x, y) -> x + y));

//    System.out.println(sb);
  }
}

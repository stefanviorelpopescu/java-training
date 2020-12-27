package code._4_student_effort;

import java.util.*;

public class Main {

  public static void main(String[] args) {
      //TODO put your code changes in here
      //challenge1();
      //challenge2();
      //challenge4();
      challenge5();

  }

  public static void challenge1() {

    List<Integer> arr = Arrays.asList(3, 5, 9, 2, 4, 8, 7, 6); //9,8,7,6 are leaders

    Collections.reverse(arr);             // reverse the array
    Integer max = Integer.MIN_VALUE;
    StringBuilder toShow = new StringBuilder();

    for (Integer i : arr) {
      if (i > max) {
        max = i;
        toShow.append(i + " ,");
      }
    }

    toShow.setLength(Math.max(toShow.length()-2, 0));     // delete last " ,"
    System.out.println(toShow.reverse());
  }

  public static void challenge2() {

    int numberOfLines = 7;
    List<List<Integer>> arr = new LinkedList<>();

    for (int i=0;i<numberOfLines;i++) {
      arr.add(new LinkedList<>());
    }

    for (int line = 0; line<numberOfLines;line++) {
      for (int i=0;i<=line;i++) {
        if (line == i || i==0) {
          arr.get(line).add(1);
        } else {
          arr.get(line).add(arr.get(line-1).get(i-1) + arr.get(line-1).get(i));
        }
        System.out.print(arr.get(line).get(i) + " ");
      }
      System.out.println();
    }
  }

  public static void challenge4() {

      //List<Integer> arr = Arrays.asList(4,3,7,8,6,2,1);
      List<Integer> arr = Arrays.asList(1,4,3,2);

      boolean conditie;

      do {
          conditie = true;
          for (int i=1;i<arr.size()-1;i++) {
              if (i%2==0) {
                  if (arr.get(i) > arr.get(i-1)) {
                      Collections.swap(arr,i,i-1);
                      conditie=false;
                  }
                  if (arr.get(i)>arr.get(i+1)) {
                      Collections.swap(arr,i,i+1);
                      conditie=false;
                  }
              } else {
                  if (arr.get(i) < arr.get(i-1)) {
                      Collections.swap(arr,i,i-1);
                      conditie=false;
                  }
                  if (arr.get(i) < arr.get(i+1)) {
                      Collections.swap(arr,i,i+1);
                      conditie=false;
                  }
              }
          }
      }while (!conditie);

      System.out.println(arr.toString());
  }

  public static void challenge5() {

      //List<Integer> first = Arrays.asList(1,5,6);
      //List<Integer> second = Arrays.asList(2,3,4);
      List<Integer> first = Arrays.asList(1,5,6,7,8,9);
      List<Integer> second = Arrays.asList(2,3,4);


      List<Integer> merged = new ArrayList<>(first);
      merged.addAll(second);

      Collections.sort(merged);

      System.out.println(merged.toString());
  }
}

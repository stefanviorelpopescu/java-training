package code._4_student_effort;

import code._4_student_effort.Challenge7.HashTable;
import code._4_student_effort.Challenge8.ArrayListCC;
import java.util.*;
import static java.util.Arrays.asList;

public class Main {

  public static void main(String[] args) {
      //TODO put your code changes in here
      //challenge1();
      //challenge2();
      //challenge3();
      //challenge4();
      //challenge5();
      //challenge7();
      challenge8();

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

  public static void challenge3() {

      List<List<Integer>> triangle = generate(7);
      for (List<Integer> row : triangle) {
          for (Integer cell : row) {
              System.out.print(cell + " ");
          }
          System.out.println();
      }
  }

  public static List<List<Integer>> generate(int n) {
      List<List<Integer>> triangle = new ArrayList<>();
      triangle.add(asList(1));
      for (int i = 1; i < n; i++) {
          List<Integer> rowFromAbove = triangle.get(i - 1);
          List<Integer> currentRow = new ArrayList<>();
          currentRow.add(rowFromAbove.get(i - 1));
          for (int j = 1; j <= i; j++) {
              currentRow.add(currentRow.get(j - 1) + rowFromAbove.get(j - 1));
          }

          triangle.add(currentRow);
      }
      return triangle;
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

    public static void challenge7() {
        HashTable<String, Integer> myHashTable = new HashTable<>();

        myHashTable.put("key1", 1);
        myHashTable.put("key2", 2);
        myHashTable.put("key3", 3);
        myHashTable.put("key4", 4);

        System.out.println(myHashTable.size());
    }

    public static void challenge8() {

        ArrayListCC<String> arrayListCC = new ArrayListCC<>();

        arrayListCC.add("hello");
        arrayListCC.add("world");

        System.out.println(arrayListCC.size());
        arrayListCC.remove("hello");
        System.out.println(arrayListCC.size());
        System.out.println(arrayListCC.get(0));
    }

}

package code._4_student_effort;

import code._4_student_effort.CodeChallenge7.MyHashTable;
import code._4_student_effort.CodeChallenge7.MyHashTableImplementation;
import code._4_student_effort.CodeChallenge8.MyArrayList;
import code._4_student_effort.CodeChallenge8.MyArrayListImplementation;
import code._4_student_effort.CodeChallenge9.MySet;
import code._4_student_effort.CodeChallenge9.MySetImplementation;
import code._4_student_effort.CodeChallenge9.SetException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


  public static void main(String[] args) throws SetException {

    System.out.println("Code challenge 1:");
    codeChallenge1();

    System.out.println("Code challenge 2:");
    codeChallenge2();

    System.out.println("Code challenge 3:");
    codeChallenge3();

    System.out.println("Code challenge 4:");
    codeChallenge4();

    System.out.println("Code challenge 5:");
    codeChallenge5();

    System.out.println("Code challenge 6:");
    codeChallenge6();

    System.out.println("Code challenge 7:");
    codeChallenge7();

    System.out.println("Code challenge 8:");
    codeChallenge8();

    System.out.println("Code challenge 9:");
    codeChallenge9();

  }

    /*////////////////////////////////////////////////////////////
   //////////////////// Code Challenge 1 ////////////////////////
  ////////////////////////////////////////////////////////////*/

  public static void codeChallenge1() {

    List<Integer> list = List.of(1, 4, 3, 2);
    List<Integer> list2 = List.of(9, 10, 11, 12);
    List<Integer> list3 = List.of(100, 10, 7, 8);


    System.out.println(getLeaders(list));
    System.out.println(getLeaders(list2));
    System.out.println(getLeaders(list3));

  }

  public static List<Integer> getLeaders(List<Integer> list) {

    List<Integer> leaders = new ArrayList<>();
    boolean isLeader = false;

    for (int i = 0; i < list.size() - 1; i++) {

      for (int j = i; j < list.size(); j++) {

        if (list.get(i) < list.get(j)) {
          isLeader = false;
          break;
        }

        if (j == i + 1) {
          isLeader = true;
        }
      }

      if (isLeader) {
        leaders.add(list.get(i));
      }
    }

    leaders.add(list.get(list.size() - 1));
    return leaders;
  }

    /*////////////////////////////////////////////////////////////
   //////////////////// Code Challenge 2 ////////////////////////
  ////////////////////////////////////////////////////////////*/

  public static void codeChallenge2() {

    int n = 5;
    int [][] matrix = new int[n + 1][n + 1];
    matrix[0][0] = 1;

    for(int i = 1; i <= n; i++) {

      for(int j = 0; j <= n; j++) {

        if(i != 0 && j != 0){
          matrix[i][j] = matrix[i-1][j-1] + matrix[i-1][j];
        }
      }

    }

    for(int i = 1; i <= n; i++) {

      for(int j = 1; j <= n; j++) {

        if(matrix[i][j] != 0) {
          System.out.print(matrix[i][j] + " ");
        }
      }

      System.out.println();
    }
  }

    /*////////////////////////////////////////////////////////////
   //////////////////// Code Challenge 3 ////////////////////////
  ////////////////////////////////////////////////////////////*/

  public static void codeChallenge3() {

    int n = 5;
    int [][] matrix = new int[n][n];
    matrix[0][0] = 1;

    for (int i = 1; i < n ; i++) {

      for(int j = 0; j <= i; j++) {

        if(j == 0) {
          matrix[i][j] = matrix[i - 1][i - 1];
        } else {
          matrix[i][j] = matrix[i][j-1] + matrix[i-1][j-1];
        }
      }

    }

    for (int i = 0; i < n; i++) {
      for(int j = 0; j <= i; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }

  }


  /*////////////////////////////////////////////////////////////
  //////////////////// Code Challenge 4 ////////////////////////
 ////////////////////////////////////////////////////////////*/


  public static void codeChallenge4() {

    List<Integer> list = new ArrayList<>(List.of(4, 3, 7, 8, 6, 2, 1));
    System.out.println(ZigZag(list));

    List<Integer> listOdd = new ArrayList<>(List.of(4, 3, 7, 8, 6, 2, 1, 10, 11));
    System.out.println(ZigZag(listOdd));

    List<Integer> list2 = new ArrayList<>(List.of(1, 4, 3, 2));
    System.out.println(ZigZag(list2));

    List<Integer> listEven = new ArrayList<>(List.of(1, 4, 3, 2, 6, 7));
    System.out.println(ZigZag(listEven));
  }

  public static List<Integer> ZigZag (List<Integer> list) {

    Collections.sort(list);

    if(list.size() % 2 != 0) {

      for(int i = 0; i < list.size() - 2; i += 2) {
        Collections.swap(list, i, i + 1);
      }

    } else {

      for(int i = 1; i < list.size() - 1; i += 2) {
        Collections.swap(list, i, i + 1);
      }

    }

    return list;
  }

   /*////////////////////////////////////////////////////////////
  //////////////////// Code Challenge 5 ////////////////////////
 ////////////////////////////////////////////////////////////*/

  public static void codeChallenge5() {

    List<Integer> sortedList1 = new ArrayList<>(List.of(1, 5, 6));
    List<Integer> sortedList2 = new ArrayList<>(List.of(2, 3, 4));
    List<Integer> mergedList = new ArrayList<>();

    mergedList.addAll(sortedList1);
    mergedList.addAll(sortedList2);
    Collections.sort(mergedList);

    System.out.println(mergedList);
  }

  /*////////////////////////////////////////////////////////////
  //////////////////// Code Challenge 6 ////////////////////////
 ////////////////////////////////////////////////////////////*/

  public static void codeChallenge6() {

    int i, j, k;

    int [][] matrix = {
            {1, 2, 3, 4},
            {12, 13, 14, 5},
            {11, 16, 15, 6},
            {10, 9, 8, 7}
    };

    int n = matrix.length;

    for(i = n - 1, j = 0; i > 0; i--, j++) {

      for(k = j; k < i; k++) {
        System.out.print(matrix[j][k] + ",");
      }

      for(k = j; k < i; k++) {
        System.out.print(matrix[k][i] + ",");
      }

      for(k = i; k > j; k--) {
        System.out.print(matrix[i][k] + ",");
      }

      for(k = i; k > j; k--) {
        System.out.print(matrix[k][j] + ",");
      }
    }

    int middle = (n - 1) / 2;

    if(n % 2 == 1) {
      System.out.print(matrix[middle][middle]);
    }

  }

   /*////////////////////////////////////////////////////////////
  //////////////////// Code Challenge 7 ////////////////////////
 ////////////////////////////////////////////////////////////*/

  public static void codeChallenge7() {

    MyHashTable<String, String> myHashTable = new MyHashTableImplementation<>();
    myHashTable.put("key1", "value 1");
    myHashTable.put("key2", "value 2");
    myHashTable.put("key3", "value 3");
    System.out.println(myHashTable.size());

  }

   /*////////////////////////////////////////////////////////////
  //////////////////// Code Challenge 8 ////////////////////////
 ////////////////////////////////////////////////////////////*/

  public static void codeChallenge8() {

    MyArrayList<String> myArrayList = new MyArrayListImplementation<>();
    myArrayList.add("value1");
    myArrayList.add("value2");
    myArrayList.add("value3");
    System.out.println(myArrayList.size());

  }

   /*////////////////////////////////////////////////////////////
  //////////////////// Code Challenge 9 ////////////////////////
 ////////////////////////////////////////////////////////////*/

  public static void codeChallenge9() throws SetException {

    MySet<Integer> mySet = new MySetImplementation<>();
    mySet.add(1);
    mySet.add(2);
    mySet.add(3);
    System.out.println(mySet.size());

  }



}

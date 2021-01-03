package code._4_student_effort;

import java.util.Arrays;

public class Main {
  static void CodeChallenge1(){
    Leaders lead = new Leaders();
    int[] arr = new int[]{16, 17, 4, 3, 5, 2};
    int n = arr.length;
    lead.printLeaders(arr, n);
  }
  static void CodeChallenge2(){
    int n = 5;
    PascalTriangle.printPascal(n);
  }
  static void CodeChallenge3(){
    int rows = 15;
    BellTriangle bt = new BellTriangle(rows);
    for (int i = 1; i <= 10; ++i) {
      System.out.print(bt.get(i, 0));
      for (int j = 1; j < i; ++j) {
        System.out.printf(", %d", bt.get(i, j));
      }
      System.out.println();
    }
  }
  static void CodeChallenge4(){
    int[] arr = new int[]{4, 3, 7, 8, 6, 2, 1};
    ZigZag.zigzag(arr);
    System.out.println(Arrays.toString(arr));
  }
  static void CodeChallenge5(){
    int[] arr1 = {1, 3, 5, 7};
    int n1 = arr1.length;

    int[] arr2 = {2, 4, 6, 8};
    int n2 = arr2.length;

    int[] arr3 = new int[n1+n2];

    MergeTwoSortedLists.mergeLists(arr1, arr2, n1, n2, arr3);

    System.out.println("Array after merging");
    System.out.print("[");
    for (int i=0; i < n1+n2-1; i++)
      System.out.print(arr3[i] + ",");
    System.out.print(arr3[n1+n2-1] + "]");
  }
  static void CodeChallenge6(){
    int R = 4;
    int C = 4;
    int a[][] = { { 1, 2, 3, 4},
            { 12, 13, 14, 5 },
            { 11, 16, 15, 6 },
            { 10, 9, 8, 7 } };

    // Function Call
    SpiralMatrix.spiralPrint(R, C, a);
  }
  static void CodeChallenge7(){
    MyHashTable myHashTable = new MyHashTableImpl();
    myHashTable.put("key1", "value1");
    myHashTable.put("key2", "value2");
    myHashTable.put("key3", "value3");
    System.out.println(myHashTable.size());
  }
  static void CodeChallenge8(){
    MyArrayList myArrayList = new MyArrayListImpl();
    myArrayList.add(1);
    myArrayList.add(2);
    myArrayList.add(3);
    System.out.println(myArrayList.size());
  }
  static void CodeChallenge9(){
    MySet mySet = new MySetImpl();
    mySet.add(1);
    mySet.add(2);
    mySet.add(3);
    System.out.println(mySet.size());
  }
  public static void main(String[] args) {
    //TODO put your code changes in here
    //CodeChallenge1();
    //CodeChallenge2();
    //CodeChallenge3();
    //CodeChallenge4();
    //CodeChallenge5();
    //CodeChallenge6();
    //CodeChallenge7();
    //CodeChallenge8();
    //CodeChallenge9();
  }
}

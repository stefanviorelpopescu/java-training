package code._4_student_effort;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    // Challenge 1
    doChallenge1();
    System.out.println();

    // Challenge 2
    printChallengeSeparator(2);
    doChallenge2();

    // Challenge 3
    printChallengeSeparator(3);
    doChallenge3();

    // Challenge 4
    printChallengeSeparator(4);
    doChallenge4();

    // Challenge 5
    printChallengeSeparator(5);
    doChallenge5();

    // Challenge 6
    printChallengeSeparator(6);
    doChallenge6();

    // Challenge 7
    printChallengeSeparator(7);
    //doChallenge7();

    // Challenge 8
    printChallengeSeparator(8);
    doChallenge8();

    // Challenge 9
    printChallengeSeparator(9);
    doChallenge9();
  }

  // Challenge 1 usage in main function
  private static void doChallenge1() {
    List<Integer> arr = Arrays.asList(3, 5, 9, 2, 4, 8, 7, 6); //9, 8, 7, 6 are leaders

    findLeaders(arr);
  }

  private static void findLeaders(List<Integer> arr) {
    Collections.reverse(arr);
    int max = Integer.MIN_VALUE;

    for(Integer cursor : arr) {
      if (cursor > max) {
        System.out.print(cursor + " ");
        max = cursor;
      }
    }
  }

  // Challenge 2 usage in main function
  private static void doChallenge2() {
    // Based on: https://en.wikipedia.org/wiki/Pascal%27s_triangle#Calculating_a_row_or_diagonal_by_itself
    int level = 10;

    createPascalTriangle(level);

    /*List<Integer> previousLevel = new ArrayList<>();

    for (int i = 0; i < level; i++) {
      List<Integer> currentLevel = generatePascalLevel(previousLevel);

      printLevel(currentLevel);

      previousLevel.clear();
      previousLevel.addAll(currentLevel);
    }*/
  }

  /*private static List<Integer> generatePascalLevel(List<Integer> previousLevel) {

  }

  private static void printLevel(List<Integer> currentLevel) {
    for (Integer number : currentLevel) {
      System.out.print(number + " ");
    }
    System.out.println();
  }*/

  private static void createPascalTriangle(int level) {
    for (int row = 1; row <= level; row++) {
      for (int i = 0; i < level-row; i++ ) System.out.print(" ");
      int point = 1;

      for (int j = 1; j <= row; j++) {
        System.out.print(point + " ");
        point = point * (row - j)/j;
      }
      System.out.println();
    }
  }

  // Challenge 3 usage in main function
  private static void doChallenge3() {
    int level = 5;
    createBellTriangle(level);
  }

  private static void createBellTriangle(int level) {
    if (level < 0) {
      throw new IllegalArgumentException("Input must be between greater than 0!");
    }

    /*
    int[][] bell = new int[level][level];
    bell[0][0] = 1;
    System.out.println(bell[0][0] + " ");

    for (int i = 1; i < level; i++) {
      // Explicitly fill for j = 0
      bell[i][0] = bell[i-1][i-1];
      System.out.print(bell[i][0] + " ");

      // Fill for remaining values of j
      for (int j = 1; j <= i; j++) {
        bell[i][j] = bell[i - 1][j - 1] + bell[i][j - 1];
        System.out.print(bell[i][j] + " ");
      }
      System.out.println();
    }*/

    List<Integer> previousLevel = new ArrayList<>( Arrays.asList(1) );
    printLevel(previousLevel);

    for (int i = 0; i < level; i++) {
      List<Integer> currentLevel = generateBellLevel(previousLevel);

      printLevel(currentLevel);

      previousLevel.clear();
      previousLevel.addAll(currentLevel);
    }
  }

  private static List<Integer> generateBellLevel(List<Integer> previousLevel) {
    List<Integer> currentLevel = new ArrayList<>();

    for (int i = 0; i < previousLevel.size()+1; i++) {
      if (i == 0) { // If this is first position of current level
        // Then copy last entry of previous level
        // Note that k'th level has k entries
        currentLevel.add(previousLevel.get(previousLevel.size()-1));
      } else { // If this is not first position of current level
        // Then this element is sum of previous element in current
        // level and the element just above the previous element
        currentLevel.add(currentLevel.get(i-1) + previousLevel.get(i-1));
      }
    }

    return currentLevel;
  }

  private static void printLevel(List<Integer> currentLevel) {
    for (Integer number : currentLevel) {
      System.out.print(number + " ");
    }
    System.out.println();
  }

  // Challenge 4 usage in main function
  private static void doChallenge4() {
    List<Integer> list = Arrays.asList(4, 3, 7, 8, 6, 2, 1); // 3 7 4 8 2 6 1
    System.out.println("Input:  " + list);
    zigZag(list);
    System.out.println("Output: " + list);
  }

  private static void zigZag(List<Integer> list) {
    for (int i = 0; i < list.size() - 1; i++) {
      checkPair(list, i);
    }
  }

  private static void checkPair(List<Integer> list, int i) {
    if (!numbersInCorrectOrder(list, i)) {
      Collections.swap(list, i, i+1);
    }
  }

  private static boolean numbersInCorrectOrder(List<Integer> list, int position) {
    if (position % 2 == 0) {
      return list.get(position) < list.get(position + 1);
    } else {
      return list.get(position) > list.get(position + 1);
    }
  }

  // Challenge 5 usage in main function
  private static void doChallenge5() {
    // Ex1
    List<Integer> list1 = Arrays.asList(1, 5, 6);
    List<Integer> list2 = Arrays.asList(2, 3, 4);

    System.out.print("Ex1: ");
    System.out.println(merge(list1, list2));

    //Ex 2
    List<Integer> list3 = Arrays.asList(1, 5, 6, 7, 8, 9);
    List<Integer> list4 = Arrays.asList(2, 3, 4);
    System.out.print("Ex2: ");
    System.out.println(merge(list3, list4));
  }

  private static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
    // Merged list
    List<Integer> list = new ArrayList<>();

    // Merge the two lists
    // Initialize indexes of first and second list
    int i = 0;
    int j = 0;

    while (i < list1.size() && j < list2.size()) {
      if (list1.get(i) <= list2.get(j)) {
        list.add(list1.get(i));
        i++;
      } else {
        list.add(list2.get(j));
        j++;
      }
    }

    // If there are remaining elements in list1 and list2, copy them
    while (i < list1.size()) {
      list.add(list1.get(i));
      i++;
    }

    while (j < list2.size()) {
      list.add(list2.get(j));
      j++;
    }

    return list;
  }

  // Challenge 6 usage in main function
  private static void doChallenge6() {
    int [][] matrix1 = new int [][] {
            {  1,  2,  3, 4 },
            { 12, 13, 14, 5 },
            { 11, 16, 15, 6 },
            { 10,  9,  8, 7 }
    };
    System.out.print("Example 1: ");
    printSpiralMatrix(matrix1);
    System.out.println();

    int [][] matrix2 = new int [][] {
            {  1,  2,  3,  4,  5,  6 },
            {  7,  8,  9, 10, 11, 12 },
            { 13, 14, 15, 16, 17, 18 }
    };
    System.out.print("Example 2: ");
    printSpiralMatrix(matrix2);
    System.out.println();
  }

  private static void printSpiralMatrix(int[][] inputMatrix) {
    int topRow = 0;
    int bottomRow = inputMatrix.length - 1;
    int leftColumn = 0;
    int rightColumn = inputMatrix[0].length - 1;

    while ((topRow <= bottomRow) && (leftColumn <= rightColumn)) {
      // Copy next topRow
      for (int i = leftColumn; i <= rightColumn; i++) {
        System.out.print(inputMatrix[topRow][i] + " ");
      }
      topRow++;

      // Copy the next right hand side column
      for (int i = topRow; i <= bottomRow; i++) {
        System.out.print(inputMatrix[i][rightColumn] + " ");
      }
      rightColumn--;

      if (topRow <= bottomRow) {
        for (int i = rightColumn; i >= leftColumn; i--) {
          System.out.print(inputMatrix[bottomRow][i] + " ");
        }
        bottomRow--;
      }

      if (leftColumn <= rightColumn) {
        for (int i = bottomRow; i >= topRow; i--) {
          System.out.print(inputMatrix[i][leftColumn] + " ");
        }
        leftColumn++;
      }
    }
  }

  // Challenge 7 usage in main function
  private static void doChallenge7() {
    // Stage 1 - only strings
    MyHashTable myHashTable = new MyHashTableImpl();
    myHashTable.put("key1", "value1");
    myHashTable.put("key2", "value2");
    myHashTable.put("key3", "value3");
    System.out.println(myHashTable.size()); // should print 3

    // Stage 2 - generic
  }

  // Challenge 8 usage in main function
  private static void doChallenge8() {
    MyArrayList<Integer> myArrayList = new MyArrayListImpl<>();

    for (int i = 0; i < 10; i++) {
      myArrayList.add(i);
    }

    myArrayList.set(9, 100);
    myArrayList.remove(5);

    System.out.print("Elements from my HashTable are:  ");
    for(int i = 0; i < myArrayList.size(); i++) {
        System.out.print(myArrayList.get(i) + " ");
    }

    System.out.println();
  }

  // Challenge 9 usage in main function
  private static void doChallenge9() {
    List<Integer> arr = List.of(1, 1, 2, 1, 3, 2);

    MySet<Integer> mySet = new MySetImpl<>();
    for (Integer i: arr) {
      mySet.add(i);
    }

    System.out.print("My set is:  ");
    for (int i = 0; i < mySet.size(); i++) {
      System.out.print(mySet.get(i) + " ");
    }
  }

  // Method for printing separator between challenges
  static private void printChallengeSeparator(int challengeNumber) {
    System.out.println("======================== Challenge " + challengeNumber +
            " ==================================");
  }
}

package code._4_student_effort;

import java.util.Arrays;

public class Main {

  public static void CodeChallenge1() {

    int[] arr = new int[] {1,2,3};
    ArrayCustomIterator it = new ArrayCustomIterator(arr);
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

  public static void CodeChallenge2() {

    Integer[] arr = new Integer[(int)(Math.random() +1)*100];
    for (int i=0;i<arr.length;i++) {
      arr[i] = (int)(Math.random()*100);
    }

    Integer[] copy01Arr = Arrays.copyOf(arr, arr.length);
    Integer[] copy02Arr = Arrays.copyOf(arr, arr.length);

    displaySorted(new BubbleSort(), copy01Arr);
    displaySorted(new MergeSort(), copy02Arr);
  }

  public static void CodeChallenge3() {

  }

  public static void CodeChallenge4() {

  }

  public static void main(String[] args) {
    //TODO put your code changes in here

    //CodeChallenge1();
    CodeChallenge2();
    //CodeChallenge3();
    //CodeChallenge4();
  }

  public static void displaySorted(SortingStrategy strategy, Integer[] arr) {

    strategy.sort(arr);
    System.out.println(Arrays.toString(arr));
  }
}

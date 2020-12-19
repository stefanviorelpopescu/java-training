package code._4_student_effort;

import code._4_student_effort.Challenge2.Boot;
import code._4_student_effort.Challenge2.Pair;
import code._4_student_effort.Challenge2.Running;
import code._4_student_effort.Challenge3.GenericList;
import code._4_student_effort.Challenge4.ArrayIterator;
import code._4_student_effort.Challenge4.IArrayIterator;
import code._4_student_effort.Challenge5.BinarySearch;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here
    //challenge2();
    //challenge3();
    //challenge4();
    challenge5();
  }

  public static void challenge2() {

    Running runningShoe1 = new Running("RED", 41);
    Running runningShoe2 = new Running("RED", 41);
    Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);

    // the following gives error, which is ok
    /*
    Running runningShoe3 = new Running("RED",41);
    Boot bootShoe = new Boot("BLACK", 45);
    Pair<Running> pairKO = new Pair<>(runningShoe3, bootShoe);
     */

    Running running5 = new Running("RED",41);
    Running running6 = new Running("RED", 42);
    Pair<Running> pairOK2 = new Pair<>(running5, running6);

  }

  public static void challenge3() {

    String rootValue = "a";
    GenericList<String> list = new GenericList<>(rootValue);

    for (int i = 1; i < 10; i++) {
      list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
    }

    list.println();
  }

  public static void challenge4() {

    Integer[] arr = new Integer[] {1,2,3};
    IArrayIterator<Integer> it = new ArrayIterator<>(arr);
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

  public static void challenge5() {

      Integer[] arr01 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      Integer[] arr02 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
      Integer[] arr03 = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};

      BinarySearch<Integer> list01 = new BinarySearch<>(arr01);
      BinarySearch<Integer> list02 = new BinarySearch<>(arr02);
      BinarySearch<Integer> list03 = new BinarySearch<>(arr03);   // throw exception because its not sorted

      System.out.println(list01.search(1));       // true
      System.out.println(list01.search(5));       // true
      System.out.println(list01.search(11));      // false
      System.out.println(list01.search(0));       // false
      System.out.println(list02.search(11));      // false
      System.out.println(list02.search(7));       // true
      System.out.println(list02.search(-2));      // false
  }
}

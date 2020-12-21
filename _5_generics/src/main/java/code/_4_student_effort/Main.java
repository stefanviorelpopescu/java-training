package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Main {
  static void CodeChallenge2(){
    Running runningShoe1 = new Running("RED", 41);
    Running runningShoe = new Running("BLACK", 45);
    Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe);
  }

  static void CodeChallenge3(){
    String rootValue = "a";
    GenericList<String> list = new GenericList<>(rootValue);
    for(int i = 1; i < 10; i++){
      list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
    }
    list.println();
  }

  static void CodeChallenge4(){
    Integer[] arr = new Integer[] {1, 2, 3};
    IArrayIterator<Integer> it = new ArrayIterator<>(arr);
    while (it.hasNext()) {
      System.out.println(it.next());
    }
  }

  static void CodeChallenge5(){
    GenericBinarySearch bs = new GenericBinarySearch();
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);

    int key = 2;
    int iMin = 0;
    int iMax = list.size()-1;

    int index = bs.search(list, key, iMin, iMax, (o1,o2) -> o1.compareTo(o2));
    System.out.println(index);
  }

  public static void main(String[] args) {
    //TODO put your code changes in here
    //CodeChallenge2();
    //CodeChallenge3();
    //CodeChallenge4();
    CodeChallenge5();
  }
}

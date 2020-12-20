package code._4_student_effort;

import code._4_student_effort.GenericIterator.ArrayIterator;
import code._4_student_effort.GenericIterator.IArrayIterator;
import code._4_student_effort.GenericList.GenericList;
import code._4_student_effort.Pairs.Pair;
import code._4_student_effort.Pairs.Running;

public class Main {

  public static void codeChallenge2()  {
    Running runningShoe1=new Running("Red",41);
    Running runningShoe2=new Running("Red",41);
    Pair<Running> pairOk=new Pair<>(runningShoe1,runningShoe2);

   // Running rShoe1=new Running("Red",41);
   // Boot bootShoe=new Boot("Black",45);
   // Pair<Running> pairKO=new Pair<>(rShoe1,bootShoe);
   Running runningShoe3 = new Running("RED", 41);
   Running runningShoe4 = new Running("RED", 42);
   Pair<Running> pair1 = new Pair<>(runningShoe3, runningShoe4);

  }
  public static void codeChallenge3(){
      String rootValue="a";
      GenericList<String> list=new GenericList<>(rootValue);
      for(int i=1;i<10;i++){
          list.insert(String.valueOf(Character.valueOf((char)(rootValue.charAt(0)+i))));
      }
      list.println();
  }
  public static void codeChallenge4(){
      Integer[] arr= new Integer[] {1,2,3};
      IArrayIterator<Integer> it = new ArrayIterator<>(arr);
      while(it.hasNext()){
          System.out.println(it.next());
      }
  }
  public static void codeChallenge5(){
      BinarySearch<Integer> b=new BinarySearch();
      Integer[] list01 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      Integer[] list02 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    int n=list01.length;
    int n2=list02.length;

     // System.out.println(b.genericBinarySearch(list02, 0,n2-1,-30) == false);
      System.out.println(b.genericBinarySearch(list01, 0,n-1,30) == false);
      //System.out.println(b.genericBinarySearch(list02, 0,n2-1,30) == false);
      for (int i = 1; i <= 10; i++) {
         System.out.println(b.genericBinarySearch(list01,0,n-1, i) == true);
        // System.out.println(b.genericBinarySearch(list02,0,n2-1, i) == true);
      }
  }

  public static void main(String[] args) {
  // codeChallenge2();
   //codeChallenge3();
      //codeChallenge4();
      codeChallenge5();
  }
}

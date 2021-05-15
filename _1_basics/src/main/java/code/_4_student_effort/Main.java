package code._4_student_effort;
//import java.sql.SQLOutput;

public class Main {

  public static void main(String[] args)
  {
      //Challenge 1
     Challenge1.display();

      //Challenge 2
      System.out.println(Challenge2.compute(53));
      System.out.println(Challenge2.compute2(105));

      //Challenge 3
      int[] array=new int[] {1,1,0,-1,-1};
      System.out.println(Challenge3.NrofPairs(array));

      //Challenge4
      int [] v=new int[] {-1,-1,-1,-1,3,2};
      System.out.println(Challenge4.Pairof3(v));

  }
}

package code._3_in_class;

class C1
{public static int i1=1;}
 class C2 extends C1
 {
     public static int i2=2;
     public static void m()
     {
         //System.out.println(super.i1);
     }
 }

public class Main  {

  public static void main(String[] args) {
      System.out.println(C1.i1);
      System.out.println(C2.i1);
      System.out.println(C2.i2
      );
  }
}
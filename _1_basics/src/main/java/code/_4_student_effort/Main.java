package code._4_student_effort;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {

  public static void main(String[] args){
    //Ex1
    System.out.println("FizzBuzz");

        for (int i=1; i<100; i++) {
          if (i%3==0 && i%5==0) System.out.print("FizzBuzz,");
          else if (i%5==0) System.out.print("Buzz,");
          else if (i%3==0) System.out.print(" Fizz,");
          else if (i%7==0) System.out.print("Rizz,");
          else if (i%11==0) System.out.print("Jazz,");
          else System.out.print( i+ ",");
        }
    System.out.println("\n");

    //Ex2
    System.out.println("FooBarQix");

    for (int j=1; j<100; j++) {
      System.out.print(j + " => " + compute(j));

      System.out.print(compute2(j));
      System.out.println("\n");
    }

<<<<<<< HEAD
    //Ex3.0
    System.out.println("Pairof2 v1.0");
=======
    //Ex3
    System.out.println("Pairof2");
>>>>>>> 9281312357dade82161b9109fc3f4c8c157eb127
    System.out.println("Dimeniune matrice: ");
    Exercitiul3 sm = new Exercitiul3();

    int[] Array = sm.returnSArray();
    int finalCount = sm.returnCount(Array);
    System.out.println("Petrechi: " +finalCount);
<<<<<<< HEAD
    //Ex3.1
    System.out.println("Pairof2 v1.1");
        int[] array=new int[6];
        int pairs=0;
        array[0]=1;
        array[1]=1;
        array[2]=0;
        array[3]=-1;
        array[4]=-1;
        array[5]=10;
        for(int i=0;i<array.length-1;i++)
          for(int j=i+1;j<array.length;j++)
            if(array[i]+array[j]==0)
            {
              pairs++;
              array[j]=Integer.MAX_VALUE;
              j=array.length;
            }
        System.out.println("Numarul de perechi este:"+pairs);
      //Ex4
    int[] array1=new int[6];
    int pairs1=0;
    array[0]=-1;
    array[1]=-1;
    array[2]=-1;
    array[3]=2;

    for(int i=0;i<array1.length-2;i++)
      for(int j=i+1;j<array1.length-1;j++)
        for(int k=j+1;k<array1.length;k++)
          if(array1[i]+array1[j]+array1[k]==0)
          {
            pairs1++;
            array1[j]=Integer.MAX_VALUE;
            array1[k]=Integer.MAX_VALUE;
            j=array1.length-1;
            k=array1.length;
          }

    System.out.println("Numarul de perechi este:"+pairs1);
=======
>>>>>>> 9281312357dade82161b9109fc3f4c8c157eb127

      }

      //Ex2
        public static String compute(int j) {
          String s = "";
          if (j % 3 == 0) s += "Foo";
          if (j % 5 == 0) s += "Bar";
          if (j % 7 == 0) s += "Qix";
          char[] digits = String.valueOf(j).toCharArray();
          for (char digit : digits) {

            if (digit == '3') s += "Foo";
            if (digit == '5') s += "Bar";
            if (digit == '7') s += "Qix";
            return s;
          }
          if (s.isEmpty()) {
            s = String.valueOf(j);
          }
          return s;
        }

  public static String compute2(int i) {
    String s = "";

    boolean isDivisible = false;
    if (i % 3 == 0) {
      s += " divisible by 3";
      isDivisible = true;
    }
    if (i % 5 == 0) {
      s += " divisible by 5";
      isDivisible = true;
    }
    if (i % 7 == 0) {
      s += "divisible by 7";
      isDivisible = true;
    }

    char[] digits = String.valueOf(i).toCharArray();
    for (char digit : digits) {

      if (digit == '3') s += " ,contains 3";
      else if (digit == '5') s += " ,contains 5";
      else if (digit == '7') s += " ,contains 7";
      else if (digit == '0') s += " * ";
      else if (!isDivisible) s += digit;
    }

    return s;
  }

<<<<<<< HEAD
  //Ex3 v1.0
=======
  //Ex3
>>>>>>> 9281312357dade82161b9109fc3f4c8c157eb127
  public static class Exercitiul3 {

    private int[] returnSArray() {
      Scanner sc = new Scanner(System.in);

      int dimArray = sc.nextInt();
      int[] Array = new int[dimArray];
      

      for (int i = 0; i <= dimArray - 1; i++) {
        System.out.print("\n x= ");
        Array[i] = sc.nextInt();
      }
      sc.close();
      return Array;
    }

    private int returnCount(int[] Array) {
      int count = 0;
      Set<Integer> Elements = new HashSet<>();
      for (int i : Array) {
        if (Elements.contains(i)) {
          count++;
          Elements.remove(i);
        } else {
          Elements.add(i);
        }
      }
      return count;
    }
  }
}


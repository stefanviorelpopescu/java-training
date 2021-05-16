package code._4_student_effort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    challenge1();
    compute(30);
   challenge3();
    challenge4();
  }
  static void challenge1()
  {
    boolean ok=false;
    String trei=new String("Fizz");
    String cinci=new String("Buzz");
    String treicinci=new String("FizzBuzz");
    for(int i=1; i<100; i++)
    {

      if(i%3==0) {

      //  ok = true;
        System.out.println(trei);
        i+=1;
      }

      if(i%5==0) {
       // ok=true;
        System.out.println(cinci);
        i+=1;
      }

      if(i%15==0){
       // ok=true;
        System.out.println(treicinci);
       // i+=1;
      }
      System.out.println(i);

    }
  }
  static String compute(int i){
    String s = "";

    boolean ok = false;
    if (i % 3 == 0) {
      s += "Foo";
      ok = true;
    }
    if (i % 5 == 0) {
      s += "Bar";
      ok = true;
    }
    if (i % 7 == 0) {
      s += "Qix";
      ok = true;
    }

    char[] digits = String.valueOf(i).toCharArray();
    for (char digit : digits) {

      if (digit == '3') s += "Foo";
      else if (digit == '5') s += "Bar";
      else if (digit == '7') s += "Qix";
      else if (digit == '0') s += "*";
      else if (!ok) s += digit;
    }

    return s;
  }
  static void challenge3(){
    int n;
    int count = 0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of numbers: ");
    n = sc.nextInt();
    int[] array = new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<n; i++)
    {
      array[i]=sc.nextInt();
    }
    Arrays.sort(array);
    int res = 0;
    int i = 0;

    while (i < n) {
      int number = array[i];
       count = 1;
      i++;

      while (i < n && array[i] == number) {
        count++;
        i++;
      }

      if (count == 2) {
        res = res + count / 2;
      }
    }
    System.out.println("The number of pairs is: "+count);
  }
  static void challenge4(){
    int n;
    int count = 0;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of numbers: ");
    n = sc.nextInt();
    int[] array = new int[n];
    int[] seen =new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<n; i++)
    {
      array[i]=sc.nextInt();
    }
    for(int i=0; i<n; i++)
    {
      seen[i]=0;
    }
    Arrays.sort(array);
    int res = 0;
    int i = 0;

    while (i < n) {
      int number = array[i];
      count = 1;
      i++;

      while (i < n && array[i] == number) {
        count++;
        i++;
      }

      if (count >= 3) {
        res = res + count / 2;
      }
    }
    System.out.println("The number of pairs is: "+count);
  }
}



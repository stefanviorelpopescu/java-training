package code._4_student_effort;
import code._2_challenge._1_fizzbuzz.FizzBuzz;
import code._2_challenge._2_foobarqix.FooBarQix;
import code._2_challenge._3_pair_of_2.PairOf2;
import code._2_challenge._4_pair_of_3.PairOf3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here

    //Code Challenge 1 - FlizzBuzz - Stage 1
    System.out.println("Code Challenge 1 - FlizzBuzz - Stage 1");
    FizzBuzz x = new FizzBuzz();
    for (int i=1;i<=100;i++)
        System.out.println(x.fizzBuzz(i));

    //Code Challenge 1 - FlizzBuzz - Stage 2
    System.out.println("\nCode Challenge 1 - FlizzBuzz - Stage 2");
    FizzBuzz z = new FizzBuzz();

    List<String> myList = new ArrayList<>();
    for (int i = 1; i <= 100; i++) {
      if (i % 7 == 0)
          myList.add("Rizz");
      else
          if(i%11 == 0)
            myList.add("Jazz");
        else {
              String t = z.fizzBuzz(i);
              myList.add(t);
        }
    }
    for(String s:myList) {
      System.out.println(s);
    }

    //Code Challenge 2 - FooBarQuix - Stage 1
    System.out.println("\nCode Challenge 2 - FooBarQuix - Stage 1");
    FooBarQix f1 = new FooBarQix();
    for(int i=1;i<=53;i++)
        System.out.println(f1.compute(i));

    //Code Challenge 2 - FooBarQuix - Stage 1
    System.out.println("\nCode Challenge 2 - FooBarQuix - Stage 2");
    FooBarQix f2 = new FooBarQix();
    System.out.println(f2.compute2(101));
    System.out.println(f2.compute2(303));
    System.out.println(f2.compute2(105));
    System.out.println(f2.compute2(10101));

    //Code Challenge 3 - Pair Of 2
    System.out.println("\nCode Challenge 3 - Pair Of 2");
    Integer a[]={3,2,-3,-2,3,0};
    Integer b[]={1,1,0,-1,-1};
    Integer c[]={5,9,-5,7,-5};
    //List<int[]> myArraysList = new ArrayList<int[]>(Arrays.asList(a,b,c));
    PairOf2 p = new PairOf2();
    System.out.println(p.countPairs(a));
    System.out.println(p.countPairs(b));
    System.out.println(p.countPairs(c));

    //Code Challenge 4 - Pair of 3
    System.out.println("\nCode Challenge 4 - Pair of 3");
    PairOf3 p3 = new PairOf3();
    Integer array[]={-1,-1,-1,2};
    int sum=0;
    for(int i=0;i<array.length;i++) {
        sum = sum + array[i];
    }
      System.out.println(p3.countPairs(array,sum));

  }
}

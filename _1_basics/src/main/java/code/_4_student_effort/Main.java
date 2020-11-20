package code._4_student_effort;
import java.util.Scanner; // used for reading from console

import static code._4_student_effort.FizzBuzz.fizzBuzz3; //import needed method
import static code._4_student_effort.FooBarQixStar.compute3; //import needed method
import static code._4_student_effort.PairOf2.countPairsOf2; //import needed method
import static code._4_student_effort.PairOf3.countPairsOf3; //import needed method

public class Main {

  public static void show_pairs() // function to request arrays as console input
                                  //  and to print the number of pairs in every array
  {
    System.out.println("Enter the number of pairs u want: ");
    Scanner in = new Scanner(System.in);

    int n = in.nextInt();
    for(int j =1 ; j <= n; j++) {

        System.out.println("Enter the length of the array: ");
        int length_arr = in.nextInt();
        Integer [] array = new Integer[length_arr]; // allocate space for the array

            for (int k = 0; k < length_arr; k++) {
                array[k] = in.nextInt(); // populate the array
              }

        int no_pairs = countPairsOf2(array); //call countPairsOf2 function
     // int no_pairs = countPairsOf3(array); //call countPairsOf3 function
        System.out.println("Number of pairs:" + no_pairs);

    }

  }

  public static void main(String[] args) {

    //called the static methods created

    //for(int j = 1; j<150;j++)
      //System.out.println(j + ": " + fizzBuzz3(j)); //print all numbers 1-150
      //System.out.println(j + ": " + compute3(j)); //print all numbers 1-150
      
      //show_pairs(); // calling the show_pairs function

  }
}

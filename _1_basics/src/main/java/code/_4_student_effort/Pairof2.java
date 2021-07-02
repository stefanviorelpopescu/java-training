package code._4_student_effort;

import java.util.Arrays;
import java.util.Scanner;

public class Pairof2 {
    public static void main(String args[]) {
        int[] arr = {-2,-3,5,-7,-8,4,4};

      /*  Scanner s = new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        int length = s.nextInt();
        int[] myArray = new int[length];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < length; i++) {
            myArray[i] = s.nextInt();
        }*/
        pairof2(arr);
    }

    public static void pairof2(int[] arr) {

        int count = 0; // Initialize result
        Arrays.sort(arr);
        System.out.println(arr.length);
        int [] freq = new int[arr.length];
       for (int i=0;i< arr.length;i++){
            freq[i]=0;
        }


        System.out.println(Arrays.toString(arr));
        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = i + 1; j < arr.length; j++) {

                    if ((arr[i] + arr[j]) == 0 && freq[i] != 1 && freq[j] != 1) {
                        count++;
                        //    System.out.println(arr[i] + " " + arr[j]);
                        freq[i] = 1; //marcam perechea ca fiind deja folosita
                        freq[j] = 1;
                   //     System.out.println(arr[i]+" " +arr[j]);
                    }

            }
            System.out.printf("Number of pairs is %d", count);
    }
}
package code._4_student_effort.challenge1;

import java.util.Scanner;

public class ArrayCustomIterator {


    boolean hasNext() {
        return this.i < this.arr.length;
    }

    int next() {
        return this.arr[this.i++];
    }

    private ArrayCustomIterator(int[] arr) {
        this.arr = arr;
    }


    public static void main(String[] args) {
        System.out.print("Insert array length: ");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] arr = new int[len];

        System.out.println("Insert your array elements: ");
        for(int i = 0; i < len; i++) {
            arr[i] = in.nextInt();
        }

        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

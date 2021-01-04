package code._4_student_effort._9_myset;

import java.util.Collection;
import java.util.List;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "----Code Challenge 9----" + ANSI_RESET );


        Collection<Integer> list = List.of(1, 1, 2, 1, 3, 2, 4, 6, 3, 3);

        MySet<Integer> mySet = new MySetImpl<>();
        for(Integer i: list) {
            mySet.add(i);
        }

        for(int i = 0; i < mySet.size(); i++) {
            System.out.print(mySet.get(i) + " ");
        }
     }
}

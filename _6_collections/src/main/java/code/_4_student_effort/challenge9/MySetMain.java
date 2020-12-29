package code._4_student_effort.challenge9;

import java.util.Collection;
import java.util.List;

public class MySetMain {
    public static void main(String[] args) {
        Collection<Integer> stuff = List.of(1, 2, 3, 4);

        MySet<Integer> mySet = new MySetImpl<>();
        for(Integer i: stuff) {
            mySet.add(i);
        }

        for(int i = 0;i < mySet.size();i++) {
            System.out.println(mySet.get(i));
        }
    }
}

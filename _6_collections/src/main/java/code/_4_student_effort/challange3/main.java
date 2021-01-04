package code._4_student_effort.challange3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        bell(10);
    }

    public static void bell(int max) {
        List<List<Integer>> bell = new ArrayList<>();
        bell.add(Collections.singletonList(1));
        for (int i = 1; i < max; i++) {
            List<Integer> previous = bell.get(i - 1);
            List<Integer> current = new ArrayList<>();
            current.add(previous.get(i - 1));
            for (int j = 1; j <= i; j++) {
                current.add(current.get(j - 1) + previous.get(j - 1));
            }
            bell.add(current);
        }
        for(List<Integer> row : bell){
            for(Integer cell : row){
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

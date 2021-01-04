package code._4_student_effort.challange5;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class main {
    public static void main(String[] args) {

        List<Integer> list1 = asList(1, 2, 3, 4, 5);
        List<Integer> list2 = asList(3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(merge(list1, list2));

    }

    public static List<Integer> merge(List<Integer> list1, List<Integer> list2) {
        List<Integer> mergedList = new ArrayList<>();
        int i1 = 0;
        int i2 = 0;
        while (list1.size() != i1 || list2.size() != i2) {
            if (list1.size() == i1) {
                mergedList.add(list2.get(i2));
                i2++;
            } else if (list2.size() == i2) {
                mergedList.add(list1.get(i1));
                i1++;
            } else if (list1.get(i1) >= list2.get(i2)) {
                mergedList.add(list2.get(i2));
                i2++;
            } else {
                mergedList.add(list1.get(i1));
                i1++;
            }
        }
        return mergedList;
    }
}

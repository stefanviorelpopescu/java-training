package code._4_student_effort.challenge5;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.asList;

public class MergeSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = asList(1, 5, 6);
        List<Integer> list2 = asList(2, 3, 4);

        System.out.println(mergeLists(list1, list2));
    }

    private static List<Integer> mergeLists(List<Integer> firstList, List<Integer> secondList) {
        List<Integer> list = new ArrayList<>();
        int size1 = firstList.size();
        int size2 = secondList.size();
        int firstIterator = 0, secondIterator = 0, k = 0;

        while(firstIterator < size1 && secondIterator < size2) {
            if(firstList.get(firstIterator) < secondList.get(secondIterator)) {
                list.add(firstList.get(firstIterator++));
            } else {
                list.add(secondList.get(secondIterator++));
            }
        }

        while(firstIterator < size1)
            list.add(firstList.get(firstIterator++));

        while(secondIterator < size2)
            list.add(secondList.get(secondIterator++));

        return list;
    }
}

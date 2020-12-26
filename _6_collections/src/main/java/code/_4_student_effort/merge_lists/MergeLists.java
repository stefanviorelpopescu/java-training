package code._4_student_effort.merge_lists;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class MergeLists {

    public static void main(String[] args) {
        List<Integer> list1 = asList(1,4,7,19,23);
        List<Integer> list2 = asList(1,5,8,21,27,60,512);

        List<Integer> mergedList = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
        Collections.sort(mergedList);


        Iterator<Integer> iterator = mergedList.iterator();

        while ( iterator.hasNext())
            System.out.print(iterator.next() +  " ");
    }
}

package code._4_student_effort.leaders;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class leaders_ex {

    public static void main(String[] args) {
        List<Integer>  integerList = Arrays.asList(6,9,1,2,7,8,3,8,0,3,5);

        checkLeaders(integerList);
    }

    private static void checkLeaders(List<Integer> integerList) {
        List<Integer> leaders = new ArrayList<>();

        for ( int i = 0; i < integerList.size(); i++) {
            boolean isLeader = true;
            for ( int j = i + 1; j < integerList.size(); j++)
                if (integerList.get(i) <= integerList.get(j)) {
                    isLeader = false;
                    break;
                }
            if(isLeader)
                leaders.add(integerList.get(i));
        }

        Iterator<Integer> iterator = leaders.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

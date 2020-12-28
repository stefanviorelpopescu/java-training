package code._4_student_effort;

import java.util.*;

public class MergeSort {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,5,6,7,8,9));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(2,3,4));
        List<Integer> combinedList = new ArrayList<>();

        int i=0,j=0;

        while(i<list1.size() && j<list2.size()){
            if(list1.get(i)<list2.get(j)){
                combinedList.add(list1.get(i));
                i++;
            }
            else{
                combinedList.add(list2.get(j));
                j++;
            }
        }

        while(i<list1.size()){
            combinedList.add(list1.get(i));
            i++;
        }
        while(j<list2.size()){
            combinedList.add(list2.get(j));
            j++;
        }

        for(int x=0; x<combinedList.size(); x++)
            System.out.print(combinedList.get(x) + " ");

    }
}

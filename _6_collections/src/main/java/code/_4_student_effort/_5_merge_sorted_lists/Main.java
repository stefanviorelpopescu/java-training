package code._4_student_effort._5_merge_sorted_lists;

import java.util.ArrayList;
//import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "----Code Challenge 5----" + ANSI_RESET );

        List<Integer> sortedList1 = new ArrayList<>(List.of(4, 5, 9, 10, 14, 15, 16, 20, 28, 29, 37));
        List<Integer> sortedList2 = new ArrayList<>(List.of(3, 6, 10, 11, 12, 12, 13, 14, 16, 19));

        System.out.print(ANSI_RED + "First list: " + ANSI_RESET );
        System.out.println(sortedList1);

        System.out.print(ANSI_RED + "Second list: " + ANSI_RESET );
        System.out.println(sortedList2);

        System.out.print(ANSI_RED + "Merged lists: " + ANSI_RESET );
        List<Integer> resultList = merge(sortedList1, sortedList2);
        System.out.println(resultList);

//        Comparator<Integer> cmp = Integer::compareTo;
//        System.out.print(ANSI_RED + "Merged lists: " + ANSI_RESET );
//        sortedList1.addAll(sortedList2);
//        sortedList1.sort(cmp);
//        System.out.println(sortedList1);    Using collections method

    }

    public static List<Integer> merge (List<Integer> list1 , List<Integer> list2) {
        List<Integer> resultList = new ArrayList<>();

        int i = 0, j = 0;
        while (!(i == list1.size() && j == list2.size())) {

                if (i == list1.size()) {
                    for (; j < list2.size() ; j++) {
                        resultList.add(list2.get(j++));
                    }
                }

                else if (j == list2.size()) {
                    for (; i < list1.size() ; i++){
                        resultList.add(list1.get(i));
                    }
                }


                else if (list1.get(i) < list2.get(j)) {
                    resultList.add(list1.get(i++));
                }
                else if (list1.get(i) > list2.get(j)){
                    resultList.add(list2.get(j++));
                }
                else if (Objects.equals(list1.get(i), list2.get(j))) {
                    resultList.add(list1.get(i));
                    i++; j++;
                }
            }
        return resultList;
    }
}


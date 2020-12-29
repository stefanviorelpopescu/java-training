package code._4_student_effort.challenge4;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ZigZag {
    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(4, 3, 7, 8, 6, 2, 1);

        zigzag(arr);

        for (Integer integer : arr) {
            System.out.print(integer + " ");
        }
    }

    private static List<Integer> zigzag(List<Integer> list) {
        boolean flag = true;
        int temp;

        for (int i = 0; i <= list.size() - 2; i++) {
            if (flag && list.get(i) > list.get(i + 1)) {
                temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
            } else if (list.get(i) < list.get(i + 1)) {
                temp = list.get(i);
                list.set(i, list.get(i + 1));
                list.set(i + 1, temp);
            }

            flag = !flag;
        }

        return list;
    }
}

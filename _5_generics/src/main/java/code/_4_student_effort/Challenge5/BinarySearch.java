package code._4_student_effort.Challenge5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch<T extends Comparable> {

    private List<T> list = new ArrayList<>();

    public BinarySearch(T[] list) {
        this.list.addAll(Arrays.asList(list));

        try {
            isSorted();
        }catch (ArrayNotSortedException e) {
            e.printStackTrace();
        }
    }

    public boolean search(T elem) {

        int left = 0;
        int right = list.size()-1;

        if (isSortedAsc()) {
            while (left <= right) {
                int mid = left + (right - 1) / 2;

                if (list.get(mid).compareTo(elem) == 0) {
                    return true;
                }

                if (list.get(mid).compareTo(elem) == -1) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        } else if (isSortedDesc()) {
            while (left <= right) {
                int mid = left + (right - 1) / 2;

                if (list.get(mid).compareTo(elem) == 0) {
                    return true;
                }

                if (list.get(mid).compareTo(elem) == 1) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }

        return false;
    }

    private void isSorted() throws ArrayNotSortedException {
        if (!isSortedAsc() && !isSortedDesc()) {
            throw  new ArrayNotSortedException("Array not sorted");
        }
    }

    private boolean isSortedAsc() {
        for (int i=0;i<list.size()-1;i++) {
            if (list.get(i).compareTo(list.get(i+1)) > 0) {
                return false;
            }
        }

        return true;
    }

    private boolean isSortedDesc() {
        for (int i=0;i<list.size()-1;i++) {
            if (list.get(i).compareTo(list.get(i+1)) < 0) {
                return false;
            }
        }

        return true;
    }

    public int getSize() {
        return list.size();
    }

}

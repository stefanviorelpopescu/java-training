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

        for (T i : list) {
            if (i.compareTo(elem) == 0) {
                return true;
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

}

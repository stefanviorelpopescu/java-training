package code._4_student_effort._1_challengeOne;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class ArrayCustomIterator {
    private ArrayList<Integer> list;
    private int pointer;

    public ArrayCustomIterator(ArrayList<Integer> list) {
        this.list = list;
        this.pointer = 0;
    }

    public boolean hasNext() {
        return pointer < list.size();
    }

    public int next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int val = list.get(pointer);
        pointer += 1;

        return val;
    }
}

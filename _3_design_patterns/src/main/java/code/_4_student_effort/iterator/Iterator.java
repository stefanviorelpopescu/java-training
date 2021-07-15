package code._4_student_effort.iterator;

import code._2_challenge._1_iterator.ArrayCustomIterator;

public class Iterator {
    private int[] array;
    private int index;

    public Iterator() {
    }

    public Iterator(int[] array, int index) {
        this.array = array;
        this.index = index;
    }

    public boolean hasNext() {

        return this.index < this.array.length;
    }

    public int next() {

        return this.array[this.index++];
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        ArrayCustomIterator iterator = new ArrayCustomIterator(array);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

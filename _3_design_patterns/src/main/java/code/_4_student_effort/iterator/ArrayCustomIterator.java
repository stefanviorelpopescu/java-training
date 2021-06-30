package code._4_student_effort.iterator;

public class ArrayCustomIterator {
    private int position;
    private int[] array;

    public ArrayCustomIterator(int[] array) {
        this.array = array;
        this.position = 0;
    }

    public boolean hasNext() {
        return (position < array.length);
    }

    public int next() {
        return array[position++];
    }
}

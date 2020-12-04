package code._4_student_effort;

public class ArrayCustomIterator {

    int[] list;
    int position = 0;

    public ArrayCustomIterator(int[] list) {
        this.list = list;
    }

    public boolean hasNext() {
        return (position < list.length);
    }

    public int next() {
        return list[position++];
    }

}

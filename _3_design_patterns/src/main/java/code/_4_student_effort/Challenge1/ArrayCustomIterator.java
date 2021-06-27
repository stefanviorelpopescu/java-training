package code._4_student_effort.Challenge1;

public class ArrayCustomIterator {
    private int[] array;
    private int idx;

    public ArrayCustomIterator(int array[]) {
        this.array = array;
        this.idx = 0;
    }

    public boolean hasNext() {
        return this.idx < this.array.length;
    }

    public int next() {
        return this.array[this.idx++];
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

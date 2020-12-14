package code._4_student_effort;

public class ArrayCustomIterator {
    private int[] arr;
    private int indexCurent;

    ArrayCustomIterator(int arr[]) {
        this.arr = arr;
        this.indexCurent = 0;
    }

    public boolean hasNext() {
        return this.indexCurent < this.arr.length;
    }
    public int next() {
        return this.arr[indexCurent++];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};

        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

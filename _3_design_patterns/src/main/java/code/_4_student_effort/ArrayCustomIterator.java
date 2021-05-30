package code._4_student_effort;

public class ArrayCustomIterator {
    private int[] arr;
    private int currentIndex;

    public ArrayCustomIterator(int arr[]) {
        this.arr = arr;
        this.currentIndex = 0;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public boolean hasNext() {
        return this.currentIndex < this.arr.length;
    }

    public int next() {
        return this.arr[this.currentIndex++];
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

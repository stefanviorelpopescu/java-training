package code._4_student_effort._1_challenge_iterator;

public class ArrayCustomIterator {
    int currentIndex;
    int[] arr;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        this.currentIndex = 0;
    }

    boolean hasNext(){
        return currentIndex < arr.length;
    }

    int next() {
        return arr[currentIndex++];
    }
}

package code._4_student_effort;

public class ArrayCustomIterator {
    private int[] arr;
    private int index;

    public ArrayCustomIterator(int arr[]){
        this.arr = arr;
        this.index = 0;
    }

    public boolean hasNext(){
        return this.index < this.arr.length;
    }

    public int next(){
        return this.arr[this.index++];
    }

}

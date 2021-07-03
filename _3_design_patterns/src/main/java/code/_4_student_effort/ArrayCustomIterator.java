package code._4_student_effort;

public class ArrayCustomIterator {
    private int[] array;
    private int arrayIndex;
    public ArrayCustomIterator(int[] array){
        this.array = array;
        this.arrayIndex = 0;
    }
    boolean hasNext(){
        return this.arrayIndex<this.array.length;
    };
    int next(){
        return this.array[this.arrayIndex++];
    }

    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

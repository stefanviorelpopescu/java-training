package code._4_student_effort;

public class ArrayCustomIterator {
    int[] array;
    int index;

    ArrayCustomIterator(int[] array){
        this.array = array;
        this.index = 0;
    }

    boolean hasNext(){
        return index < array.length;
    }

    int next(){
        return array[index++];
    }
}

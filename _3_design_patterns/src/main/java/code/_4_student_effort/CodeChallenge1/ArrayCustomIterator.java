package code._4_student_effort.CodeChallenge1;

public class ArrayCustomIterator {

    private int[] array;
    private int index;

    public ArrayCustomIterator(int[] array){

        this.array = array;
        this.index = 0;
    }

    public boolean hasNext(){

        return index < array.length;
    }

    public int next(){

        if(this.hasNext()) {
            return array[index++];
        }
        return 0;
    }

}

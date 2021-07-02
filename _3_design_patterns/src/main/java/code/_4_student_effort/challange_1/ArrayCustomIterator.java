package code._4_student_effort.challange_1;

public class ArrayCustomIterator {
    private int[] list;
    private int position;
    public ArrayCustomIterator(int[] list){
        this.list = list;
        position = 0;
    }

    public boolean hasNext(){
        return position < list.length;
    }

    public int next(){
        return list[position++];
    }

}

package code._4_student_effort.iterator;

public class Test {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(array);
        while(it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }
}

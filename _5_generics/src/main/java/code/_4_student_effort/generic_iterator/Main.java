package code._4_student_effort.generic_iterator;

public class Main {
    public static void main (String[] args){
        Integer[] arr = new Integer[] {1,2,7000};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}

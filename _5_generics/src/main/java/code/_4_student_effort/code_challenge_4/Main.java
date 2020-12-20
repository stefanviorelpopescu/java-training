package code._4_student_effort.code_challenge_4;

public class Main {
    public static void main(String[] args){
        Integer[] array = new Integer[] {1,2,3};

        IArrayIterator<Integer> it = new ArrayIterator<>(array);
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

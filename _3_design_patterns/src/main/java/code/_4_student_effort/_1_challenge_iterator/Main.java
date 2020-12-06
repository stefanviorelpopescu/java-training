package code._4_student_effort._1_challenge_iterator;

public class Main {
    //Declaration for text output color//
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void CodeChallenge(){
        int[] arr = new int[] {1, 2, 3, 4, 5, 8};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        System.out.println("The array elements are: ");
        while (it.hasNext()){
            System.out.print(it.next() + " ");
        }
    }


    public static void main(String[] args) {
        System.out.println(ANSI_RED + "---- Code Challenge 1 ----" + ANSI_RESET);
        CodeChallenge();
    }
}

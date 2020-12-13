package code._4_student_effort._1_challenge;

public class Main {
    public static void main(String[] args) {
        // Task 1
        int [] arr = new int [] {1, 2, 3};

        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        System.out.println("=== Output for Challenge 1 ===");

        while ( it.hasNext() ) {
            System.out.println(it.next());
        }
    }
}

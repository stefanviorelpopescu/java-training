package code._4_student_effort._4_generic_iterator;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "---- Code Challenge 4 ----" + ANSI_RESET);

        Integer[] arr = new Integer[] {1,2,3};
        IArrayIterator<Integer> it = new ArrayIterator<>(arr);

        String[] arr2 = new String[] {"a,b,c"};
        IArrayIterator<String> it2 = new ArrayIterator<>(arr2);

        System.out.println(ANSI_RED + "String Iterator " + ANSI_RESET);
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println(ANSI_RED + "\nInteger Iterator " + ANSI_RESET);
        while (it2.hasNext()) {
            System.out.print(it2.next() + " ");
        }
    }
}

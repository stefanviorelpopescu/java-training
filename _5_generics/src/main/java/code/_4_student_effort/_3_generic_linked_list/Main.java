package code._4_student_effort._3_generic_linked_list;


public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "---- Code Challenge 3 ----" + ANSI_RESET);

        String rootValue = "a";
        GenericList<String> list = new GenericList<>(rootValue);

        for (int i = 0; i < 10; i++) {
           list.insert(String.valueOf(Character.valueOf( (char)(rootValue.charAt(0) + i) )));
        }


        Integer rootValue2 = 5;
        GenericList<Integer> list2 = new GenericList<>(rootValue2);

        for (int i = 0; i < 10; i++) {
            list2.insert(i);
        }

        System.out.println(ANSI_RED + "String Linked List " + ANSI_RESET);
        list.println();
        System.out.println(ANSI_RED + "\nInteger Linked List " + ANSI_RESET);
        list2.println();
    }
}

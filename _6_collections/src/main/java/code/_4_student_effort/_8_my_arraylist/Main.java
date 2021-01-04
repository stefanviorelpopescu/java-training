package code._4_student_effort._8_my_arraylist;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "----Code Challenge 8----" + ANSI_RESET );


        MyArrayList<Integer> myArrayList = new MyArrayListImpl<>();

        for(int i = 0; i < 10; i++) {
            myArrayList.add(i);
        }

        myArrayList.remove(4);

        myArrayList.set(4, 22);

        for(int i = 0; i < myArrayList.size() ; i++) {
            System.out.print(myArrayList.get(i) + " ");
        }
    }
}

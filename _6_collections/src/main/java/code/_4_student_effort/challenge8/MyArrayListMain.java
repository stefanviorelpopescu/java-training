package code._4_student_effort.challenge8;

public class MyArrayListMain {
    public static void main(String[] args) {
        MyArrayListImpl<Integer> list = new MyArrayListImpl<Integer>();

        for(int i = 0; i < 10; i++) {
            list.add(i);
        }

        list.set(0, 99);

        list.remove(5);
        System.out.println(list.get(7));
    }
}

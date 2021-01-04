package code._4_student_effort.challange7;

public class main {
    public static void main(String[] args) {

        MyHashTable<Integer, String> table = new MyHashTable<>();

        table.put(5, "eu");
        table.put(5, "tu");
        table.put(7, "eq");

        System.out.println(table.size());
        System.out.println(table);
    }
}

package code._4_student_effort._7_my_hashtable;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        System.out.println(ANSI_RED + "----Code Challenge 7----" + ANSI_RESET );


        MyHashTable<String,String> myHashTable = new MyHashTableImpl<>();
        myHashTable.put("key1", "value1");
        myHashTable.put("key2", "value2");
        myHashTable.put("key3", "value3");
        System.out.println(myHashTable.size());


        MyHashTable<Integer,Integer> mySecondHashTable = new MyHashTableImpl<>();
        mySecondHashTable.put(7,4);
        mySecondHashTable.put(9,3);
        mySecondHashTable.put(1,1);
        System.out.println(mySecondHashTable.size());
    }
}

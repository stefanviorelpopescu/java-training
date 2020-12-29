package code._4_student_effort.challenge7;


public class MyHashTableMain {
    public static void main(String[] args) {
        MyHashTable<String, String> myHashTable = new MyHashTableImpl<>(10);
        myHashTable.put("key1", "value1");
        myHashTable.put("key2", "value2");
        myHashTable.put("key3", "value3");
        myHashTable.put("231", "adasd");

        System.out.println(myHashTable.size()); //should print 4
    }
}

package code._4_student_effort.challenge7;

public class Element<K, V> {
    public K key;
    V value;

    Element<K, V> next;

    public Element(K key, V value) {
        this.key = key;
        this.value = value;
    }
}

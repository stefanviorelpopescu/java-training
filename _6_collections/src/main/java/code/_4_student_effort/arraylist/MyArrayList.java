package code._4_student_effort.arraylist;

public interface MyArrayList<T> {

    void add(T e);

    void remove(T e);

    T get (int index);

    void set(int index, T e);

    int size();
}

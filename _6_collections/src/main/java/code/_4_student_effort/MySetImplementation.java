package code._4_student_effort;

import java.util.Arrays;

public class MySetImplementation<T> implements MySet<T> {

    private Object[] arr = new Object[0];

    @Override
    public void add(T e) {
        if (!contains(e)) {
            this.arr = Arrays.copyOf(arr, arr.length + 1);
            this.arr[this.arr.length - 1] = e;
        }
    }

    @Override
    public void remove(T e) {

        Object[] newArray = new Object[0];
        for (Object currentElement : this.arr) {
            if (!currentElement.equals(e)) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = currentElement;
            }
        }
        this.arr = newArray;
    }

    @Override
    public T get(int index) {
        return (T) arr[index];
    }

    @Override
    public void set(int index, T e) {
        arr[index] = e;
    }

    @Override
    public int size() {
        return arr.length;
    }

    @Override
    public boolean contains(T e) {

        boolean result = false;
        for (Object o : this.arr) {
            if (o.equals(e)) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        MySetImplementation<String> mySet = new MySetImplementation<>();
        mySet.add("Challenge");
        mySet.add("8");
        System.out.println(mySet.size());
    }
}

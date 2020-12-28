package code._4_student_effort;

import java.util.Arrays;

public class ArrayList<T> implements MyArrayList<T> {

    private Object[] arr = new Object[0];

    @Override
    public void add(T e) {
        this.arr = Arrays.copyOf(arr, arr.length + 1);
        this.arr[this.arr.length - 1] = e;
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

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Challenge");
        arrayList.add(" 8 ");

        for(int i=0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i));
        }

        arrayList.remove(" 8 ");
        System.out.println("\nAfter removing an element:");
        for(int i=0; i<arrayList.size(); i++){
            System.out.print(arrayList.get(i));
        }
    }

}

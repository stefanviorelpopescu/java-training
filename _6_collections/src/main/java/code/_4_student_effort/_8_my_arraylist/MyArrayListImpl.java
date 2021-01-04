package code._4_student_effort._8_my_arraylist;

import java.util.Arrays;

public class MyArrayListImpl<T> implements MyArrayList<T>{
    Object[] arrayList = new Object[0];

    @Override
    public void add(T e) {
        this.arrayList = Arrays.copyOf(arrayList, arrayList.length +1);
        this.arrayList[this.arrayList.length - 1] = e;
    }

    @Override
    public void remove(T e) {
        Object[] newArrayList = new Object[0];
        for (Object currentObject : this.arrayList) {
            if (!currentObject.equals(e)) {
                newArrayList = Arrays.copyOf(newArrayList, newArrayList.length +1);
                newArrayList[newArrayList.length - 1] = currentObject;
            }
        }
        this.arrayList = newArrayList;
    }

    @Override
    public T get(int index) {
        return (T) this.arrayList[index];
    }

    @Override
    public void set(int index, T e) {
        this.arrayList[index] = e;
    }

    @Override
    public int size() {
        return arrayList.length;
    }
}

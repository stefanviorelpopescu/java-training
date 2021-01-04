package code._4_student_effort._9_myset;

import java.util.Arrays;

public class MySetImpl<T> implements MySet<T> {
    Object[] list = new Object[0];


    @Override
    public void add(T e) {
        if (!contains(e)) {
            this.list = Arrays.copyOf(list, list.length + 1);
            this.list[list.length - 1] = e;
        }
    }

    @Override
    public void remove(T e) {
        Object[] newList = new Object[0];
        for (Object currentObject : this.list) {
            if (!currentObject.equals(e)) {
                newList = Arrays.copyOf(newList, newList.length + 1);
                newList[newList.length - 1] = currentObject;
            }
        }
        this.list = newList;
    }

    @Override
    public T get(int index) {
        return (T) this.list[index];
    }

    @Override
    public void set(int index, T e) {
        if (!contains(e)) {
            this.list[index] = e;
        }
    }

    @Override
    public int size() {
        return this.list.length;
    }

    @Override
    public boolean contains(T e) {
        boolean containsResult = false;
        for (Object currentObject : this.list) {
            if (currentObject.equals(e)) {
                containsResult = true;
                break;
            }
        }
        return containsResult;
    }
}

package code._4_student_effort;

import java.util.Arrays;

public class MyArrayListImpl<T> implements MyArrayList<T> {
    private int arrayListCapacity = 1;
    private Object[] arrayList = new Object[arrayListCapacity];
    private int arrayListLength = 0;

    @Override
    public void add(T e) {
        // If capacity is reached, then the capacity of the arrayList is doubled
        if (this.arrayListLength == this.arrayListCapacity) {
            this.arrayListCapacity = this.arrayListLength * 2;
            this.arrayList = Arrays.copyOf(arrayList, arrayListCapacity);
        }
        this.arrayList[this.arrayListLength] = e;
        this.arrayListLength++;
    }

    @Override
    public void remove(T e) {
        int itemAppearance = countItemAppearance(e);

        if (itemAppearance > 0) {
            Object[] newArrayList = new Object[arrayListLength-itemAppearance];

            int newArrayListIndex = 0;
            for (int i = 0; i < arrayListLength; i++) {
                if (!arrayList[i].equals(e)) {
                    newArrayList[newArrayListIndex] = arrayList[i];
                    newArrayListIndex++;
                }
            }
            this.arrayListLength -= itemAppearance;
            this.arrayList = newArrayList;
        }
/*
        Object[] newArrayList = new Object[0];

        int deletedItemCounter = 0;
        for (int i = 0; i < arrayListLength; i++) {
            if (!arrayList[i].equals(e)) {
                newArrayList = Arrays.copyOf(newArrayList, newArrayList.length + 1);
                newArrayList[newArrayList.length - 1] = arrayList[i];
            } else {
                deletedItemCounter++;
            }
        }

        this.arrayListLength -= deletedItemCounter;
        this.arrayList = newArrayList;*/
    }

    private int countItemAppearance(T e) {
        int itemAppearance = 0;

        for (int i = 0; i < arrayListLength; i++) {
            if (arrayList[i].equals(e)) {
                itemAppearance++;
            }
        }

        return itemAppearance;
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
        return this.arrayListLength;
    }
}

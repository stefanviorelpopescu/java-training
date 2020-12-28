package code._4_student_effort;

import java.util.Arrays;

public class MySetImpl<T> implements  MySet<T>{
    private int listArrayCapacity = 1;
    private Object[] arrayList = new Object[listArrayCapacity];
    private int listArrayLength = 0;

    @Override
    public void add(T e) {
        if (!contains(e)) {
            // If capacity is reached, then the capacity of the arrayList is doubled
            if (this.listArrayLength == this.listArrayCapacity) {
                this.listArrayCapacity = this.listArrayLength * 2;
                this.arrayList = Arrays.copyOf(arrayList, listArrayCapacity);
            }
            this.arrayList[this.listArrayLength] = e;
            this.listArrayLength++;
        }
    }

    @Override
    public void remove(T e) {
        int itemAppearance = countItemAppearance(e);

        if (itemAppearance > 0) {
            Object[] newArrayList = new Object[listArrayLength -itemAppearance];

            int newArrayListIndex = 0;
            for (int i = 0; i < listArrayLength; i++) {
                if (!arrayList[i].equals(e)) {
                    newArrayList[newArrayListIndex] = arrayList[i];
                    newArrayListIndex++;
                }
            }
            this.listArrayLength -= itemAppearance;
            this.arrayList = newArrayList;
        }
    }

    private int countItemAppearance(T e) {
        int itemAppearance = 0;

        for (int i = 0; i < listArrayLength; i++) {
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
        if(!contains(e)) {
            this.arrayList[index] = e;
        }
    }

    @Override
    public int size() {
        return this.listArrayLength;
    }

    @Override
    public boolean contains(T e) {
        boolean result = false;

        for (Object o : this.arrayList) {
            if (o.equals(e)) {
                result = true;
                break;
            }
        }
        return result;
    }
}

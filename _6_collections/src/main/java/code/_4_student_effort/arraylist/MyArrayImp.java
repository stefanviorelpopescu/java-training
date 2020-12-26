package code._4_student_effort.arraylist;

import java.util.Arrays;

public class MyArrayImp<T> implements MyArrayList {

    private Object[] values = new Object[0];

    @Override
    public void add(Object e) {
        values = Arrays.copyOf(values, values.length + 1);
        values[values.length - 1] = e;
    }

    @Override
    public void remove(Object e) {
        Object[] newValues = new Object[0];
        for (Object currentElement : this.values) {
            if (!currentElement.equals(e)) {
                newValues = Arrays.copyOf(newValues, newValues.length + 1);
                newValues[newValues.length - 1] = currentElement;
            }
        }
        this.values = newValues;
    }

    @Override
    public Object get(int index) {
        return values[index];
    }

    @Override
    public void set(int index, Object e) {
        this.values[index] = e;
    }

    @Override
    public int size() {
        return values.length;
    }
}

package code._4_student_effort.Challenge3;

import java.util.LinkedList;
import java.util.List;

public class GenericList<T> implements IGenericList<T> {

    private List<T> list = new LinkedList<>();

    public GenericList(T element) {
        insert(element);
    }

    @Override
    public void insert(T element) {
        list.add(element);
    }

    @Override
    public void println() {
        for (T i : list) {
            System.out.println(i);
        }
    }
}

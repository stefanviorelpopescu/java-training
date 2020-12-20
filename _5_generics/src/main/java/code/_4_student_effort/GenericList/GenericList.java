package code._4_student_effort.GenericList;

import java.util.ArrayList;
import java.util.List;

public class GenericList<Object> {
    private Object value;
private List<Object> list=new ArrayList<>();
    public GenericList(Object value) {
        this.value = value;
        list.add(value);
    }

    public void println() {
        for(Object obj : list) {
            System.out.println(obj);
        }
    }

    public void insert(Object valueOf) {
        list.add(valueOf);
    }
}

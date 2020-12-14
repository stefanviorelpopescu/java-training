package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {
    List<Studentv2> list_stud= new ArrayList<Studentv2>();
    @Override
    public void register(Observer obj) {
        list_stud.add((Studentv2) obj);
    }

    @Override
    public void unregister(Observer obj) {
        list_stud.remove((Studentv2) obj);
    }

    @Override
    public void notifyObservers(String message) {
        for (int i = 0; i < list_stud.size(); i++)
            list_stud.get(i).update(message);
    }
    public void teach(String topic) {
        for (int i = 0; i < list_stud.size(); i++)
            list_stud.get(i).update(topic);

    }
}

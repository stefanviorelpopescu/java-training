package code._4_student_effort.challange_4;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject{
    private List<Student> clas = new ArrayList<>();

    @Override
    public void register(Observer obj) {
        clas.add((Student) obj);
    }

    @Override
    public void unregister(Observer obj) {
        clas.remove((obj));
    }

    @Override
    public void notifyObservers(String message) {
        for(Student s : clas){
            s.update("learned about " + message);
        }
    }
}

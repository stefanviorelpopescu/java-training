package code._4_student_effort;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Teacher implements  ObservedSubject{
    List<Observer> stud = new ArrayList<>();
    void teach(String s){
        for(Observer std : stud) {
            StudentCC4 student = (StudentCC4)std;
            System.out.println("Student " + student.name + " learned about " + s);
        }
    }

    @Override
    public void register(Observer obs){
        stud.add(obs);
    }

    @Override
    public void unregister(Observer obs){
        stud.remove(obs);
    }

    @Override
    public void notifyObservers(String message) {
        for (Iterator<Observer> it =
             stud.iterator(); it.hasNext();)
        {
            Observer o = it.next();
            o.update(message);
        }
    }

}

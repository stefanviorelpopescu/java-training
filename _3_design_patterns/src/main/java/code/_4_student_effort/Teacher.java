package code._4_student_effort;

import java.util.ArrayList;

import java.util.List;


public class Teacher implements ObservedSubject {
    List<Observer> observers= new ArrayList<Observer>();

    @Override
        public void register(Observer obj) {
        //this.observers = Arrays.copyOf(this.observers, this.observers.length + 1);
        //this.observers[this.observers.length - 1] = obj;
        observers.add(obj);

    }

    @Override
    public void unregister(Observer obj) {
//        int k = -1;
//        for (int i = 0; i < this.observers.length; i++) {
//            if (this.observers[i].equals(obj)) {
//                k = i;
//                break;
//            }
//        }
//        System.arraycopy(this.observers, k + 1, this.observers, k, this.observers.length - 1 - k);
        observers.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
//        for (int i = 0; i < this.observers.length; i++) {
//            this.observers[i].update(message);
//        }
        for (Observer o : observers) {
            o.update(message);
        }
    }

    public void teach(String topic){
//        for (int j = 0; j < this.observers.length; j++) {
//            this.observers[j].update(topic);
//        }
        notifyObservers(topic);
    }

}


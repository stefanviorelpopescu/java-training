package code._4_student_effort;

import java.util.Arrays;

public class Teacher implements ObservedSubject {

    private Observer[] observers = new Observer[0];

    @Override
    public void register(Observer obj) {
    this.observers = Arrays.copyOf(this.observers, this.observers.length + 1);
    this.observers[this.observers.length - 1] = obj;
    }

    @Override
    public void unregister(Observer obj) {
        int Index = 0;
    for(int i = 0; i < this.observers.length; i++){
        if (this.observers[i].equals(obj)){
            Index = i;
            break;
        }
    }
    System.arraycopy(this.observers, Index + 1, this.observers, Index, this.observers.length - 1 - Index);

    }

    @Override
    public void notifyObserver(String message) {
        for(int i = 0; i < this.observers.length; i++){
            this.observers[i].update(message);
        }
    }

    public void teach(String subject){
        for(int i = 0; i<this.observers.length; i++){
            this.observers[i].update(subject);
        }
    }
}

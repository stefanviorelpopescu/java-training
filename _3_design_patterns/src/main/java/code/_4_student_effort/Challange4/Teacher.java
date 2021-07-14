package code._4_student_effort.Challange4;

import java.util.Arrays;

public class Teacher implements ObservedSubject{

    private Observer[] observers = new Observer[0];

    public void teach(String topic)
    {
        for (int j = 0; j < this.observers.length; j++)
        {
            this.observers[j].update(topic);
        }
    }

   @Override
    public void register(Observer obj)
    {
        this.observers = Arrays.copyOf(this.observers, this.observers.length + 1);
        this.observers[this.observers.length - 1] = obj;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void unregister(Observer obj)
    {
        int removedIndex = -1;
        for (int i = 0; i < this.observers.length; i++)
        {
            if (this.observers[i].equals(obj))
            {
                removedIndex = i;
                break;
            }
        }
        System.arraycopy(this.observers, removedIndex + 1, this.observers, removedIndex, this.observers.length - 1 - removedIndex);

    }

    public void notifyObservers(String message)
    {
        for (int i = 0; i < this.observers.length; i++) {
            this.observers[i].update(message);
        }
    }
}

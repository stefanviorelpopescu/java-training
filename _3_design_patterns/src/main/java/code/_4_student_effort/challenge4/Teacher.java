package code._4_student_effort.challenge4;

public class Teacher implements ObservedSubject {
    private Observer[] observers = new Observer[0];

    @Override
    public void register(Observer obj) {
        Observer[] newObservers = new Observer[this.observers.length + 1];
        System.arraycopy(this.observers, 0, newObservers, 0, this.observers.length);
        this.observers = newObservers;
        this.observers[this.observers.length - 1] = obj;
    }

    @Override
    public void unregister(Observer obj) {
        int i;
        for (i = 0; i < this.observers.length; i++) {
            if(this.observers[i].equals(obj)) {
                break;
            }
        }

        System.arraycopy(this.observers, i+1, this.observers, i, this.observers.length - i - 1);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void teach(String topic) {
        notifyObservers(topic);
    }
}

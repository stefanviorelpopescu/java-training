package code._4_student_effort.observer;

public interface ObservedObject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers(String message);
}

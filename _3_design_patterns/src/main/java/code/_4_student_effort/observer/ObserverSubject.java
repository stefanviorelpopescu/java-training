package code._4_student_effort.observer;

public interface ObserverSubject {
    public  void register(Observer obj);
    public void unregister(Observer obj);
    public void  notifyObservers (String message);
}

package code._3_in_class;

public interface ObservedSubject {
    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers(String message);
}

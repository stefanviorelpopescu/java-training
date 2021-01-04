package Project;

public interface ObservedSubject<T> {

    void registerObserver(Observer<T> obj);

    void unregisterObserver(Observer<T> obj);

    void notifyObserver();
}

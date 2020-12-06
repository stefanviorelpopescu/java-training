package code._4_student_effort._4_challenge_observer_v2;

public interface ObservedSubject {
    void register (Observer obj);
    void unregister (Observer obj);
    void notifyObservers(String message);
}

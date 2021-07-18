package clean.code.design_patterns.requirements;

public interface ObservedInstruction{

    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObserver (String message);
}

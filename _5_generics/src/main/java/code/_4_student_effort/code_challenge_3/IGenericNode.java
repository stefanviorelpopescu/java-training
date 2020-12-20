package code._4_student_effort.code_challenge_3;

public interface IGenericNode<T> {
    T getValue();
    IGenericNode<T> getNext();
    void setNext(IGenericNode<T> next);

    void setValue(T rootValue);
}

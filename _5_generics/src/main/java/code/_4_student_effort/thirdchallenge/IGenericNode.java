package code._4_student_effort.thirdchallenge;

public interface IGenericNode<E> {

    E getValue();
    void setValue(E value);
    IGenericNode<E> getNext();
    void setNext(IGenericNode<E> next);
}

package code._4_student_effort.thirdchallenge;

public class GenericNode<E> implements IGenericNode<E> {

    private E value;
    private IGenericNode<E> urm;

    @Override
    public E getValue() {
        return this.value;
    }

    @Override
    public void setValue(E value) {
        this.value = value;
    }

    @Override
    public IGenericNode<E> getNext() {
        return this.urm;
    }

    @Override
    public void setNext(IGenericNode<E> urm) {
        this.urm = urm;
    }
}

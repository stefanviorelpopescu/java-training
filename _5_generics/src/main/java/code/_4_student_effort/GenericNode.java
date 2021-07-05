package code._4_student_effort;

public class GenericNode<T> implements IGenericNode<T> {
    private T data;
    private IGenericNode<T> next;

    @Override
    public T getValue() {
        return this.data;
    }

    @Override
    public void setValue(T value) {
        this.data = value;
        this.next = null;
    }

    @Override
    public IGenericNode<T> getNext() {
        return this.next;
    }

    @Override
    public void setNext(IGenericNode<T> next) {
        this.next = next;
    }
}

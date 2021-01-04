package code._4_student_effort;

public class GenericNode<N> implements IGenericNode<N>{

    private N node_value;
    private IGenericNode<N> next;

    @Override
    public N getValue() {
        return node_value;
    }

    @Override
    public void setValue(N value) {
    this.node_value=value;
    }

    @Override
    public IGenericNode<N> getNext() {
        return this.next;
    }

    @Override
    public void setNext(IGenericNode<N> next) {
    this.next=next;
    }
}

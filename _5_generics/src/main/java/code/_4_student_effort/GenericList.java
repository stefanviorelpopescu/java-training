package code._4_student_effort;

public class GenericList<T> implements IGenericList<T> {
    private IGenericNode<T> head;
    private IGenericNode<T> tail;

    public GenericList(T root) {
        this.head = new GenericNode<>();
        this.head.setValue(root);
        this.tail = head;
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> newNode = new GenericNode();
        newNode.setValue(element);
        this.tail.setNext(newNode);
        this.tail = newNode;
    }

    @Override
    public void println() {
        IGenericNode<T> node = this.head;

        while (node.getNext() != null) {
            node = node.getNext();

            System.out.print(node.getValue() + ", ");
        }
    }
}

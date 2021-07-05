package code._4_student_effort._3_challengeThree;

public class GenericList<T> implements IGenericList<T> {

    private IGenericNode<T> node;

    public GenericList(T nodeValue) {
        this.node = new GenericNode<>();
        this.node.setValue(nodeValue);
    }

    @Override
    public void insert(T piece) {
        IGenericNode<T> pointer = this.node;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
        }

        IGenericNode<T> newNode = new GenericNode<>();
        newNode.setValue(piece);
        pointer.setNext(newNode);
    }

    @Override
    public void println() {
        IGenericNode<T> pointer = this.node;
        while (pointer.getNext() != null) {
            pointer = pointer.getNext();
            System.out.println(pointer.getValue());
        }
    }
}

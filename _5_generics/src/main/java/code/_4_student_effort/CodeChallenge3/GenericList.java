package code._4_student_effort.CodeChallenge3;

public class GenericList<T> implements IGenericList<T> {

    IGenericNode<T> root;

    public GenericList(T root) {
        this.root = new GenericNode<>();
        this.root.setValue(root);
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> pointer = this.root;

        while(pointer.getNext() != null) {
            pointer = pointer.getNext();
        }

        IGenericNode<T> nodeToAdd = new GenericNode<>();
        nodeToAdd.setValue(element);
        pointer.setNext(nodeToAdd);
    }

    @Override
    public void println() {

        IGenericNode<T> pointer = this.root;
        while(pointer.getNext() != null) {
            pointer = pointer.getNext();
            System.out.print(" " + pointer.getValue());
        }
    }
}

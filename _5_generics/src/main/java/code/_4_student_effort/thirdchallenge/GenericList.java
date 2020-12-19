package code._4_student_effort.thirdchallenge;

public class GenericList<E> implements IGenericList<E>{

    IGenericNode<E> root;

    public GenericList() { }

    public GenericList(E root) {
        this.root = new GenericNode<>();
        this.root.setValue(root);
        this.root.setNext(null);
    }

    @Override
    public void insert(E element) {
        IGenericNode<E> node = new GenericNode<>();
        node.setValue(element);
        node.setNext(null);
        // getting the last element of the list
        IGenericNode<E> iterator = root;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
    }

    @Override
    public void println() {
        IGenericNode<E> iterator = root;
        while (iterator != null) {
            System.out.println(iterator.getValue());
            iterator = iterator.getNext();
        }
    }
}

package code._4_student_effort.challenge3;

public class GenericList<T> implements IGenericList<T> {

    private final GenericNode<T> rootNode;

    public GenericList(T rootvalue) {
        this.rootNode = new GenericNode<>();
        this.rootNode.setValue(rootvalue);
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> iterator = this.rootNode;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }

        GenericNode<T> newNode = new GenericNode<>();
        newNode.setValue(element);
        iterator.setNext(newNode);
    }

    @Override
    public void println() {
        IGenericNode<T> iterator = this.rootNode;
        while (iterator.getNext() != null) {
            System.out.println(iterator.getValue());
            iterator = iterator.getNext();
        }
    }

    // used for challenge 4 stage 2
    public GenericNode<T> getRootNode() {
        return rootNode;
    }
}

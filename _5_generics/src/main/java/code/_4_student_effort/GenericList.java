package code._4_student_effort;

public class GenericList<T> implements IGenericList<T> {
    private IGenericNode<T> head;
    private int size = 0;

    public GenericList(T rootValue) {
        if (rootValue == null) {
            return;
        }
        this.head = new GenericNode<>();
        this.head.setValue(rootValue);
        size++;
    }

    @Override
    public void insert(T element) {
        if (element == null) {
            return;
        }
        if (head == null) {
            this.head = new GenericNode<>();
            this.head.setValue(element);
            size++;
        } else {
            IGenericNode<T> checkList = this.head;
            while (checkList.getNext() != null) {
                checkList = checkList.getNext();
            }
            IGenericNode<T> newNode = new GenericNode<>();
            newNode.setValue(element);
            checkList.setNext(newNode);
            size++;
        }
    }

    @Override
    public void println() {
        IGenericNode<T> readList = this.head;
        while (readList.getNext() != null) {
            System.out.println(readList.getValue() + " ");
            readList = readList.getNext();
        }
        System.out.println(readList.getValue());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T[] getValues() {
        T[] arrayOfList = (T[]) new Object[size()];
        int i = 0;
        IGenericNode<T> readList = this.head;
        while (readList.getNext() != null) {
            arrayOfList[i++] = readList.getValue();
            readList = readList.getNext();
        }
        arrayOfList[i] = readList.getValue();
        return arrayOfList;
    }

}

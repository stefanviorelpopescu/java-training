package code._4_student_effort.generic_list;

public class GenericList<T> implements IGenericList<T> {

    private Node <T> root;

    public GenericList(T rootValue) {
        this.root = new Node <T>(rootValue);
    }

    public static void main(String []args){

        String rootValue = "a";
        GenericList<String> list = new GenericList<>(rootValue);
        for(int i = 1; i < 10; i++){
            list.insert(String.valueOf(Character.valueOf((char) (rootValue.charAt(0) + i))));
        }
        list.println();
    }

    @Override
    public void insert(T element) {
        Node<T> last = getLastNode();
        Node<T> newNode = new Node<>(element);
        last.setNext(newNode);
    }

    @Override
    public void println() {
        Node<T> current = this.root;

        while (current.getNext() != null){
            System.out.print(current.getValue() + ", ");
            current = current.getNext();
        }
        System.out.println();
    }

    private Node <T> getLastNode(){
        Node<T> current = this.root;

        while (current.getNext() != null){
            current = current.getNext();
        }
        return current;
    }
}

class Node<T> {

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    private T value;
   private Node <T> next;
}

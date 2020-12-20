package code._4_student_effort.code_challenge_3;


public class GenericList<T> implements IGenericList<T> {

    public IGenericNode<T> head;

    public GenericList(T rootValue){
        head = new GenericNode<>();
        head.setValue(rootValue);
    }

    @Override
    public void insert(T element) {
        IGenericNode<T> temp = new GenericNode<>();
        temp.setValue(element);
        temp.setNext(this.head);
        head = temp;
    }

    @Override
    public void println() {
        IGenericNode<T> temp = head;

        while(temp!= null) {
            System.out.println(temp.getValue());
            temp = (GenericNode<T>) temp.getNext();
        }
    }
}

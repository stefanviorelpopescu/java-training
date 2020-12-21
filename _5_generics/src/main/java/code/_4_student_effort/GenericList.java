package code._4_student_effort;

public class GenericList <T> implements IGenericList<T>{
    code._4_student_effort.GenericNode<T> root;
    public GenericList(T Value) {
        this.root = new code._4_student_effort.GenericNode<>();
        this.root.setValue(Value);
    }

    @Override
    public void insert(T element){
        code._4_student_effort.GenericNode<T> iterator = this.root;
        while(iterator.getnext() != null){
            iterator = iterator.next;
        }
        code._4_student_effort.GenericNode<T> newNode = new code._4_student_effort.GenericNode<>();
        newNode.setValue(element);
        iterator.setNext(newNode);
    }

    @Override
    public void println() {
        code._4_student_effort.GenericNode<T> iterator = this.root;
        while (iterator.getnext() != null) {
            iterator = iterator.getnext();
            System.out.println(iterator.getValue());
        }
    }
}

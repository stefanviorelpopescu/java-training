package code._4_student_effort;

public class GenericList<N> implements IGenericList<N> {

    private IGenericNode<N> root;

    public GenericList(N rootValue) {
        this.root = new GenericNode<>();
        this.root.setValue(rootValue);

    }

    @Override
    public void insert(N element) {
    IGenericNode<N> cursor=this.root;
    while(cursor.getNext()!=null){
        cursor=cursor.getNext();
    }
    IGenericNode<N> newNode= new GenericNode<>();
    newNode.setValue(element);
    cursor.setNext(newNode);


    }

    @Override
    public void println() {
        IGenericNode<N> cursor=this.root;
        while(cursor.getNext()!=null)
        {
            cursor=cursor.getNext();
            System.out.println(cursor.getValue());
        }
    }
}

package code._4_student_effort;

import code._2_challenge._3_generic_linked_list.IGenericNode;

public class GenericNode<T> {
    T value;
    GenericNode<T> next;
    T getValue(){
        return this.value;
    }
    void setValue(T value){
        this.value = value;
    }
    GenericNode<T> getnext(){
        return this.next;
    }
    void setNext(GenericNode<T> next) {
        this.next = next;
    }

}

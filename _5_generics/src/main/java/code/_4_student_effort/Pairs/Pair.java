package code._4_student_effort.Pairs;

public class Pair<Object extends Shoe> {
    private Object first;
    private Object second;
    public Pair(Object firstElement,Object secondElement){
        this.first=firstElement;
        this.second=secondElement;
        shoesMatch(firstElement,secondElement);
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }
    public void shoesMatch(Object shoe1,Object shoe2){
        if((shoe1.getSize() != shoe2.getSize())) {
            throw  new SizesDoNotMatch("Shoes sizes do not match");
        }else if(!(shoe1.getColor().equals(shoe2.getColor()))){
            throw new ColorsDoNotMatch("Shoes sizes do not match");
        }else{
            System.out.println("Shoes match");
        }



    }
}

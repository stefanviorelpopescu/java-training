package code._4_student_effort;

public class Pair<Object extends Shoe> {
    private Object first;
    private Object second;
    public Pair(Object firstElement, Object secondElement){
        first=firstElement;
        second=secondElement;
        match(firstElement,secondElement);
    }
    public Object getFirst(){
        return first;
    }
    public Object getSecond(){
        return second;
    }

    private void match(Object firstElement, Object secondElement) throws SizesDoNotMatchException {
        if(firstElement.getSize()!=secondElement.getSize()){
                throw new SizesDoNotMatchException("sizes do not match");
            }
        if(firstElement.getColor()!=secondElement.getColor()){
            throw new ColoursDoNotMatchException("colours do not match");
        }
    }

}

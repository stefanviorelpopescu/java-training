package code._4_student_effort;

public class Pair<R> {
    private Object first;
    private Object second;
    public <R>Pair(R firstElement, R secondElement){
        first = firstElement;
        second = secondElement;
    }
    public Object getFirst(){ return first; }
    public Object getSecond(){ return second; }
}

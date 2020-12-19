package code._4_student_effort.secondchallenge;

public class Pair<E extends Shoe> {

    private Object first;
    private Object second;

    public Pair(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }
}

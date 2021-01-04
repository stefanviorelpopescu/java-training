package code._4_student_effort;

public class Pair<T extends Shoe> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
        check(first, second);
    }

    private void check(T first, T second) {
    if(first.getSize()!=second.getSize())
        throw new SizesDoNotMatchException("size is not equal");
    if(!first.getColor().equals(second.getColor()))
        throw new ColorsDoNotMatchException("color is not the same");
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

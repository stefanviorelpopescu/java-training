package code._4_student_effort;

import code._2_challenge._2_pairs.SizesDoNotMatchException;

public class Pair<T extends Shoe> {
    private T first;
    private T second;
    public Pair(T first, T second){
        this.first = first;
        this.second = second;
        match(first, second);
    }

    private void match(T first, T second) {
        if (first.getSize() != second.getSize()) {
            throw new SizesDoNotMatchException("sizes do not match");
        }
        if (!first.getColor().equals(second.getColor())) {
            throw new SizesDoNotMatchException("colors do not match");
        }
    }

    public T getFirst(){ return first;}
    public T getSecond(){ return second;}
}

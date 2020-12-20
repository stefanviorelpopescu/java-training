package code._4_student_effort.code_challenge_2;

public class Pair<T extends Shoe> {
    private T first;
    private T second;

    public Pair(T firstElement, T secondElement) {
        this.first = firstElement;
        this.second = secondElement;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

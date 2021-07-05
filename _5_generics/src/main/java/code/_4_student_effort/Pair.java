package code._4_student_effort;

public class Pair<T extends Shoe> {
    private final T first;
    private final T second;

    public Pair(T firstElement, T secondElement) {
        first = firstElement;
        second = secondElement;
        matchPair(firstElement, secondElement);
    }

    private void matchPair(T firstElement, T secondElement) {
        // If one of the comparison is flagged the pair is not compatible
        // but if the pairs are compatible then a message is displayed
        int flagged = 0;
        if (!firstElement.getColor().equals(secondElement.getColor())) {
            flagged = 1;
            throw new ColorsDoNotMatchException("Color does not match!");
        }
        if (!firstElement.getSize().equals(secondElement.getSize())) {
            flagged = 1;
            throw new SizeDoNotMatchException("Size does not match!");
        }
        if (flagged == 0) {
            System.out.println("Pairs are compatible.");
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

}

package code._4_student_effort._2_challengeTwo;

public class Pair <S extends Shoe> {
    private S first;
    private S second;

    public Pair(S firstElement, S secondElement) throws Exception {
        first = firstElement;
        second = secondElement;
        fit(firstElement, secondElement);
    }

    private void fit (S firstElement, S secondElement) throws Exception {
        if (firstElement.getSize() != secondElement.getSize()) {
            throw new Exception("Sizes do not fit!");
        }
        if (!firstElement.getColor().equals(secondElement.getColor())) {
            throw new Exception("Colors do not fit!");
        }
    }

    public S getFirst() {
        return first;
    }
    public S getSecond() {
        return second;
    }
}

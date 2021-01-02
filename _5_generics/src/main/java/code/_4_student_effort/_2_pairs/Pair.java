package code._4_student_effort._2_pairs;

public class Pair <S extends Shoe>  {
     S first;
     S second;

    public Pair(S firstElement, S secondElement) {
        first = firstElement;
        second = secondElement;
        match(firstElement, secondElement);
    }

    public void match (S firstElement, S secondElement) {
        if (!firstElement.getSize().equals(secondElement.getSize())) {
            throw new SizesDoNotMatchException("Size mismatch.");
        }

        if (!firstElement.getColor().equals(secondElement.getColor())) {
            throw new ColorsDoNotMatchException("Color mismatch.");
        }
    }

    public S getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

}

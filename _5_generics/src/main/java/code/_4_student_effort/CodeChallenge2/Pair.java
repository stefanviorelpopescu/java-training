package code._4_student_effort.CodeChallenge2;

public class Pair<T extends Shoe> {

    private T first;
    private T second;

    public Pair(T firstElement, T secondElement) throws SizesDoNotMatchException, ColorsDoNotMatchException {

        if(firstElement.size != secondElement.size) {
            throw new SizesDoNotMatchException("Sizes do not match");
        }

        if(!firstElement.color.equals(secondElement.color)) {
            throw  new ColorsDoNotMatchException("Colors do not match");
        }

        first = firstElement;
        second = secondElement;
    }

    public Object getFirst() {
        return first;
    }

    public Object getSecond() {
        return second;
    }

}

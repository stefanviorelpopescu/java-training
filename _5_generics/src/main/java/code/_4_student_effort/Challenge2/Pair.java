package code._4_student_effort.Challenge2;

public class Pair<T extends Shoe> {

    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;

        try {
            match(first,second);
        } catch (ColorsDoNotMatchException | SizesDoNotMatchException e) {
            e.printStackTrace();
        }
    }

    public void match(T firstOne, T secondOne) throws ColorsDoNotMatchException, SizesDoNotMatchException {
        if (!firstOne.getColor().toLowerCase().equals(secondOne.getColor().toLowerCase())) {
            throw new ColorsDoNotMatchException("colors doesnt match");
        }

        if (firstOne.getSize() != secondOne.getSize()) {
            throw new SizesDoNotMatchException("size doesnt match");
        }
    }
}

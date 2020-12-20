package code._4_student_effort;

import java.io.IOException;

public class Pair <T extends Shoe> {
    private T first;
    private T second;

    public Pair(T firstELement, T secondElement) {
        first = firstELement;
        second = secondElement;
        /*try {
            checkMatching(firstELement, secondElement);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        checkMatching(firstELement, secondElement);
    }

    private void checkMatching(T firstElement, T secondElement) { // throws IOException
        if (!firstElement.getColour().equals(secondElement.getColour())) {
            //throw new IOException("Colours are not matching!");
            throw new ColoursDoNotMatchException("Colours are not matching!");
        }

        if (firstElement.getSize() != secondElement.getSize()) {
            //throw new IOException("Sizes are not matching");
            throw new SizesDoNotMatchException("Sizes are not matching!");
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

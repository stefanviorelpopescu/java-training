package code._4_student_effort.challenge2;

class Pair<FootWear extends Shoe> {
    private final FootWear first;
    private final FootWear second;

    public Pair(FootWear firstElement, FootWear secondElement) {
        first = firstElement;
        second = secondElement;
        checkMatch(firstElement, secondElement);
    }

    private void checkMatch(FootWear firstElement, FootWear secondElement) {
        if (firstElement.getSize() != secondElement.getSize()) {
            throw new SizesDoNotMatchException("Sizes do not match");
        }
        if (!firstElement.getColor().equals(secondElement.getColor())) {
            throw new ColorsDoNotMatchException("Colors do not match");
        }
    }

    public FootWear getFirst() {
        return first;
    }

    public FootWear getSecond() {
        return second;
    }
}
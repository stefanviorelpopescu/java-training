package code._3_in_class;

public class AscBubbleSort extends TemplateMethodBubbleSort {
    @Override
    public boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i1 > i2;
    }
}

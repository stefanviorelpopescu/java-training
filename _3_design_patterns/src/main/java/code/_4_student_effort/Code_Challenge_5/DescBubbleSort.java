package code._4_student_effort.Code_Challenge_5;

public class DescBubbleSort extends TemplateMethodBubbleSort {
    @Override
    boolean inCorrectOrder(Integer i1, Integer i2) {
        return i2>i1;
    }
}

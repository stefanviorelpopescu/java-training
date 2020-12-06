package code._4_student_effort.Code_Challenge_5;

public class AscBubbleSort extends TemplateMethodBubbleSort {
    @Override
    boolean inCorrectOrder(Integer i1, Integer i2) {
        return i1>i2;
    }
}

package code._4_student_effort.template_method;

public class AscSort extends TemplateMethodBubleSort {
    @Override
    public boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        return i1.compareTo(i2) < 0;

    }
}

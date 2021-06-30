package code._4_student_effort.template_method;

public class AscBubbleSort extends TemplateBubbleSort{

    @Override
    boolean numbersInCorrectOrder(Integer i1, Integer i2) {
        if(i1 < i2){
            return true;
        } else if(i1 > i2){
            return false;
        }
        return false;
    }
}

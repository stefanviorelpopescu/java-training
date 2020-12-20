package code._4_student_effort;

public class DescBubbleSort extends TemplateMethodBubbleSort{
    @Override
    public boolean numberInCorrectOrder(int x,int y){
        if(x>y){
            return true;
        }
        else{
            return false;
        }
    }
}
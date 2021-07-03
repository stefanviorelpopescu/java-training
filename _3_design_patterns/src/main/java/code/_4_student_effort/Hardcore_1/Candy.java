package code._4_student_effort.Hardcore_1;

public class Candy extends TreeDecorator{

    public Candy(DecorativeTree tree,int rowInTree){
        super(tree, rowInTree);
    }

    @Override
    public String typeOfDecoration(){
        return "C";
    }
}

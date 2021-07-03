package code._4_student_effort.Hardcore_1;

public class Bulbs extends TreeDecorator{

    public Bulbs(DecorativeTree tree,int rowInTree){
        super(tree, rowInTree);
    }

    @Override
    public String typeOfDecoration(){
        return "B";
    }
}

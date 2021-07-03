package code._4_student_effort.Hardcore_1;

public class Garland extends TreeDecorator{

    public Garland(DecorativeTree tree,int rowInTree){
        super(tree,rowInTree);
    }

    @Override
    public String typeOfDecoration(){
        return "G";
    }
}

package code._4_student_effort.hardchallenge_1_decorations;

public class Candy extends Decorations {
    public Candy(Integer positionInTree, DecorableTree tree) {
        super(positionInTree, tree);
    }


    String getDecorations() {
        return "C";
    }

}

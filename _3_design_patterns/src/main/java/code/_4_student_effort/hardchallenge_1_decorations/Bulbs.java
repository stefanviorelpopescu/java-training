package code._4_student_effort.hardchallenge_1_decorations;

public class Bulbs extends Decorations {
    public Bulbs(Integer positionInTree, DecorableTree tree) {
       super(positionInTree, tree);
    }


    String getDecorations() {
        return "B";
    }
}

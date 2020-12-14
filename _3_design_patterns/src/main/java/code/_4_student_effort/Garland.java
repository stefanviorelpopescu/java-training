package code._4_student_effort;

public class Garland extends Decoration{
    public Garland(int positionInTree, DecorableTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    @Override
    public String getDecoration() {
        return "G";
    }
}

package code._4_student_effort;

public class Candy extends Decoration{
    public Candy(int positionInTree, DecorableTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    @Override
    public String getDecoration() {
        return "C";
    }
}

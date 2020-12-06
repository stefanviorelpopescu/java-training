package code._4_student_effort.HardChallenge1;

public class Candy extends Decoration{

    public Candy(int positionInTree, DecorableTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    @Override
    public String getDecoration() {
        return "C";
    }
}

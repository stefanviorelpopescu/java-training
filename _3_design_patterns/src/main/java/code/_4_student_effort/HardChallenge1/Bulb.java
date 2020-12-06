package code._4_student_effort.HardChallenge1;

public class Bulb extends  Decoration{

    public Bulb(int positionInTree, DecorableTree christmasTree) {
        super(positionInTree, christmasTree);
    }

    @Override
    public String getDecoration() {
        return "B";
    }


}

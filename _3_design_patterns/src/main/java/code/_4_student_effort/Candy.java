package code._4_student_effort;

public class Candy extends Decoration {
    public Candy(int position, DecorableTree christmasTree) {
        super(position, christmasTree);
    }

    @Override
    public String getDecoration() {
        return "C";
    }
}

package code._4_student_effort;

public class Bulb extends Decoration{
    public Bulb(int position, DecorableTree christmasTree) {
        super(position,christmasTree);
    }

    @Override
    public String getDecoration() {
        return "B";
    }
}

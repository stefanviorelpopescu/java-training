package code._4_student_effort;

public class Garland extends Decoration {


    public Garland(int position, DecorableTree christmasTree) {
        super(position, christmasTree);
    }

    @Override
    public String chooseDecoration() {
        return "G";
    }
}

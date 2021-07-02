package code._4_student_effort;

public class Spider extends Animal{

    protected Spider() {
        super(8);
    }

    @Override
    protected void eat() {
        System.out.println("Spider eats bugs");
    }
}

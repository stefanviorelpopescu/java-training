package code._4_student_effort;

public class Spider extends Animal {

    public Spider() {
        // default constr that calls the superclass constr to spec
        // that all spiders have 8 legs
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider is eating");
    }
}

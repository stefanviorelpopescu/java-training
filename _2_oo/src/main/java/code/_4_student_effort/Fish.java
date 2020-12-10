package code._4_student_effort;

public class Fish extends Animal implements Pet{

    protected String name;

    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("tiny crumbs?");
    }

    public void walk() {
        System.out.println("fish swim.");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("blop");
    }
}

package code._4_student_effort;

public class Fish extends Animal implements Pet{
    String name;

    protected Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("Fish swim in the water.");
    }

    @Override
    public void eat() {
        System.out.println("Fish like to eat corn.");
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
        System.out.println("Fish like to play in water.");
    }

    public void superWalk() {
        super.walk();
    }

}

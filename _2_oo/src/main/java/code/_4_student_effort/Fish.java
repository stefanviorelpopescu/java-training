package code._4_student_effort;

public class Fish extends Animal implements Pet{

    private String name;

    protected Fish() {
        super(0);
    }

    public void walk(){
        System.out.println("Fish can not walk!!!! They do not have legs!!!!");
    }
    @Override
    protected void eat() {
        System.out.println("Fish eats fishfood and small animals living in water");
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
        System.out.println("You played with the fish");
    }
}

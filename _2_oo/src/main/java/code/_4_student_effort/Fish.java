package code._4_student_effort;

public class Fish extends Animal implements Pet{
String name;

    public Fish() {
        super(0);
        this.name = "fish";
    }

    @Override
    void eat() {
        System.out.println("I like to eat other fish");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
    this.name=name;
    }

    @Override
    public void play() {
        System.out.println("I don't like to play");
    }

    @Override
    public void walk() {
        System.out.println("I can't walk because I don't have legs");
    }
}

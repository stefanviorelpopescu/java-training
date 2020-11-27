package code._4_student_effort.challenge3;

public class Fish extends Animal implements Pet{
    public String name;

    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("fish is eating");
    }

    @Override
    public void walk() {
        System.out.println("fish cannot walk");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("fish playing method");
    }
}

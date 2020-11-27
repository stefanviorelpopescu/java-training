package code._4_student_effort;

public class Fish extends Animal implements Pet{
    String name;

    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        if (name == null) {
            System.out.println("Our fish is eating!!");
        } else {
            System.out.println("Our fish(" + name + ") is eating!!");
        }
    }

    @Override
    public void walk() {
        if (name == null) {
            System.out.println("The fish can't walk!!");
        } else {
            System.out.println("The fish " + name + " can't walk!!");
        }
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
        if (name == null) {
            System.out.println("The fish is playing!!");
        } else {
            System.out.println("The fish" + name + " is playing!!");
        }
    }
}

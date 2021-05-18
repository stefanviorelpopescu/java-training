package code._4_student_effort.Challenge3;

public class Fish extends Animal implements Pet {
    public String name;

    public Fish(String name) {
        super(0);
        this.name = name;
    }

    public Fish() {
        super(0);
    }

    @Override
    protected void walk() {
        System.out.println("The fish can't walk");
    }

    @Override
    protected void eat() {
        System.out.println("The fish eats insects, larvaes and crustaceans.");
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
        System.out.println("Play with fish");
    }
    // Polymophism
    @Override
    protected void animalSound() {
        System.out.println("The Fish doesn't make a sound");
    }
}

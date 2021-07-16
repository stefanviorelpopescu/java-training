package code._4_student_effort.Challenge3;

public class Cat extends Animal implements Pet {
    public String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    protected void eat() {
        System.out.println("The cat eats milk");
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
        System.out.println("Pet this cat");
    }

    // Polymophism
    @Override
    protected void animalSound() {
        System.out.println("The cat meows");
    }
}

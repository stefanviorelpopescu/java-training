package code._4_student_effort.challenge_3;

public class Cat extends Animal implements Pet{
    private String name;

    public Cat() {
        this("");
    }

    public Cat(String name) {
        super(4);
        this.name = name;
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
        System.out.println("Cat is playing.");
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating.");
    }
}

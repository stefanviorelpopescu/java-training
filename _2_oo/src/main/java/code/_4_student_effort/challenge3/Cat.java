package code._4_student_effort.challenge3;

public class Cat extends Animal implements Pet{
    protected String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat() {
        this("");
    }

    @Override
    protected void eat() {
        System.out.println("Cat is eating.");
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
        System.out.println("Cat is playing");
    }
}

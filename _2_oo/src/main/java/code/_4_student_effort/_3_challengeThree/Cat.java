package code._4_student_effort._3_challengeThree;

public class Cat extends Animal implements Pet{
    private String name;

    protected Cat(int legs) {
        super(legs);
    }

    protected Cat(String name) {
        super(4);
        this.name = name;
    }

    protected Cat() {
        this("");
    }

    @Override
    public void eat() {
        System.out.println("Cat called " + name + " is now eating.");
    }

    public void eat(String food) {
        System.out.println("Cat is eating: " + food + ".");
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
        System.out.println("Cat called " + name + " is now playing.");
    }
}

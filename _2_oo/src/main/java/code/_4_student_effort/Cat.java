package code._4_student_effort;

public class Cat extends Animal implements Pet{

    private String name;

    protected Cat(String name) {
        super(4);
        this.name = name;
    }

    protected Cat(){
        this("");
    }

    @Override
    protected void eat() {
        System.out.println("Cat eats catfood and mice");
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
        System.out.println("You played with the cat");
    }
}

package code._4_student_effort;

public class Fish extends Animal implements Pet{

    private String name;

    public Fish(){
        super(0);
    }


    @Override
    public void eat() {
        System.out.println("The fish eats worms");
    }

    @Override
    public String getName() {
        return "This fish is called " + this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The fish is happy");
    }

    @Override
    public void walk(){
        System.out.println("A fish can't walk 'cause it has no legs");
    }
}

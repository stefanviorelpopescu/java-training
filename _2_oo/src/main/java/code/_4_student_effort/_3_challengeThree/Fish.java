package code._4_student_effort._3_challengeThree;

public class Fish extends Animal implements Pet{
    private String name;

    protected Fish(int legs) {
        super(0);
    }

    protected Fish() {
        super();
    }

    @Override
    public void walk () {
        System.out.println("Fishes cannot walk because they don't have legs.");
    }

    @Override
    public void eat() {
        System.out.println("The fish is now eating.");
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
        System.out.println("The fish is now playing.");
    }
}

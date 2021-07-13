package code._4_student_effort.CodeChallengeThree;

public class Fish extends Animal implements Pet{
    private String name;
    public Fish(){
        super(0);
    }
    @Override
    public void eat() {
        System.out.println("the fish has a soufle of algae");
    }

    @Override
    public void Walk() {
        System.out.println("The fish can't walk");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("Sorry but I don't know how fish plays, maybe with bubbles?");
    }
}

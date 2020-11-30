package code._4_student_effort.animalHierarchy;

public class Fish extends Animal implements Pet{
    private String name;

    public Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish eat method");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("FIsh play method");
    }

    public void walk(){
        System.out.println("fish can't walk");
    }
}

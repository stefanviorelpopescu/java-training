package code._4_student_effort.animal_hierarchy;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
        this.name = "";
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void SetName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish is playing");
    }

    @Override
    public void walk() {
        System.out.println("Fish cannot walk");
    }
}

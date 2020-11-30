package code._4_student_effort;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
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
        System.out.println("Fish is playing with other livings from tank");
    }

    @Override
    public void walk() {
        System.out.println("Fish cannot walk. It has no legs");
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating microorganisms from water");
    }
}

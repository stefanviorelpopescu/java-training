package code._4_student_effort.animal;

public class Fish extends Animal implements Pet {

    String name;

    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("The animal fish is eating " + name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("The animal fish is playing " + name);
    }

    @Override
    public void walk() {
        System.out.println("The fish can't walk");
    }
}

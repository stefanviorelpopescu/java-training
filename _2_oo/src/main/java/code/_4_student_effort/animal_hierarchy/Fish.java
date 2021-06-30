package main.java.code._4_student_effort.animal_hierarchy;

public class Fish extends Animal implements Pet{
    private String name = "Nemo";

    public Fish(){
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish eat fish food.");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk. They swim.");
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
        System.out.println("Fish play with other fish.");
    }
}

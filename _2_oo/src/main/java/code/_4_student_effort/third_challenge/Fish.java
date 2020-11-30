package third_challenge;

public class Fish extends Animal implements Pet {

    String name;

    public Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("The fish cannot walk");
    }

    @Override
    public void eat() {
        System.out.println("I think the fish is eating, i honestly cannot tell");
    }

    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Idk how a fish is supposed to play");
    }
}

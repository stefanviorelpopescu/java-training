package third_challenge;

public class Cat extends Animal implements Pet {

    String name;

    public Cat() {
        this("");
    }

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void play() {
        System.out.println("The cat is so cute while playing");
    }
}

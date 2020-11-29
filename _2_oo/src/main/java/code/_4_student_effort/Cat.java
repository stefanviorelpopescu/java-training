package code._4_student_effort;

public class Cat extends Animal implements Pet{

    private String name;

    public Cat() {
        this(null);
    }

    public Cat(String name) {
        super(4);
        this.name = name;
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
        if (name == null) {
            System.out.println("The Cat without name is playing");
        } else {
            System.out.println(name + " is playing");
        }
    }

    @Override
    public void eat() {
        if (name == null) {
            System.out.println("The Cat without name is eating");
        } else {
            System.out.println(name + " is eating");
        }
    }
}

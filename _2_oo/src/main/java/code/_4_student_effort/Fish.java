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
        if (name == null) {
            System.out.println("The fish without name is playing");
        } else {
            System.out.println(name + " is playing");
        }
    }

    @Override
    public void walk() {
        System.out.println("Fish cant walk and dont have legs");
    }

    @Override
    public void eat() {
        if (name == null) {
            System.out.println("The fish without name is eating");
        } else {
            System.out.println(name + " is eating");
        }
    }
}

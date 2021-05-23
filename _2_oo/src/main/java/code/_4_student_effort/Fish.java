package code._4_student_effort;

public class Fish extends Animal implements Pet{
    private String petName;
//contructor
    public Fish() {

        super(0);
    }

    //overriding Animal methods
    @Override
    public void play() {
        System.out.println("Fish named " +petName + "is playing");
    }
    @Override
    public void walk() {
        System.out.println("Fish named " +petName + "can't walk");
    }
    @Override
    public void eat() {

        System.out.println("Fish named " +petName + " is eating");
    }

    @Override
    public String getName() {

        return this.petName;
    }
    public void setName(String petName) {

        this.petName = petName;
    }
    }


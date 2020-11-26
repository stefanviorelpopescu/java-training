package code._4_student_effort;

public class Cat extends Animal implements Pet {
   public Cat(Integer legs) {
        super(legs);
    }

    String petName;

    public Cat(String petName) {
        super(4);
        this.petName = petName;
    }

    public Cat() {
        this(4);
        this.petName=" ";
    }

    @Override
    public void getName() {

    }

    @Override
    public void setName(String name) {
        System.out.println("The name of this cat is: "+name);
    }

    @Override
    public void play() {
        System.out.println("Cats love playing hide-and-seek with their toys.");
    }

    @Override
    void eat() {
        System.out.println("Cats eat fish.");
    }
}




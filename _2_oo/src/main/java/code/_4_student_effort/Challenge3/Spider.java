package code._4_student_effort.Challenge3;

public class Spider extends Animal {

    public Spider() {
        super(8);
    }

    @Override
    protected void eat() {
        System.out.println("The spider eats insects");
    }

    // Polymophism
    @Override
    protected void animalSound() {
        System.out.println("The Spider doesn't make a sound");
    }
}

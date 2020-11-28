package code._4_student_effort;

public class Fish extends Animal{

    public Fish() {
        super(0);
    }

    @Override
    void walk() {
        System.out.println("Fish cannot walk because they have no legs");
    }

    @Override
    void eat() {
        System.out.println("Fish eats sea-food");
    }
}

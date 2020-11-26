package code._4_student_effort;

public class Fish extends Animal{

    public Fish() {
        super(0);
        //legs=0;
        System.out.println("Fish don't have legs.");
    }

    @Override
    void eat() {
        System.out.println("Fish eat worms.");
    }

    @Override
    public void walk() {
        super.walk();
        System.out.println("Fish can't walk.");
    }


}

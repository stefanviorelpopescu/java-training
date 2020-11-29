package code._4_student_effort;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("The Animal is walking on " + legs + " legs");
    }

    public abstract void eat();
}

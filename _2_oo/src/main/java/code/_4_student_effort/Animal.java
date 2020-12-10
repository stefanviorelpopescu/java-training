package code._4_student_effort;

public abstract class Animal {

    protected Integer legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("The animal walk on all " + legs + "of their legs.");
    }
}

package code._4_student_effort.challenge3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("animal walks on  " + legs + " legs");
    }
}

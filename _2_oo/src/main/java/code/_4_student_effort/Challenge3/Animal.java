package code._4_student_effort.Challenge3;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs) {
        this.legs = legs;
    }
    protected abstract void eat();
    protected void walk() {
        System.out.println("The animal walks in " + legs + " legs");
    }

    // Polymophism
    protected void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

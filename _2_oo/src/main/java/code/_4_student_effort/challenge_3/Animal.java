package code._4_student_effort.challenge_3;

public abstract class Animal {
    protected Integer legs;

    protected Animal(Integer legs) {
        this.legs = legs;
    }

    protected abstract void eat();

    protected void walk() {
        System.out.println("Animals with " + legs + " legs can walk.");
    }
}

package code._4_student_effort;

public abstract class Animal {
    int legs;

    Animal(int legs) {
        this.legs = legs;
    }

    public void walk() {
        System.out.println("This animal walks using " + this.legs + " legs");
    }

    public abstract void eat();
}

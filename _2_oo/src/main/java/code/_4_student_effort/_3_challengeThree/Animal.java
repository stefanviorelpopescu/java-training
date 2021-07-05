package code._4_student_effort._3_challengeThree;

public abstract class Animal {

    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public Animal() {

    }

    public abstract void eat();

    public void walk () {
        System.out.println("Animal having " + legs + " legs is walking now.");
    }
}

package code._4_student_effort;

public abstract class Animal {
    protected Integer legs;

    public Animal(Integer legs) {
        this.legs = legs;
    }

    abstract void eat();

    public void walk(){
        System.out.println("The animals that have 4 legs can jump very fast.");
    }



}

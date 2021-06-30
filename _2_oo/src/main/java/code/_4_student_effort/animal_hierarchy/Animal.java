package main.java.code._4_student_effort.animal_hierarchy;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }

    public abstract void eat();
    public void walk(){
        System.out.println("This animal can walk on " + this.legs + " legs.");
    }
}

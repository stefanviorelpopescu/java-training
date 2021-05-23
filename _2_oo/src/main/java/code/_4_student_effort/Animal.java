package code._4_student_effort;

public abstract class Animal {
    protected int legs;

    //protected constructor
    protected Animal(int legs){
        this.legs=legs;
    }
    //abstract method
    public abstract void eat();
    //concrete method
    public void walk(){
        System.out.println("The animal walks on " + this.legs + "legs");
    }
}
